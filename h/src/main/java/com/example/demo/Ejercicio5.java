package com.example.demo;

public class Ejercicio5 {
    private static class Sensor extends Thread {
        @Override
        public void run() {
            for (int lectura = 1; lectura <= 5; lectura++) {
                System.out.println("Leyendo temperatura... (" + lectura + "/5)");
                if (lectura < 5) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Lectura interrumpida.");
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread sensor = new Sensor();
        sensor.start();
        sensor.join();
    }
}
