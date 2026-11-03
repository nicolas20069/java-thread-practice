package com.example.demo;

public class Ejercicio7 {
    private static class TareaRestaurante extends Thread {
        private final String mensaje;

        private TareaRestaurante(String nombre, String mensaje) {
            super(nombre);
            this.mensaje = mensaje;
        }

        @Override
        public void run() {
            for (int tarea = 1; tarea <= 5; tarea++) {
                System.out.println(getName() + ": " + mensaje + " (" + tarea + "/5)");
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println(getName() + " fue interrumpido.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread cocina = new TareaRestaurante("Cocina", "Preparando plato");
        Thread servicio = new TareaRestaurante("Servicio", "Atendiendo pedido");

        cocina.start();
        servicio.start();

        cocina.join();
        servicio.join();
        System.out.println("Todas las tareas del restaurante terminaron.");
    }
}
