package br.com.alura;

public class RespostaMain {

    public static void main(String[] args) {
        Runnable tarefa = new ImprimeString();
        Thread thread = new Thread(tarefa);
        thread.start();
    }
}
