# Ejercicios Sumativos Semana 5: Colecciones, Métodos y Streams en Java

Este repositorio contiene la solución a 5 ejercicios prácticos diseñados para comprender y aplicar las principales estructuras de datos en Java (Colecciones), la modularización de código a través de funciones (métodos) y el procesamiento de datos utilizando la API de Streams.

## Guía de Inicio

¡Bienvenido al mundo de Java en VS Code! Aquí tienes una guía básica para ayudarte a comenzar a ejecutar y escribir código Java en Visual Studio Code.

Para ejecutar cualquiera de estos ejercicios, asegúrate de tener instalado el **Java Development Kit (JDK)** y la extensión **Extension Pack for Java** en VS Code. Solo abre el archivo del ejercicio que deseas probar y presiona el botón **"Run"** (Ejecutar) que aparece automáticamente en la parte superior del método `main`.

## Descripción de los Ejercicios

### Ejercicio 1: ArrayList - Registro de Productos
* **Archivo:** `Ejercicio1.java`
* **Objetivo:** Practicar la creación, almacenamiento y recorrido de un `ArrayList`.
* **Descripción:** Un programa por consola que permite al usuario definir una cantidad de productos a registrar, los guarda en una lista dinámica y finalmente los muestra en pantalla detallando la cantidad total ingresada.

### Ejercicio 2: Set - Registro de Usuarios Únicos
* **Archivo:** `Ejercicio2.java`
* **Objetivo:** Comprender cómo la interfaz `Set` (específicamente `HashSet`) evita elementos duplicados.
* **Descripción:** El programa solicita el ingreso de nombres de usuario. Si se intenta registrar un nombre que ya existe en la colección, el sistema lo rechaza y avisa que es un usuario repetido, garantizando un registro de valores únicos.

### Ejercicio 3: Map - Agenda Telefónica
* **Archivo:** `Ejercicio3.java`
* **Objetivo:** Aprender a trabajar con relaciones clave-valor utilizando `HashMap`.
* **Descripción:** Simula una agenda donde se registran contactos. El nombre del contacto funciona como una *Clave* única y su teléfono como el *Valor*. Permite listar todos los contactos usando `entrySet()` y buscar un teléfono específico introduciendo el nombre.

### Ejercicio 4: Stream - Filtrar Notas Aprobadas
* **Archivo:** `Ejercicio4.java`
* **Objetivo:** Aprender a utilizar `Stream` para procesar colecciones de forma declarativa.
* **Descripción:** Partiendo de una lista de calificaciones (`Double`), el programa utiliza operaciones de Stream como `.filter()` para aislar las notas mayores o iguales a 4.0, las imprime con `.forEach()` y finalmente cuenta el total de aprobados con `.count()`.

### Ejercicio 5: Gestión de Frutas con Funciones
* **Archivo:** `GestionFrutas.java`
* **Objetivo:** Aprender a dividir el programa en funciones (métodos) con responsabilidades claras y pasar datos a través de parámetros.
* **Descripción:** Un sistema interactivo que administra una lista de frutas. En lugar de escribir todo el código dentro del `main`, se crearon mini-robots (funciones independientes) para agregar, mostrar, contar, reemplazar y eliminar frutas. Incluye el desafío adicional de verificar si la fruta existe en la lista antes de modificarla o borrarla.

---

## Estructura de Carpetas

El espacio de trabajo contiene:

- `src`: La carpeta donde debes guardar tus archivos de código fuente (Aquí es donde viven tus archivos `Ejercicio1.java`, `GestionFrutas.java`, etc.).

## Gestión de Dependencias

La vista de proyectos de Java (**"JAVA PROJECTS"**) en la barra lateral te permite administrar tus dependencias fácilmente. Puedes encontrar más detalles detallados sobre su uso e interfaz ingresando [aquí](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
