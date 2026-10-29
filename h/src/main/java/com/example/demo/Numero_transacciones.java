package com.example.demo;

public class Numero_transacciones extends Thread{

    int cantidad;
    public void valorDeLaCondicion(int cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public void run(){

        for(int i = 1; i <= cantidad; i++){
            System.out.println("Transacción #" + i);
        }
    }
}