package com.example.demo;

/// Complementa a la clase Registro_paquete
public class Calculo_costo extends Thread{

    @Override
    public void run(){

        for(int i = 1; i <= 5; i++){
            System.out.println("Calculando costo");
        }
    }
}