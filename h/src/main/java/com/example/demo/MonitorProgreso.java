
package com.example.demo;

public class MonitorProgreso {

    private final int[] progresos = new int[3];
    private final String[] barras = new String[3];

    public MonitorProgreso() {

        for (int i = 0; i < 3; i++) {

             barras[i] = "[" + "░".repeat(20) + "]";

            System.out.println(
                "Servidor " + (i + 1) + " " + barras[i] + " 0%"
            );

            if (i < 2) {
                System.out.println();
            }
        }
    }

    public synchronized void actualizar(
            int numeroServidor, int porcentaje, String barra) {

        int indice = numeroServidor - 1;

        progresos[indice] = porcentaje;
        barras[indice] = barra;

        // Regresar tres líneas en la terminal
        System.out.print("\033[5A");

        // Actualizar las tres barras
        for (int i = 0; i < 3; i++) {

            System.out.print(
                "\r\033[2KServidor " + (i + 1) + " "
                + barras[i] + " " + progresos[i] + "%\n"
            );
            if (i < 2) {
                    System.out.print("\r\033[2K\n");
                }
        }

        System.out.flush();
    }
}
