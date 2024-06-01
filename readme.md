# Proyecto de Automatización con Serenity BDD y Patrón Screenplay

Este proyecto utiliza Gradle como sistema de construcción y automatización para proyectos Java, integrando Serenity BDD con el patrón Screenplay, JUnit 5 y Cucumber. Además, se incluyen capacidades para la gestión automática de los drivers de Selenium, logging con SLF4J y manejo de JSON.

## Configuración del Proyecto

El archivo `build.gradle` incluye las siguientes configuraciones:

- **Plugins**:
    - `java`: Agrega capacidades básicas de construcción y prueba de proyectos Java.
    - `net.serenity-bdd.aggregator`: Genera informes agregados de los resultados de las pruebas con Serenity.

- **Variables de Proyecto**:
    - `group`: Define el grupo del proyecto para organizar los paquetes.
    - `version`: Define la versión del proyecto.

- **Compilación de Java**:
    - Configura todas las tareas de compilación para usar UTF-8 como la codificación de caracteres.
    - Define la versión de Java utilizada para compilar el código fuente (Java 17 en este caso).

- **Repositorios**:
    - Utiliza el repositorio Maven Central para obtener dependencias.

- **Script de Construcción**:
    - Define los repositorios y dependencias necesarias para el script de construcción.
    - Incluye el plugin de Serenity, el plugin de Lombok de Freefair, entre otros.

- **Variables de Extensión**:
    - Define variables de extensión para especificar versiones de dependencias.

- **Configuración de Pruebas**:
    - Utiliza JUnit Platform para las pruebas, excluyendo aquellas marcadas con la etiqueta "disabled".
    - Pasa las propiedades del sistema a las pruebas.
    - Configura el logging de pruebas y asegura que siempre se ejecuten.

- **Dependencias**:
    - Incluye las dependencias necesarias para el proyecto, como Serenity BDD, WebDriverManager, SLF4J, JSON, y JUnit 5.

Para ejecutar las pruebas, puedes utilizar los comandos Gradle estándar como `gradle clean test aggregate` para ejecutar todas las pruebas y generar informes con Serenity.

## Escenarios de Prueba

### Feature: signup on quipux

as a user I want to validate the sign up behaviour on quipux digital

Scenario: correct signup on quipux
Given I open the web quipux digital
When I create an account on quipux
Then I must be redirected to main page

- Este escenario simula un registro exitoso en Quipux Digital.
- Comienza abriendo la página web de Quipux Digital, luego crea una cuenta en Quipux y verifica que se redirija a la página principal después del registro.

Scenario Outline: validate sign up behaviour for form

- Este escenario verifica el comportamiento del formulario de registro en Quipux Digital con diferentes combinaciones de correo electrónico y contraseña.
- Abre la página web de Quipux Digital y luego ingresa un correo electrónico y una contraseña según los datos de la tabla de ejemplos.
- Después de ingresar los datos, verifica que el usuario vea el mensaje esperado según la combinación de correo electrónico y contraseña ingresada.

