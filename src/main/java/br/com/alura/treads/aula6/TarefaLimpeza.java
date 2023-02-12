package br.com.alura.treads.aula6;

import br.com.alura.treads.aula3.Banheiro;

public class TarefaLimpeza implements Runnable {

    private Banheiro banheiro;

    public TarefaLimpeza(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    public void run() {
        this.banheiro.limpa();
    }
}