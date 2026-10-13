# Objetivo de la entrega
El objetivo de esta entrega es practicar los conceptos de entrada, salida y carga de datos en Java mediante Maven, aprendiendo a separar la lógica del programa de los orígenes de datos 
(como ficheros o URLs mediante InputStream) y de los destinos de salida (como la consola o ficheros mediante OutputStream), transformando líneas de texto en entidades de dominio de forma estructurada y controlada.   

# Cómo compilar y ejecutar
El proyecto se gestiona con Maven. Para compilarlo y ejecutarlo basta con abrirlo en IntelliJ IDEA y usar la opción Run sobre la clase principal Main.

# Dependencias y versiones de JDK
- **Gestor de dependencias:** Maven.
- **JDK:** 27.

## Estructura de la entrega y clases principales
```
kata2/
├── pom.xml
├── .gitignore
└── src/
    └── main/
        └── java/
            └── software/
                └── ulpgc/
                    ├── katas/
                    │   ├── Main.java              # Código principal del programa
                    │   ├── io/
                    │   │   ├── EmployeeReader.java    # Interfaz para la carga de empleados basada en InputStream
                    │   │   └── UrlEmployeeReader.java # Adaptador para leer empleados desde una URL
                    │   └── model/
                    │       ├── Employee.java          # Entidad que representa a un empleado (nombre y género)
                    │       └── Gender.java            # Enumerado para los valores de género (Male, Female)
```

## Flujo de Git usado
El flujo de trabajo seguido en el repositorio incluye:
1. Creación del proyecto y configuración inicial (`pom.xml`, `.gitignore`).
2. Creación de la rama **develop** para desarrollar la kata paso a paso mediante commits.
3. **Merge** de `develop` a `master` una vez terminada la kata.
4. Commits adicionales sobre `master` para la clase `Main` y ajustes finales.
5. **Push** de todos los commits y ramas al repositorio remoto en GitHub.

Ramas del repositorio:
- `master`: versión final integrada de la kata.
- `develop`: desarrollo paso a paso de la kata.

## Cómo clonar y comprobar que compila
 
Para comprobar que el proyecto compila y funciona fuera de la carpeta original:
 
1. Abrir IntelliJ IDEA.
2. En la pantalla de inicio, seleccionar **Clone Repository**.
3. Pegar la URL del repositorio de GitHub creado para esta entrega y cambiar la carpeta destino.
4. Una vez clonado, ejecutar `Main` con **Run** y comprobar que compila sin errores y produce el mismo resultado que la versión original.

## Evidencias de verificación y pruebas
 
- Se comprobó que el proyecto compila correctamente con Maven sin errores.
- Se ejecutó la clase `Main` desde IntelliJ (Run) verificando que el programa produce la salida esperada.
- Se clonó el repositorio en una carpeta distinta a la original y se repitió la compilación y ejecución, confirmando que el resultado es idéntico.
- Se revisó el historial de commits en GitHub para confirmar que todas las ramas (`master`, `develop`) están correctamente subidas al remoto.
- Se utilizó el **debugger** de IntelliJ, colocando breakpoints en puntos clave del código (constructor y método que calcula la edad de la persona), para seguir paso a paso la ejecución del programa y verificar el flujo del IDE y el comportamiento correcto de la clase `Person`.

A continuación se muestra la consola tras ejecutar `Main`, confirmando que el programa finaliza correctamente (exit code 0) y que el texto aparece en diferentes formatos, como se esperaba y los mensajes del nombre y el género de los empleados del archivo TSV:
(poner captura)

## Atajos de teclado utilizados

Durante el desarrollo de la kata se utilizaron los siguientes atajos de IntelliJ IDEA:

| Atajo | Uso |
|---|---|
| `Alt + Ins` | Crear un nuevo *package*, una nueva clase Java, un nuevo archivo (p. ej. `README.md`), o generar un constructor, y también para que el IDE cree automáticamente métodos a partir de su uso. |
| `Control + K` | Abrir la ventana de commit para escribir el mensaje del commit. |
| `Control + Enter` | Confirmar y realizar el commit. |
| `Alt + 9` | Abrir la ventana de Git para ver ramas y commits. |
| `Alt + Enter` | Mostrar acciones rápidas del IDE, como convertir la clase `Person` en `record`. |

## Vídeo explicativo
 
- **Enlace en YouTube:** (poner video)
- **Enlace en Drive:** (poner video)

 
