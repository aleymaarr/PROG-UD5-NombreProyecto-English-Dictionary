
# PROG-UD5-NombreProyecto-English-Dictionary

# Documentación de la aplicación "Duolingo Dictionary"

### Descripción

* La aplicación "Duolingo Dictionary" es una herramienta que permite a los usuarios guardar y revisar las palabras en inglés que van aprendiendo cada día. La aplicación ha sido solicitada por la empresa Duolingo Inc.

* La aplicación utiliza estructuras de datos adecuadas para una correcta funcionalidad y dispone de un menú mediante el que el usuario puede interactuar con el diccionario.

### Estructura de paquetes
* La estructura de paquetes utilizada en la aplicación es la siguiente:


Diccionario.java

* com
* duolingo
* Diccionario

#### Clase Diccionario:
* La clase Diccionario se encarga de almacenar las palabras clasificándolas por la inicial. Las palabras agrupadas por letra son únicas y no se repiten dentro de la colección.

#### Variables:
* mapaPalabras: Es un mapa que asocia un carácter (inicial de palabra) con un conjunto de palabras. Utiliza la interfaz Map y la implementación TreeMap.
* mapaVerbosFrases: Es un mapa similar a mapaPalabras, pero se utiliza para almacenar verbos frasales.


## Constructores

* Diccionario(): Es el constructor de la clase. Inicializa los mapas mapaPalabras y mapaVerbosFrases como instancias vacías de TreeMap.

* agregarPalabra(String palabra): Este método recibe una palabra como parámetro y la agrega al diccionario. 
* Si la palabra contiene un espacio en blanco, se considera como un verbo frasal y se llama al método agregarVerboFrasal(). 
* Si la palabra no contiene un espacio en blanco, se toma el carácter inicial de la palabra, se convierte a minúscula y se agrega al conjunto correspondiente en el mapa mapaPalabras. 
* Retorna un valor booleano que indica si la palabra se agregó con éxito.

* agregarVerboFrasal(String verboFrasal): Este método recibe un verbo frasal como parámetro y lo agrega al diccionario de verbos frasales. 
* Se sigue el mismo procedimiento que en agregarPalabra(), pero la palabra se agrega al mapa mapaVerbosFrases.

* eliminarPalabra(String palabra): Recibe una palabra como parámetro y la elimina del diccionario. 
* Se busca el carácter inicial de la palabra, se convierte a minúscula y se elimina la palabra del conjunto correspondiente en el mapa mapaPalabras. 
* Retorna un valor booleano que indica si la palabra se eliminó con éxito.

* palabraExiste(String palabra): Recibe una palabra como parámetro y verifica si está presente en el diccionario. 
* Se busca el carácter inicial de la palabra, se convierte a minúscula y se verifica si el conjunto correspondiente en el mapa mapaPalabras contiene la palabra. 
* Retorna un valor booleano que indica si la palabra existe en el diccionario.

* obtenerInicialesDisponibles(): Retorna un conjunto de caracteres que representan las iniciales disponibles en el diccionario. 
* Estas iniciales corresponden a las claves presentes en el mapa mapaPalabras.

* obtenerPalabrasPorInicial(char inicial): Recibe un carácter inicial como parámetro y retorna el conjunto de palabras asociadas a esa inicial en el diccionario. 
* Si no existe ninguna palabra asociada a la inicial, retorna null.


## Menú

* La clase ejecutable del proyecto incluye un menú con las siguientes opciones:

* Añadir palabra
* Eliminar palabra
* Existe palabra
* Mostrar iniciales disponibles
* Ver palabras por inicial
* Cerrar programa

### Uso de la aplicación

* Al iniciar la aplicación se muestra un mensaje de bienvenida al usuario. A continuación, se muestra el menú y se espera a que el usuario seleccione una opción.

* Si el usuario selecciona la opción de añadir palabra, se le solicita que introduzca la palabra. La palabra se sanitaniza y se comprueba si ya está en el diccionario. Si no está, se añade y se muestra un mensaje indicando que la palabra se ha guardado correctamente.

* Si el usuario selecciona la opción de eliminar palabra, se le solicita que introduzca la palabra. La palabra se sanitaniza y se comprueba si está en el diccionario. Si está, se elimina y se muestra un mensaje indicando que la palabra se ha eliminado. Si no está, se muestra un mensaje indicando que la palabra no se encuentra en el diccionario

* Si el usuario selecciona la opción de existe palabra, se le solicita que introduzca la palabra. Si está, se muestra un mensaje indicando que la palabra se ha encontrado y que esta en el diccionario. Si no está, se muestra un mensaje indicando que la palabra no se encuentra en el diccionario

* Si el usuario selecciona la opción de mostrar iniciales disponible, se le mostrara al usuario un mensaje con las iniciales disponibles de las palabras que se añadan

* Si el usuario selecciona la opción de ver palabras por inicial, se le solicita que introduzca la inicial que desea buscar, si el usuario introduce una inical que esta en el diccionario se le mostrar el siguiente mensaje
* Palabras que empiezan por inicial y mostrara todas las palabras que comienzen por dicha inicial, en el caso de que el usuario pusiese una inicial que no esta en el diccionario saldria el siguiente mensaje No hay palabras almacenadas que empiecen por esa inicial.

* Si el usuario selecciona la opción de Cerrar programa, se le mostrara al usuario un mensaje de despedida

* ¡Gracias por usar el diccionario de palabras por inicial!

