package com.example.demo;

public class Proceso extends Thread{

    int num_int;

    ///Hilo con parametros
    /*
    @Override
    public void run(){
        /// Se le da un limite, que es el numero maximo agregado en el proceso
        for (int i=1; i<num_int; i++){

            System.out.println(i + this.getName());
        }
    }
    */

    /// hilos con parametros y 2 constructores
    /*
    public Proceso(String NombreHilo){
        super(NombreHilo);
    }

    @Override
    public void run(){
        for(int i=1; i<= num_int; i++){
            System.out.println(i + this.getName());
        }
    }

    public void valorDeLaCondicion(int num_int){
        this.num_int = num_int;
    }
    */

    /// Hilo con parametros, constructores y tiempo de dormir cada hilo
/*
    public Proceso(String NombreHilo){
        super(NombreHilo);
    }

    @Override
    public void run(){
        for(int i=1; i<= num_int; i++){
            System.out.println(i + this.getName());
        }
    }

    public void valorDeLaCondicion(int num_int){
        this.num_int = num_int;
    }
*/

/*
    public Proceso(String NombreHilo){
        super(NombreHilo);
    }

    @Override
    public void run(){
        for(int i=1; i<= num_int; i++){
            System.out.println(i + this.getName());
        }
    }

    public void valorDeLaCondicion(int num_int){
        this.num_int = num_int;
    }
*/


}