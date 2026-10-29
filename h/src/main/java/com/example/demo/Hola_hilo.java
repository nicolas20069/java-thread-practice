package com.example.demo;

public class Hola_hilo extends Thread{
    /// Nos permite agregar un nombre al hilo
    /// Que posteriormente sera llamado con this.getName
    public Hola_hilo(String NombreHilo){
        super(NombreHilo);
    }
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("El sistema está activo - " + this.getName());
        }

    }
}