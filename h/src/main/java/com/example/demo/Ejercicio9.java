package com.example.demo;

public class Ejercicio9{

    public static void main(String[] args) throws InterruptedException {

        // 1. Instanciamos el hilo (pero todavía NO lo arrancamos)
        DescargaHilo descarga = new DescargaHilo("Juego_Setup.iso");

        // ESTADO 1: ANTES de ejecutarse
        System.out.println("1. Estado ANTES de start(): " + descarga.getState());

        // 2. Arrancamos el hilo
        descarga.start();

        // ESTADO 2: DURANTE la ejecución
        // Le damos 100 milisegundos para que arranque y consultamos su estado mientras
        // trabaja
        Thread.sleep(100);
        System.out.println("2. Estado DURANTE la ejecucion: " + descarga.getState());

        // 3. Esperamos a que el hilo termine con join()
        descarga.join();

        // ESTADO 3: DESPUÉS de terminar
        System.out.println("3. Estado DESPUES de terminar: " + descarga.getState());
    }
}