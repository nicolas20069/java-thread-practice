package com.example.demo;

public class PedidoHilo extends Thread{

    private int idPedido;
    private double valorTotal;

    public PedidoHilo(int idPedido, double valorTotal) {

    this.idPedido = idPedido;
    this.valorTotal = valorTotal;

    }
    
@Override
public void run() {
    System.out.println(
        "Pedido: " + idPedido + " | Valor total: $" + valorTotal
    );
}

    
}
