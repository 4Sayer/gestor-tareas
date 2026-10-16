# Gestor de tareas

## Integrantes 
- Omar Casanova (xSayer)

## Descripción
Aplicación Java de consola que administra tareas personales.

## Requisitos
Java JDK 17+, Git, IntelliJ IDEA.

## Instalación y ejecución
1. Clonar este repositorio.
2. Sincronizar Gradle en IntelliJ.
3. Ejecutar la clase `GestorTareas.java`.

## Funcionalidades y responsables
- Registrar tarea: Integrante A (feature/registrar-tarea)
- Listar tareas: Integrante B (feature/listar-tareas)
- Completar tarea: Integrante C (feature/completar-tarea)

## Estructura del proyecto
Proyecto Gradle simple. Código fuente ubicado en `src/main/java/gestor`.

## Flujo de colaboración
Desarrollo basado en ramas (Branches) integradas mediante Pull Requests hacia `main`. No se hace push directo a main.

## Pruebas
Se probó la creación múltiple de tareas, listado visual y marcado de completado. Se incluyó manejo de excepciones (`NumberFormatException` y `IndexOutOfBoundsException`) para evitar que el programa termine inesperadamente por opciones de menú inválidas.

## Preguntas de reflexión
(Respuestas discutidas internamente por el equipo según la guía).

## Resolución de Conflicto (Evidencia)
Se generó un conflicto intencional modificando el mensaje de bienvenida de la consola en dos ramas distintas. Se resolvió usando la herramienta "Three-way merge" de IntelliJ IDEA, decidiendo conservar ambas líneas integradas.
