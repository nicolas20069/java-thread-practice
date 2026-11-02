package com.example.demo;

public class ServidorHilo extends Thread {

    private String nombreServidor;
    private int numeroServidor;
    private MonitorProgreso monitor;

    
    public ServidorHilo(String nombreServidor, int numeroServidor,
                        MonitorProgreso monitor) {

        this.nombreServidor = nombreServidor;
        this.numeroServidor = numeroServidor;
        this.monitor = monitor;
    }

    

private String generarBarra(int porcentaje) {

    String verde = "\u001B[38;2;34;197;94m";
    String gris = "\u001B[90m";
    String reset = "\u001B[0m";

    int bloquesLlenos = porcentaje / 5;
    int bloquesVacios = 20 - bloquesLlenos;

    return "[" +
            verde + "█".repeat(bloquesLlenos) +
            gris + "░".repeat(bloquesVacios) +
            reset + "]";
}



@Override
public void run() {

    for (int i = 1; i <= 100; i++) {

        try {
            Thread.sleep(50);

            String barra = generarBarra(i);
            monitor.actualizar(numeroServidor, i, barra);

        } catch (InterruptedException e) {
            System.out.println(nombreServidor + " fue interrumpido");
            Thread.currentThread().interrupt();
            return;
        }
    }

    
}


}
