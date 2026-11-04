package com.example.demo;

public class DescargaHilo extends Thread {

    private String nombreArchivo;

    public DescargaHilo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void run() {
        // Estado DURANTE la ejecución (visto desde el propio hilo)
        System.out.println(" Descargando " + nombreArchivo
                + " | Estado interno: " + this.getState());

        try {
            // Simulamos el tiempo de descarga (1.5 segundos)
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Descarga interrumpida: " + e);
        }

        System.out.println(" Descarga de " + nombreArchivo + " completada con éxito.");
    }
}