package com.example.demo;

public class TemporizadorHilo extends Thread {

    private int segundos;

    public TemporizadorHilo(int segundos) {
    this.segundos = segundos;
}


@Override
public void run() {

    for (int i = 1; i <= segundos; i++) {
        try {
            Thread.sleep(1000);

            System.out.println("Tiempo transcurrido: " + i + " segundos");

        } catch (InterruptedException e) {
            System.out.println("El temporizador fue interrumpido");
            Thread.currentThread().interrupt();
            return;
        }
    }

    System.out.println("Temporizador finalizado");
}


}
