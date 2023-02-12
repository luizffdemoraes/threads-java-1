package br.com.alura.treads.aula5;


import br.com.alura.treads.aula3.Banheiro;
import br.com.alura.treads.aula3.TarefaNumero1;
import br.com.alura.treads.aula3.TarefaNumero2;
import br.com.alura.treads.aula6.TarefaLimpeza;

public class Principal {
    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");

        //outros threads omitidos
        Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Limpeza");

        convidado1.start();
        convidado2.start();

        //inicialização dos outros threads omitida
        limpeza.start();
        limpeza.setDaemon(true);
    }
}
