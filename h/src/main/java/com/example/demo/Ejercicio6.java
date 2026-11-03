package com.example.demo;

public class Ejercicio6 {
    private static class CuentaRegresiva extends Thread {
        @Override
        public void run() {
            for (int segundo = 10; segundo >= 1; segundo--) {
                System.out.println(segundo);
                if (segundo > 1) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Cuenta regresiva interrumpida.");
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
            System.out.println("¡Tiempo!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread cuenta = new CuentaRegresiva();
        cuenta.start();
        cuenta.join();
    }
}
