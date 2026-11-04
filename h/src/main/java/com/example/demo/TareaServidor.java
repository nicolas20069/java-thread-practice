package com.example.demo;

public class TareaServidor extends Thread {

    public TareaServidor(String nombre) {
        super(nombre); // Le asigna el nombre al hilo
    }

    @Override
    public void run() {
        // Mostramos el nombre y la prioridad con la que se está ejecutando
        System.out.println("Iniciando tarea: " + this.getName()
                + " | Prioridad: " + this.getPriority());

        // Hacemos un bucle para ver cómo compiten por la CPU
        for (int i = 1; i <= 5; i++) {
            System.out.println(this.getName() + " procesando paso " + i);
        }

        System.out.println("Fin de tarea: " + this.getName());
    }
}