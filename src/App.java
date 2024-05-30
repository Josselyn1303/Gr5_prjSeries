import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        PozoJosselyn figuras = new PozoJosselyn();
        PozoJosselyn jpSC= new PozoJosselyn();
        PozoJosselyn jpSN= new PozoJosselyn();
        //QuirolaJose jq = new QuirolaJose ();

        System.out.println("\nNombre del Grupo: POLI JUNIORS");
        System.out.println("\nIntegrantes: ");
        System.out.println("\nMorales Mateo");
        System.out.println("Novillo Alejandro");
        System.out.println("Ortiz Gelen");
        System.out.println("Ortiz Justin");
        System.out.println("Pozo Josselyn ");
        System.out.println("Quirola Jose ");

        
        System.out.println("\n ---Series Numericas---");

        //System.out.print("Primer serie numerica\n");
        //jq.mostrarSN1QJ(10);
        //System.out.print("\nSegunda serie numerica\n");
        //jq.mostrarSN2QJ(10);
        System.out.print("Ingrese el número de términos para la serie SN7: ");
        int num = scanner.nextInt();

        System.out.println("\n Resultado de la serie numerica SN7: ");
        jpSN.jpSN7(num);

        System.out.print("\nIngrese el número de términos para la serie SN8: ");

        int num2 = scanner.nextInt();
        System.out.println("\n Resultado de la serie numerica SN8: ");
        jpSN.jpSN8(num2);

        
        int ogTamano1;
        do {
            System.out.print("Introduce el tamaño de la serie numérica 9: ");
            try {
                ogTamano1 = scanner.nextInt();
                if (ogTamano1 <= 0) {
                    System.out.println("El tamaño debe ser un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.nextLine(); 
                ogTamano1 = -1; 
            }
        } while (ogTamano1 <= 0);
        OrtizGelen.ogSN9(ogTamano1);

        int ogTamano2;
        do {
            System.out.print("Introduce el tamaño de la serie numérica 10: ");
            try {
                ogTamano2 = scanner.nextInt();
                if (ogTamano2 <= 0) {
                    System.out.println("El tamaño debe ser un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.nextLine(); 
                ogTamano2 = -1; 
            }
        } while (ogTamano2 <= 0);
        OrtizGelen.ogSN10(ogTamano2);


        System.out.println("\n ---Series de Caracteres---");
        System.out.print("\nIngrese el número de términos para la serie SC1: ");
        int numCarac = scanner.nextInt();

        System.out.println("\nResultado de la serie SC1: ");
        jpSC.jpSC1(numCarac);

        System.out.println("\nIngrese el número de términos para la serie SC2: ");
        int tamanio = scanner.nextInt();
        System.out.println("\n Resultado de la serie SC2: ");
        jpSC.jpSC2(tamanio);

        int ogTamano3;
            char ogCaracter = ' ';
        do {
            System.out.println("Introduce el tamaño de la serie: ");
            try {
                ogTamano3 = scanner.nextInt();
                if (ogTamano3 <= 0) {
                    System.out.println("El tamaño debe ser un número positivo.");
                    continue;
                }
                System.out.print("Introduce el carácter a utilizar: ");
                ogCaracter = scanner.next().charAt(0);
                if (ogCaracter >= '0' && ogCaracter <= '9') {
                    System.out.println("El carácter no puede ser un número.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.nextLine(); 
                    ogTamano3 = -1; 
            }
         } while (ogTamano3 <= 0 || (ogCaracter >= '0' && ogCaracter <= '9'));
        OrtizGelen.ogSC3(ogTamano3, ogCaracter);

        int ogTamano4;
        char ogCaracter1 = ' ';
        char ogCaracter2 = ' ';
        do {
            System.out.print("Introduce el tamaño de la serie: ");
            try {
                ogTamano4 = scanner.nextInt();
                if (ogTamano4 <= 0) {
                    System.out.println("El tamaño debe ser un número positivo.");
                    continue;
                }
                System.out.print("Introduce el primer carácter a utilizar: ");
                ogCaracter1 = scanner.next().charAt(0);
                System.out.print("Introduce el segundo carácter a utilizar: ");
                ogCaracter2 = scanner.next().charAt(0);
                if ((ogCaracter1 >= '0' && ogCaracter1 <= '9') || (ogCaracter2 >= '0' && ogCaracter2 <= '9')) {
                    System.out.println("Los caracteres no pueden ser números.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.nextLine(); 
                ogTamano4 = -1; 
            }
        } while (ogTamano4 <= 0 || (ogCaracter1 >= '0' && ogCaracter1 <= '9') || (ogCaracter2 >= '0' && ogCaracter2 <= '9'));
        OrtizGelen.ogSC4(ogTamano4, ogCaracter1, ogCaracter2);
        
        /*System.out.print("\nQuinta serie caracteres\n");
        jq.mostrarSCQJ5(10);
        System.out.print("\nSexta serie caracteres\n");
        jq.mostrarSCQJ6(10);*/

        System.out.println("\n ---Series de Figuras---");
        
        System.out.println("\nIngrese el número de filas: ");
        int filas = scanner.nextInt();
        
        System.out.println("\nIngrese el símbolo que desea utilizar: ");
        char elem = scanner.next().charAt(0);

        System.out.println("\nResultado de jpSF4:");
        figuras.jpSF4(filas, elem);
        System.out.println("\nResultado de jpSF5:");
        figuras.jpSF5(filas, elem);
        System.out.println("\nResultado de jpSF6:");
        figuras.jpSF6(filas,elem);
        /*System.out.print("\nSeptima Figura\n");
        jq.mostrarFQJ7(10);
        System.out.print("\nOctava Figura\n");
        jq.mostrarFQJ8(10);
        System.out.print("\nNovena Figura\n");
        jq.mostrarFQJ9(10);*/
        int ogTamano5, ogTamano6, ogTamano7;
        do {
            System.out.print("Introduce el tamaño de la figura: ");
            try {
                ogTamano5 = scanner.nextInt();
                if (ogTamano5 <= 0) {
                    System.out.println("El tamaño debe ser un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.nextLine(); 
                ogTamano5 = -1; 
            }
        } while (ogTamano5 <= 0);
        OrtizGelen.ogF10(ogTamano5);

        do {
            System.out.print("Introduce el tamaño de la figura: ");
            try {
                ogTamano6 = scanner.nextInt();
                if (ogTamano6 <= 0) {
                    System.out.println("El tamaño debe ser un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.nextLine(); 
                ogTamano6 = -1; 
            }
        } while (ogTamano6 <= 0);
        OrtizGelen.ogF11(ogTamano6);

        do {
            System.out.print("Introduce el tamaño de la figura: ");
            try {
                ogTamano7 = scanner.nextInt();
                if (ogTamano7 <= 0) {
                    System.out.println("El tamaño debe ser un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.nextLine(); 
                ogTamano7 = -1; 
            }
        } while (ogTamano7 <= 0);
        OrtizGelen.ogF12(ogTamano7);

        scanner.close();
    }
}
