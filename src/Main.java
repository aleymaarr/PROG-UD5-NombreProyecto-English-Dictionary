import com.duolingo.dictionary.Diccionario;

import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Diccionario diccionario = new Diccionario();
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido a la aplicación de Duolingo!");

        while (true) {
            System.out.println("1. Agregar palabra");
            System.out.println("2. Eliminar palabra");
            System.out.println("3. Verificar existencia de palabra");
            System.out.println("4. Mostrar iniciales disponibles");
            System.out.println("5. Ver palabras por inicial");
            System.out.println("6. Cerrar programa");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Ingrese la palabra:");
                    String palabra = scanner.nextLine();
                    if (diccionario.agregarPalabra(palabra)) {
                        System.out.println("Palabra agregada correctamente.");
                    } else {
                        System.out.println("La palabra ya estaba almacenada.");
                    }
                    break;
                case "2":
                    System.out.println("Ingrese la palabra a eliminar:");
                    String palabraEliminar = scanner.nextLine();
                    if (diccionario.eliminarPalabra(palabraEliminar)) {
                        System.out.println("Palabra eliminada correctamente.");
                    } else {
                        System.out.println("La palabra no estaba almacenada.");
                    }
                    break;
                case "3":
                    System.out.println("Ingrese la palabra a buscar:");
                    String palabraBuscar = scanner.nextLine();
                    if (diccionario.palabraExiste(palabraBuscar)) {
                        System.out.println("La palabra existe en el diccionario.");
                    } else {
                        System.out.println("La palabra no se encontró en el diccionario.");
                    }
                    break;
                case "4":
                    System.out.println("Iniciales disponibles:");
                    Set<Character> iniciales = diccionario.obtenerInicialesDisponibles();
                    for (Character inicial : iniciales) {
                        System.out.println(inicial);
                    }
                    break;
                case "5":
                    System.out.println("Ingrese la inicial:");
                    char inicial = scanner.nextLine().charAt(0);
                    Set<String> palabras = diccionario.obtenerPalabrasPorInicial(inicial);
                    if (palabras != null) {
                        for (String p : palabras) {
                            System.out.println(p);
                        }
                    } else {
                        System.out.println("No hay palabras que comiencen con esa inicial.");
                    }
                    break;
                case "6":
                    System.out.println("Cerrando programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida, por favor intenta nuevamente.");
                    break;
            }
        }
    }
}
