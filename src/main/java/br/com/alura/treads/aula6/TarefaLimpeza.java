package br.com.alura.treads.aula6;

import br.com.alura.treads.aula3.Banheiro;

public class TarefaLimpeza implements Runnable {

    private Banheiro banheiro;

    public TarefaLimpeza(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        while(true) {
            this.banheiro.limpa();
            try {
                Thread.sleep(15000);//limpando cada 15s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
