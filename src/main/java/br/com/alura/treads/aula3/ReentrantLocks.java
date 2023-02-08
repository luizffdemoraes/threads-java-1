package br.com.alura.treads.aula3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocks {

    private Lock lock = new ReentrantLock();

    public void fazNumero1() {

        lock.lock();
        System.out.println("entrando no banheiro");
        System.out.println("fazendo coisa rapida");

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("dando descarga");
        System.out.println("lavando a mao");
        System.out.println("saindo do banheiro");
        lock.unlock();
    }

    public void fazNumero2() {

        lock.lock();
        System.out.println("entrando no banheiro");
        System.out.println("fazendo coisa demorada");

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("dando descarga");
        System.out.println("lavando a mao");
        System.out.println("saindo do banheiro");
        lock.unlock();
    }

    /*
    Nesse capítulo vimos o poder do bloco synchronized em como ele nos ajuda a trabalhar com tarefas atômicas.
    Como alternativa, podemos também conseguir esse bloqueio de forma explícita (programaticamente) através de uma classe chamada ReentrantLock.

    Certamente há algumas diferenças que podemos examinar. Uma das principais é a possibilidade de se criar um lock com timeout usando uma sobrecarga do método tryLock.

    Por exemplo:

    boolean locked = lock.tryLock(5, TimeUnit.SECONDS); //5s

    Com esse método esperamos até cinco segundos e receberemos true caso o lock for obtido.
    Caso contrário, receberemos false.
    Como desvantagem, há o fato de o programador ter a responsabilidade de liberar o lock (unlock()).
     */
}