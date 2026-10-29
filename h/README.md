# Proyecto Java 21

Este proyecto usa Java 21, Maven y Spring Boot. Para abrirlo en IntelliJ IDEA:

1. Abre la carpeta del proyecto, o importa `pom.xml` como proyecto Maven.
2. En **File > Project Structure > Project**, selecciona un **SDK de Java 21** y el nivel de lenguaje **21**.
3. En la ventana de Maven, recarga el proyecto. Comprueba que Maven use el mismo JDK 21 en **Settings > Build, Execution, Deployment > Build Tools > Maven > Runner**.

En Windows puedes comprobar la compilación y las pruebas con:

```powershell
.\mvnw.cmd test
```

Para generar el paquete:

```powershell
.\mvnw.cmd package
```

Al ejecutar `DemoApplication`, la configuración de `src/main/resources/application.properties` intenta conectarse a MySQL en `localhost:3306` y a MongoDB en `localhost:27017`. Inicia esos servicios y ajusta sus credenciales y bases de datos según tu entorno. La prueba de los procesos puede ejecutarse sin esos servicios locales.
