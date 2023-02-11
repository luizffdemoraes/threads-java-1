package br.com.alura.treads.aula4;

public class TarefaAdicionarElemento implements Runnable {

    private final int numeroDoThread;
    private Lista lista;

    public TarefaAdicionarElemento(Lista lista, int numeroDoThread) {
        this.lista = lista;
        this.numeroDoThread = numeroDoThread;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            lista.adicionaElementos(" " + i);
        }
    }
}