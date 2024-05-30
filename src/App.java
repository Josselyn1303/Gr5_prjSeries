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


        System.out.println("\n ---Series de Caracteres---");
        System.out.print("\nIngrese el número de términos para la serie SC1: ");
        int numCarac = scanner.nextInt();

        System.out.println("\nResultado de la serie SC1: ");
        jpSC.jpSC1(numCarac);

        System.out.println("\nIngrese el número de términos para la serie SC2: ");
        int tamanio = scanner.nextInt();
        System.out.println("\n Resultado de la serie SC2: ");
        jpSC.jpSC2(tamanio);
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

        scanner.close();
    }
}
