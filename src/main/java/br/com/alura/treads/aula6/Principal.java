package br.com.alura.treads.aula6;

import br.com.alura.treads.aula4.Lista;
import br.com.alura.treads.aula4.TarefaAdicionarElemento;

import java.util.List;

public class Principal {

    public static void main(String[] args) throws InterruptedException {

        Lista lista = new Lista();

        for (int i = 0; i < 10; i++) {
            new Thread(new TarefaAdicionarElemento((List<String>) lista, i)).start();
        }

        new Thread(new TarefaImprimir(lista)).start();
    }
}