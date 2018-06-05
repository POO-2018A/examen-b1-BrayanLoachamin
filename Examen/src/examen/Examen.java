package examen;

import java.util.Scanner;

/**
 *
 * @author ESFOT
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a la Biblioteca");
        int opc = 0;
        Libros[] libros = new Libros[10];
        boolean favorito;
        do {
            favorito = false;

            Scanner scan = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. ¿Desea ingresar datos de algun libro?");
            System.out.println("2. Favoritos");
            System.out.println("3. Libros del autor");
            System.out.print("Ingrese una opcion: ");
            int opcion = scan.nextInt();

            switch (opcion) {

                case 1:

                    for (int i = 0; i < libros.length; i++) {
                        if (i > 9) {
                            System.out.println("La sala esta llena, ya no puede ingresar mas libros");
                        }
                        System.out.println("Ingrese los datos del libro " + (i + 1));
                        scan.nextLine();

                        System.out.println("Nombre: ");
                        String nombre = scan.nextLine();

                        System.out.println("Autor: ");
                        String autor = scan.nextLine();

                        System.out.println("Pais del autor:");
                        String pais = scan.nextLine();

                        System.out.println("Año de lanzamiento del libro: ");
                        int anio = scan.nextInt();

                        System.out.println("Desea ingresar este libro a sus favoritos");
                        System.out.println("Si=1 / No=0");
                        int num = scan.nextInt();

                    }

                    break;

                case 2:

                    break;
                case 3:

                    System.out.println("Libros de autor");
                    System.out.println("Informacion: " + libros.toString());

                    break;

                default:
                    if (opc != 3) {
                        System.out.println("Ingrese una opcion valida");
                    }
                    break;
            }
        } while (opc != 3);
    }

    @Override
    public String toString() {
        return "Examen{" + '}';
    }

}
