package com.example.demo;

/// Va complementada con la clase Calculo_costo
public class Registro_paquete extends Thread{

    @Override
    public void run(){

        for(int i = 1; i <= 5; i++){
            System.out.println("Registrando paquete");
        }
    }

}