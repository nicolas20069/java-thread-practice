# Java Thread Practice

Repositorio académico desarrollado para la asignatura de Programación Avanzada, enfocado en el aprendizaje de programación concurrente mediante el uso de hilos (Threads) en Java.

## Objetivo

Comprender los fundamentos de la concurrencia en Java mediante ejercicios prácticos que permitan:

- Crear hilos utilizando la clase `Thread`.
- Ejecutar múltiples tareas de forma concurrente.
- Asignar nombres personalizados a los hilos.
- Enviar parámetros a los procesos ejecutados por los hilos.
- Analizar el comportamiento de la ejecución simultánea de tareas.

---

## Tecnologías Utilizadas

- Java 21
- Spring Boot
- Maven
- IntelliJ IDEA
- Git y GitHub

---

## Estructura del Proyecto

```text
src
│
├── main
│   ├── java
│   │   └── com.example.demo
│   │       ├── DemoApplication.java
│   │       ├── Hola_hilo.java
│   │       ├── Registro_paquete.java
│   │       ├── Calculo_costo.java
│   │       ├── Numero_transacciones.java
│   │       ├── Conductor.java
│   │       └── Proceso.java
│   │
│   └── resources
│       └── application.properties
│
└── test
```

---

## Ejercicios Implementados

### 1. Hola Hilo

Crea un hilo básico que imprime un mensaje indicando que el sistema está activo.

**Conceptos aplicados:**

- Extensión de la clase `Thread`
- Sobrescritura del método `run()`
- Ejecución mediante `start()`

---

### 2. Dos tareas simultáneas

Simulación de un sistema de logística en el que dos procesos se ejecutan concurrentemente:

- Registro de paquetes
- Cálculo de costos

**Conceptos aplicados:**

- Múltiples hilos
- Ejecución concurrente
- Planificación de procesos

---

### 3. Hilo con parámetro

Simulación de un cajero automático que procesa una cantidad determinada de transacciones.

**Conceptos aplicados:**

- Paso de parámetros
- Variables de instancia
- Configuración dinámica de un hilo

---

### 4. Hilo con nombre personalizado

Simulación de conductores identificados mediante nombres propios.

**Conceptos aplicados:**

- Constructores personalizados
- Uso de `getName()`
- Identificación de procesos mediante nombres

---

## Ejemplo de Ejecución

```java
Conductor a = new Conductor("Carlos");
Conductor b = new Conductor("Luisa");
Conductor c = new Conductor("Marta");

a.start();
b.start();
c.start();
```

Posible salida:

```text
Conductor Carlos en ruta
Conductor Luisa en ruta
Conductor Marta en ruta
```

El orden de aparición puede variar debido a la naturaleza concurrente de los hilos.

---

## Requisitos

- JDK 21
- Maven 3.9 o superior
- IntelliJ IDEA

---

## Instalación

Clonar el repositorio:

```bash
git clone https://github.com/nicolas20069/java-thread-practice.git
```

Entrar al proyecto:

```bash
cd java-thread-practice
```

Compilar:

```bash
./mvnw clean compile
```

Ejecutar pruebas:

```bash
./mvnw test
```

Generar paquete:

```bash
./mvnw package
```

---

## Autor

**Nicolas Melo**

Estudiante de Ingeniería de Sistemas.

Proyecto académico orientado al aprendizaje de concurrencia y programación multihilo en Java.
