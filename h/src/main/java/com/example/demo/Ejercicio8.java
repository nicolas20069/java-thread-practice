package com.example.demo;

public class Ejercicio8 {
    public static void main(String[] args) {
        // 1. Creamos tres tareas del servidor
        TareaServidor tareaBaja = new TareaServidor("Tarea-Reportes (Baja)");
        TareaServidor tareaMedia = new TareaServidor("Tarea-Emails (Media)");
        TareaServidor tareaAlta = new TareaServidor("Tarea-Critica-Pagos (Alta)");
        // 2. Asignamos las prioridades usando setPriority()
        tareaBaja.setPriority(Thread.MIN_PRIORITY); // Prioridad 1
        tareaMedia.setPriority(Thread.NORM_PRIORITY); // Prioridad 5
        tareaAlta.setPriority(Thread.MAX_PRIORITY); // Prioridad 10
        // 3. Los arrancamos
        tareaBaja.start();
        tareaMedia.start();
        tareaAlta.start();
    }
}