package com.example.demo;

public class Ejercicio10 {

    public static void main(String[] args) {

        PedidoHilo pedido1 = new PedidoHilo(101, 85000.50);
        PedidoHilo pedido2 = new PedidoHilo(102, 125000.00);
        PedidoHilo pedido3 = new PedidoHilo(103, 80000.00);

        pedido1.start();
        pedido2.start();
        pedido3.start();

    }
}
