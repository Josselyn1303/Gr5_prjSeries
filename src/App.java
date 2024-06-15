import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        PozoJosselyn figuras = new PozoJosselyn();
        PozoJosselyn jpSC= new PozoJosselyn();
        PozoJosselyn jpSN= new PozoJosselyn();
        //QuirolaJose jq = new QuirolaJose ();
        NovilloAlejandro naSN = new NovilloAlejandro();
        NovilloAlejandro naSC = new NovilloAlejandro();
        NovilloAlejandro naFig = new NovilloAlejandro();
        MosqueraMateo mateo = new MosqueraMateo();
        

        System.out.println("\nNombre del Grupo: POLI JUNIORS");
        System.out.println("\nIntegrantes: ");
        System.out.println("\nMosquera Mateo");
        System.out.println("Novillo Alejandro");
        System.out.println("Ortiz Gelen");
        System.out.println("Ortiz Justin");
        System.out.println("Pozo Josselyn ");
        System.out.println("Quirola Jose ");

        /* Serie Numerica en la cual se le pide al usuario ingresar el tamaño de la serie
         */
        System.out.println("\n ---Series Numericas---");

        mateo.mmSN5();
        mateo.mmSN6();

        int jpnum;
        do {
            System.out.print("\nIngrese el número de términos para la serie numérica SN7: ");
            try {
                jpnum = scanner.nextInt();
                if (jpnum <= 0) {
                        System.out.println("El tamaño debe ser un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.nextLine(); 
                jpnum = -1; 
            }
        } while (jpnum <= 0);

        System.out.println("\nResultado de la serie numerica SN7: ");
        jpSN.jpSN7(jpnum);

        int jpnum2;
        do {
            System.out.print("\nIngrese el número de términos para la serie SN8: ");
            try {
                jpnum2 = scanner.nextInt();
                if (jpnum2 <= 0) {
                        System.out.println("El tamaño debe ser un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.nextLine(); 
                jpnum2 = -1; 
            }
        } while (jpnum2 <= 0);

        System.out.println("\n Resultado de la serie numerica SN8: ");
        jpSN.jpSN8(jpnum2);

        int ogTamano1;
        do {
            System.out.print("\nIntroduce el tamaño de la serie numérica 9: ");
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
            System.out.println("\nIntroduce el tamaño de la serie numérica 10: ");
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

        int naTamano = 0;
        do {
            System.out.println("\nIntroduce el tamano de la serie numerica 11:");
            try {
                    naTamano = scanner.nextInt();
                if (naTamano <= 0) {
                        System.out.println("El tamano debe ser un numero positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un numero valido");
                scanner.nextLine(); 
                naTamano = -1; 
            }
        } while (naTamano <= 0);
        System.out.println("SN 11:");
        naSN.naSN11(naTamano);

        /* Inicio de la serie correspondiente a los caracteres
         * el usuario ingresa el numero de caracteres que desea
         */
        System.out.println("\n ---Series de Caracteres---");

        int jpnumCarac;
        do {
            System.out.print("\nIngrese el número de términos para la serie SC1: ");
            try {
                    jpnumCarac = scanner.nextInt();
                if (jpnumCarac <= 0) {
                        System.out.println("El nnúmero de términos debe ser un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.nextLine(); 
                jpnumCarac = -1; 
            }
        } while (jpnumCarac <= 0);

        System.out.println("\nResultado de la serie SC1: ");
        jpSC.jpSC1(jpnumCarac);

        int jptamanio;
        do {
            System.out.println("\nIngrese el número de términos para la serie SC2: ");
            try {
                    jptamanio = scanner.nextInt();
                if (jptamanio <= 0) {
                        System.out.println("El número de términos debe ser un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.nextLine(); 
                jptamanio = -1; 
            }
        } while (jptamanio <= 0);

        System.out.println("\n Resultado de la serie SC2: ");
        jpSC.jpSC2(jptamanio);

        int ogTamano3;
        char ogCaracter = ' ';
        do {
            System.out.println("\nIntroduce el tamaño de la serie: ");
            try {
                ogTamano3 = scanner.nextInt();
                if (ogTamano3 <= 0) {
                    System.out.println("El tamaño debe ser un número positivo.");
                    continue;
                }
                System.out.println("\nIntroduce el carácter a utilizar: ");
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

        char naCaracter = ' ';
        do {
            System.out.print("Introduce el tamano de la serie 7: ");
            try {
                naTamano = scanner.nextInt();
                if (naTamano <= 0) {
                    System.out.println("El tamano debe ser un numero positivo.");
                    continue;
                }
                System.out.print("Introduce el caracter a utilizar: ");
                naCaracter = scanner.next().charAt(0);
                if (naCaracter >= 0 && naCaracter <= 9) {
                    System.out.println("Los caracteres no pueden ser numeros.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un numero valido.");
                scanner.nextLine(); 
                naTamano = -1; 
            }
        } while (naTamano <= 0 || (naCaracter >= 0 && naCaracter <= 9));
        System.out.println("SC7:");
        naSC.naSC7(naTamano, naCaracter);

        do {
            System.out.print("Introduce el tamano de la serie 8: ");
            try {
                naTamano = scanner.nextInt();
                if (naTamano <= 0) {
                    System.out.println("El tamano debe ser un numero positivo.");
                    continue;
                }
                System.out.print("Introduce el caracter a utilizar: ");
                naCaracter = scanner.next().charAt(0);
                if (naCaracter >= 0 && naCaracter <= 9) {
                    System.out.println("Los caracteres no pueden ser numeros.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un numero valido.");
                scanner.nextLine(); 
                naTamano = -1; 
            }
        } while (naTamano <= 0 || (naCaracter >= 0 && naCaracter <= 9));
        System.out.println("SC8:");
        naSC.naSC8(naTamano, naCaracter);

        mateo.mmSC9();

        mateo.mmSC10(); 

        /*Empieza la siguiente serie correspondiente a las figuras */
        System.out.println("\n ---Series de Figuras---");
        
        mateo.mmF1();
        mateo.mmF2();
        mateo.mmF3();


        int filas;
        do {
            System.out.print("Introduce el tamaño de la figura: ");
            try {
                filas = scanner.nextInt();
                if (filas <= 0) {
                    System.out.println("El tamaño debe ser un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.nextLine(); 
                filas = -1; 
            }
        } while (filas <= 0);
        
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

        do {
            System.out.println("\nIntroduce el tamano de la figura 16:");
            try {
                    naTamano = scanner.nextInt();
                if (naTamano <= 0) {
                        System.out.println("El tamano debe ser un numero positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un numero valido");
                scanner.nextLine(); 
                naTamano = -1; 
            }
        } while (naTamano <= 0);
        System.out.println("Figura 16:");
        naFig.naF16(naTamano);

        do {
            System.out.println("\nIntroduce el tamano de la figura 19:");
            try {
                    naTamano = scanner.nextInt();
                if (naTamano <= 0) {
                        System.out.println("El tamano debe ser un numero positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un numero valido");
                scanner.nextLine(); 
                naTamano = -1; 
            }
        } while (naTamano <= 0);
        System.out.println("Figura 19:");
        naFig.naF19(naTamano);

        scanner.close();
    }
}