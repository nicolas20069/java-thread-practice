package com.example.demo;

public class Conductor extends Thread{
    public Conductor(String nombre){

        super(nombre);
    }

    @Override
    public void run(){
        System.out.println("Conductor " + this.getName() + " en ruta");

    }

}