## **COMENTARIOS DE DOCUMENTACION "JavaDoc"**
****
Documentar un proyecto es algo fundamental de cara a su futuro mantenimiento. Cuando programamos una clase, debemos generar documentación lo suficientemente detallada sobre ella como para que otros programadores sean capaces de usarla sólo con su interfaz. No debe existir necesidad de leer o estudiar su implementación, lo mismo que nosotros para usar una clase del API Java no leemos ni estudiamos su código fuente.

Javadoc es una utilidad de Oracle para la generación de documentación de APIs en formato HTML a partir de código fuente Java. Javadoc es el estándar para documentar clases de Java. La mayoría de los IDEs utilizan javadoc para generar de forma automática documentación de clases. BlueJ también utiliza javadoc y permite la generación automática de documentación, y visionarla bien de forma completa para todas las clases de un proyecto, o bien de forma particular para una de las clases de un proyecto.

**Veamos en primer lugar qué se debe incluir al documentar una clase:**

1) Nombre de la clase, descripción general, número de versión, nombre de autores.

2) Documentación de cada constructor o método (especialmente los públicos) incluyendo: nombre del constructor o método, tipo de retorno, nombres y tipos de parámetros si los hay, descripción general, descripción de parámetros (si los hay), descripción del valor que devuelve.

**Las variables de instancia o de clase no se suelen documentar  a nivel de javadoc.**
* Para generar la documentación de un proyecto automáticamente hemos de seguir unas normas a la hora de realizar los comentarios dentro del mismo. Si las hemos seguido, en BlueJ disponemos de la opción del menú Tools --> Project Documentation, que nos abre la documentación del proyecto en un navegador web. Para ver la documentación de una clase específica en BlueJ, debemos abrir la ventana de código, y en la parte superior derecha cambiar la pestaña que pone “Source code” por la opción “Documentation”.

* Además de documentar las clases, todo proyecto debería tener un archivo Leeme o Readme. En BlueJ podemos acceder al readme.txt de proyecto haciendo doble click en el icono que representa una hoja en la parte superior izquierda del diagrama de clases. En el readme.txt sería adecuado incluir al menos: título del proyecto, descripción, versión, cómo arrancar el proyecto, autores e instrucciones para los usuarios. Haz doble click en el icono e introduce una descripción para tu proyecto.

## **Uso en MADEJA**
**A continuación definimos una serie de reglas elementales:**

* Los comentarios de JAVADOC se generan desde el código fuente y, por lo tanto, hay que incluir en el mismo etiquetas especiales para poder interpretarlas en la generación. La etiqueta que determina un comentario JAVADOC es /**..*/
* Un comentario JAVADOC está compuesto de una definición seguida de un bloque de etiquetas relacionadas
* A continuación se ofrece una tabla con las etiquetas principales que se usan en JAVADOC con su descripción funcional:

|     TAG       | DESCRIPCIÓN                                                                                               | COMPRENDE                                |    
|---------------|-----------------------------------------------------------------------------------------------------------|------------------------------------------|
|@author        | Nombre del desarrollador                                                                                  | Nombre autor o autores                   |         
|@deprecated    | Indica que el método o clase es obsoleto (propio de versiones anteriores) y que no se recomienda su uso   | Descripción                              |
|@param         | Definición de un parámetro de un método, es requerido para todos los parámetros del método.               | Nombre de parámetro y descripción        |     
|@return        | Informa de lo que devuelve el método, no se aplica en constructores o métodos "void".                     | Descripción del valor de retorno         |   
|@see           |Asocia con otro método o clase.                                                                            | Referencia cruzada                       |
|@version       |Versión del método o clase.                                                                                | Versión                                  |
#### Comentarios de clases
A continuación se presenta un ejemplo que muestra cómo se indican, en los comentarios de una clase, la descripción, el autor, la versión y la fecha.

**Ejemplo:**

|   / * *                                |
|----------------------------------------|
|   * Frase corta descriptiva            |
|   * Descripción de la clase            |
|   * @author Nombre Apellido / Empresa  |
|   * @version 0.1, 2004/05/30           |
|   * /                                  |
#### Comentarios de Métodos
Podemos ver cómo se incluyen los comentarios de los métodos en el siguiente ejemplo.  En él vemos la manera de especificar la descripción, los parámetros, el tipo de retorno y las excepciones que se lanzan. También vemos cómo se referenciaría la llamada a otro método.

**Ejemplo:**

|/**                                                                       |
|--------------------------------------------------------------------------|
|* Frase corta descriptiva                                                 |
|* Descripción del método.                                                 |
|* Mención al uso{@link es.loquesea.$app.util.Otra#unMetodo unMetodo}.     |
|* @param param1 descripción del parámetro.                                | 
|* @return qué devuelve el método.                                         |
|* @exception tipo de excepción que lanza el método y en qué caso          |
|* @see paquete.Clase#metodo Código al que se hace referencia              |
|* @throws IllegalArgumentException el param1 no tiene el formato deseado  |
|* /                                                                       |
#### Comentarios de Variables
La manera de incluir los comentarios a las variables es la que se muestra a continuación. En ella podemos ver cómo se especifican su descripción, su modificador (private, public), si procede, y cuáles son los valores válidos o qué ocurre si su valor es null.

**Ejemplo:**
|/**                                                       |
|----------------------------------------------------------|
|* Frase corta descriptiva                                 |
|* Descripción de la variable.                             |
|* Valores válidos (si aplica)                             |
|* Comportamiento en caso de que sea null(si aplica)       |
|* /                                                       |
