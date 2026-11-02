package com.example.demo;

public class Ejercicio12 {

    public static void main(String[] args) throws InterruptedException {

        // Crear un monitor compartido
        MonitorProgreso monitor = new MonitorProgreso();

        // Crear los tres servidores
        ServidorHilo servidor1 = new ServidorHilo("Servidor 1", 1, monitor);
        ServidorHilo servidor2 = new ServidorHilo("Servidor 2", 2, monitor);
        ServidorHilo servidor3 = new ServidorHilo("Servidor 3", 3, monitor);

        // Iniciar los hilos
        servidor1.start();
        servidor2.start();
        servidor3.start();

        // Esperar a que terminen los tres servidores
        servidor1.join();
        servidor2.join();
        servidor3.join();

        System.out.println("\nLos tres servidores han completado la carga.\n");
    }
}
