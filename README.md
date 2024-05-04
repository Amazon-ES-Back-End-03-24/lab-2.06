# LAB | Java Diseño de sistema

## Introducción

Acabamos de aprender cómo usar Enums y HashMaps y crear diagramas de casos de uso y diagramas de clases UML, así que practiquemos un poco más.

<br>

## Requisitos

1. Haz un fork de este repositorio.
2. Clona este repositorio.
3. Añade a tu instructor y a los calificadores de la clase como colaboradores de tu repositorio. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la presentación del primer día.
4. En el repositorio, crea un proyecto de Java y añade el código para las siguientes tareas.

## Entrega

Una vez que termines la tarea, envía un enlace URL a tu repositorio o tu solicitud de extracción en el campo de abajo.

<br>

## Instrucciones

1. Crea un nuevo proyecto de Java en tu entorno de desarrollo preferido.
2. En el proyecto, crea una clase llamada `Student` que contenga las siguientes propiedades:
    - `name`: String
    - `grade`: int (en el rango 0-100)
3. Crea un `Map` con una clave del nombre del estudiante (String) y un valor de un objeto `Student`.
4. Crea un método llamado `increaseGrades` que tome un `Map<String, Student>` como parámetro, aumente la calificación de cada estudiante en un 10% y devuelva el mapa actualizado.
5. Crea 4 objetos Student para tus compañeros de clase y agrégalos al `Map`.
6. Crea un diagrama de casos de uso y un diagrama de clases para un sistema bancario en línea. El sistema debe tener las siguientes características:
    - Los usuarios pueden transferir fondos, retirar de sus cuentas y depositar en sus cuentas.
    - Los administradores pueden congelar cuentas en caso de fraude.
    - Utiliza la clase `Money` en tu diagrama de clases.

<br>  