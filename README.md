# Api Colegio Olimpo
>Este proyecto contiene el api de el colegio olimpo con el cual
se realiza la creacion de la base de datos temporal usando H2
y enfocado a microservicios

# Instalacion
>Importar desde el IDE proyecto Maven Existente, seleccionar el POM y Aceptar

# Base de datos
>La base de datos se almacena de manera temporar usando la dependencia H2, los scrips de creacion e insercion de datos se encuentran alojados en la ruta D

>**src/main/resources/data.sql**

# Funcionamiento
>Al correr el proyecto el api quedara expuesta en localhost por el puerto 8080

http://localhost:8080/

# Servicios expuestos

> http://localhost:8080/api/colegios

>http://localhost:8080/api/profesores

>http://localhost:8080/api/asignaturas/:idProfesor

>http://localhost:8080/api/estudiantes/:idAsignatura

-------------------------------------------
