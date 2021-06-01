## **COMENTARIOS DE DOCUMENTACION "JavaDoc"**
****
Documentar un proyecto es algo fundamental de cara a su futuro mantenimiento. Cuando programamos una clase, debemos generar documentación lo suficientemente detallada sobre ella como para que otros programadores sean capaces de usarla sólo con su interfaz. No debe existir necesidad de leer o estudiar su implementación, lo mismo que nosotros para usar una clase del API Java no leemos ni estudiamos su código fuente.

Javadoc es una utilidad de Oracle para la generación de documentación de APIs en formato HTML a partir de código fuente Java. Javadoc es el estándar para documentar clases de Java. La mayoría de los IDEs utilizan javadoc para generar de forma automática documentación de clases. BlueJ también utiliza javadoc y permite la generación automática de documentación, y visionarla bien de forma completa para todas las clases de un proyecto, o bien de forma particular para una de las clases de un proyecto.

**Veamos en primer lugar qué se debe incluir al documentar una clase:**

* Nombre de la clase, descripción general, número de versión, nombre de autores.

* Documentación de cada constructor o método (especialmente los públicos) incluyendo: nombre del constructor o método, tipo de retorno, nombres y tipos de parámetros si los hay, descripción general, descripción de parámetros (si los hay), descripción del valor que devuelve.

#### Uso en MADEJA
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
