import java.util.Scanner;
/**
     * Esta clase imprime la serie numerica, de caracters y figuras
     * @param Mosquera Mateo 
     */
public class MosqueraMateo {
    private int mmN;       // Número de elementos generados para las series
    private int mmTam;     // Tamaño deseado para la serie
    private char mmCaracter; // Caracter a utilizar en ciertas series

    /**
     * Constructor para inicializar la clase con mmN a 0.
     */
    public MosqueraMateo() {
        this.mmN = 0;
    }

    /**
     * Obtiene el número de elementos generados para la serie.
     *
     * @return Número de elementos generados para la serie
     */
    public int getMmN() {
        return mmN;
    }

    /**
     * Establece el número de elementos generados para la serie.
     *
     * @param mmN Número de elementos generados para la serie
     */
    public void setMmN(int mmN) {
        this.mmN = mmN;
    }

    /**
     * Obtiene el tamaño deseado para la serie.
     *
     * @return Tamaño deseado para la serie
     */
    public int getMmTam() {
        return mmTam;
    }

    /**
     * Establece el tamaño deseado para la serie.
     *
     * @param mmTam Tamaño deseado para la serie
     */
    public void setMmTam(int mmTam) {
        this.mmTam = mmTam;
    }

    /**
     * Obtiene el carácter a utilizar en ciertas series.
     *
     * @return Caracter a utilizar
     */
    public char getMmCaracter() {
        return mmCaracter;
    }

    /**
     * Establece el carácter a utilizar en ciertas series.
     *
     * @param mmCaracter Caracter a utilizar
     */
    public void setMmCaracter(char mmCaracter) {
        this.mmCaracter = mmCaracter;
    }

    /**
     * Método para generar y mostrar una serie de números impares hasta el tamaño deseado.
     */
    public void mmSN5() {
        int opc = -1;

        try {
            System.out.println("Ingrese el tamaño de la serie de números impares: ");
            opc = App.sc.nextInt();

            if (opc <= 0) {
                System.out.println("El tamaño de la serie debe ser mayor a cero.");
                return;
            }

            setMmTam(opc);
            setMmN(0);

            for (int i = 1; getMmN() < getMmTam(); i += 2) {
                System.out.print(i + " ");
                setMmN(getMmN() + 1);
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese solo números.");
            App.sc.next(); 
        }
    }

    /**
     * Método para generar y mostrar una serie de cuadrados hasta el tamaño deseado.
     */
    public void mmSN6() {
        int opc = -1;

        try {
            System.out.println("\nIngrese el tamaño de la serie de cuadrados: ");
            opc = App.sc.nextInt();

            if (opc <= 0) {
                System.out.println("El tamaño de la serie debe ser mayor a cero.");
                return;
            }

            setMmTam(opc);
            setMmN(0);

            for (int i = 1; getMmN() < getMmTam(); i++) {
                System.out.print(i * i + " ");
                setMmN(getMmN() + 1);
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese solo números.");
            App.sc.next(); 
        }
    }

    /**
     * Método para generar y mostrar una serie de números impares con letras hasta el tamaño deseado.
     */
    public void mmSC9() {
        int opc = -1;
        try {
            System.out.println("\nIngrese el tamaño de la serie de números impares con letras: ");
            opc = App.sc.nextInt();
            if (mmN <= 0 || mmN > 26) {
                System.out.println("El valor debe ser entre 1 y 25");
                return;
            }
            for (int i = 0; i < mmN; i++) {
                char mmLetra = (char) ('a' + i);
                int mmRepeticiones = 2 * i + 1;
                for (int j = 0; j < mmRepeticiones; j++) {
                    System.out.print(mmLetra);
                }
                System.out.print(" ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error: Ingrese solo números.");
            App.sc.next();
        }
    }

    /**
     * Método para generar y mostrar una serie de números de Fibonacci con letras hasta el tamaño deseado.
     */
    public void mmSC10() {
        int opc = -1;

        try {
            System.out.println("\nIngrese el tamaño de la serie de Fibonacci: ");
            opc = App.sc.nextInt();
            if (mmN <= 0 || mmN > 26) {
                System.out.println("El valor debe ser entre 1 y 25");
                return;
            }
            int a = 1, b = 1;
            for (int i = 0; i < mmN; i++) {
                char mmLetra = (char) ('a' + i);
                int mmRepeticiones;

                if (i == 0) {
                    mmRepeticiones = a;
                } else if (i == 1) {
                    mmRepeticiones = a;
                } else {
                    mmRepeticiones = b;
                    int c = a + b;
                    a = b;
                    b = c;
                }

                for (int j = 0; j < mmRepeticiones; j++) {
                    System.out.print(mmLetra);
                }
                System.out.print(" ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error: Ingrese solo números.");
            App.sc.next();

        }
    }

    /**
     * Método para generar y mostrar un cuadrado con un carácter deseado hasta el tamaño deseado.
     */
    public void mmF1() {
        int opc = -1;
        char c = ' ';

        try {
            System.out.println("Ingrese el tamaño del cuadrado: ");
            opc = App.sc.nextInt();
            App.sc.nextLine();  

            System.out.println("Ingrese el carácter para el cuadrado: ");
            c = App.sc.nextLine().charAt(0);

            if (opc <= 0) {
                System.out.println("El tamaño del cuadrado debe ser mayor a cero.");
                return;
            }

            for (int i = 0; i < opc; i++) {
                for (int j = 0; j < opc; j++) {
                    if (i == 0 || i == opc - 1 || j == 0 || j == opc - 1) {
                        System.out.print(c + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println(); 
            }

        } catch (Exception e) {
            System.out.println("Error: Ingrese solo números.");
            App.sc.next();
        }
    }

    /**
     * Método para generar y mostrar un cuadrado alternativo con un carácter deseado hasta el tamaño deseado.
     */
    public void mmF2() {
        int opc = -1;
        char c = ' ';

        try {
            System.out.println("Ingrese el tamaño del cuadrado alterno: ");
            opc = App.sc.nextInt();
            App.sc.nextLine(); 

            System.out.println("Ingrese el carácter para el cuadrado: ");
            c = App.sc.nextLine().charAt(0);

            if (opc <= 0) {
                System.out.println("El tamaño del cuadrado debe ser mayor a cero.");
                return;
            }

            for (int i = 0; i < opc; i++) {
                for (int j = 0; j < opc; j++) {
                    if (i == 0 || i == opc - 1 || j == 0 || j == opc - 1) {
                        if ((i + j) % 2 == 0) {
                            System.out.print(c + " ");
                        } else {
                            System.out.print("+ ");
                        }
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println(); 
            }

        } catch (Exception e) {
            System.out.println("Error: Ingrese solo números.");
            App.sc.next();
        }
    }

    /**
     * Método para generar y mostrar un triángulo rectángulo con un carácter deseado hasta el tamaño deseado.
     */
    public void mmF3() {
        int opc = -1;
        char c = ' ';

        try {
            System.out.println("\nIngrese el tamaño del triángulo rectángulo: ");
            opc = App.sc.nextInt();
            App.sc.nextLine(); 

            System.out.println("Ingrese el carácter para el triángulo: ");
            c = App.sc.nextLine().charAt(0);

            if (opc <= 0) {
                System.out.println("El tamaño del triángulo debe ser mayor a cero.");
                return;
            }

            for (int i = 1; i <= opc; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }
        } catch (Exception e){
        System.out.println("Error: Ingrese solo números.");
        App.sc.next();
        } 
    }   
}



