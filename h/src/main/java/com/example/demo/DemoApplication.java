package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	///Hilos basicos
	/*public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Proceso_1 a = new Proceso_1();
		Proceso_2 b = new Proceso_2();

		a.start();
		b.start();
	}*/

	/// Hilos con parametros
	/*public static void main(String[] args){
		SpringApplication.run(DemoApplication.class, args);

		Proceso a = new Proceso();
		Proceso b = new Proceso();

		a.valorDeLaCondicion(4);
		b.valorDeLaCondicion(6);

		a.start();
		b.start();
	}
*/

	/// hilos con parametros y 2 constructores
	/*
	public static void main(String[] args){
		SpringApplication.run(DemoApplication.class, args);

		Proceso a = new Proceso("Hilo1");
		Proceso b = new Proceso("Hilo2");

		a.valorDeLaCondicion(4);
		b.valorDeLaCondicion(6);

		a.start();
		b.start();
	}
	 */

	/// Hilo con parametros, constructores y tiempo de dormir cada hilo
/*
	public static void main(String[] args){
		SpringApplication.run(DemoApplication.class, args);

		Proceso a = new Proceso("Hilo1");
		Proceso b = new Proceso("Hilo2");

		a.valorDeLaCondicion(4);
		b.valorDeLaCondicion(6);

		a.start();
		try{
			a.sleep(10000);
		}catch(Exception e){System.out.println("Error en el hilo a:" + e);}

		b.start();
		try{
			b.sleep(500);
		}catch(Exception e){System.out.println("Error en el hilo b:" + e);}
	}
*/

	///MANDAR A DORMIR UN HILO
	/*
	public static void main(String[] args){
		SpringApplication.run(DemoApplication.class, args);

		Proceso a = new Proceso("Hilo1");
		Proceso b = new Proceso("Hilo2");

		a.valorDeLaCondicion(4);
		b.valorDeLaCondicion(6);

		a.start();
		try{
			a.sleep(500);
		}catch(Exception e){System.out.println("Error en el hilo a:" + e);}

		b.start();
		try{
			b.sleep(100);
		}catch(Exception e){System.out.println("Error en el hilo b:" + e);}

	}
*/


	/// ------   DESARROLLO DE LA ACTIVIDAD   --------

	///1. Hola_hilo
/*
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Hola_hilo hilo = new Hola_hilo("Hilo1");

		hilo.start();

	}
 */


	///2. Tareas simultaneas: Registro_paquete, Calculo_costo
/*
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Registro_paquete a = new Registro_paquete();
		Calculo_costo b = new Calculo_costo();

		a.start();
		b.start();

	}
*/


	/// 3. Recibe numero de transacciones e imprime
/*
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Numero_transacciones cajero = new Numero_transacciones();
		cajero.valorDeLaCondicion(10);
		cajero.start();
	}
*/


	///4. Hilo con nombre personalizado

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Conductor a = new Conductor("Carlos");
        Conductor b = new Conductor("Luisa");
        Conductor c = new Conductor("Marta");

        a.start();
        b.start();
        c.start();
    }


}


