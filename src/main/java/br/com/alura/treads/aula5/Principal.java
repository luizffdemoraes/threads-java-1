package br.com.alura.treads.aula5;


import br.com.alura.treads.aula3.Banheiro;
import br.com.alura.treads.aula3.TarefaNumero1;
import br.com.alura.treads.aula3.TarefaNumero2;

public class Principal {
    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");

        convidado1.start();
        convidado2.start();
    }
}
