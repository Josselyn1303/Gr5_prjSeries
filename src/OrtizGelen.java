public class OrtizGelen {
 /**
     * Imprime una secuencia de números que se van multiplicanco por 2 sucesivamente
     * @param OgTamano1: Tamaño de la secuencia ingresado desde consola
     */
    public static void ogSN9(int OgTamano1) {
        System.out.println("SN9:");
        int ogValorInicial = 2;
        for (int i = 1; i <= OgTamano1; i++) {
            System.out.print(ogValorInicial + " ");
            ogValorInicial *= 2;
        }
        System.out.println();
    }
    /**
     * Imprime una sceuencia de números que se van multiplicando por 3 sucesivamente 
     * @param OgTamano2: Tamaño de la secuencia ingresado desde consola
     */
    public static void ogSN10(int OgTamano2) {
        System.out.println("SN10:");
        int ogValorInicial = 3;
        for (int i = 1; i <= OgTamano2; i++) {
            System.out.print(ogValorInicial + " ");
            ogValorInicial *= 3;
        }
        System.out.println();
    }
    /**
     * Imprime una sceuncia de caracteres y actualiza el contador de números primos
     * @param ogTamano: Tamaño de la secuencia ingresado desde consola
     * @param ogCaracter: Caracter ingresado desde consola
     *  
     */
    public static void ogSC3(int ogTamano, char ogCaracter) {
        System.out.println("SC3:");
        int ogNumero1 = 2;
        for (int i = 1; i <= ogTamano; i++) {
            for (int j = 0; j < ogNumero1; j++) {
                System.out.print(ogCaracter);
            }
            System.out.print(" ");
            
            ogNumero1 = siguientePrimo(ogNumero1);
        }
        System.out.println();
    }
    /**
     * Permite encontrar el siguiente numero primo
     * @param ogNumero2: Número entero 
     * @return retorna el número primo encontrado
     */
    public static int siguientePrimo(int ogNumero2) {
       
        ogNumero2++;
        while (!esPrimo(ogNumero2)) {
            ogNumero2++;
        }
        return ogNumero2;
    }
    /**
     * Verifica si el numero dado es primo
     * @param ogNumero3: Número entero
     * @return retorna true o false dependiendo si el numero es primo o no
     */
    public static boolean esPrimo(int ogNumero3) {
        
        if (ogNumero3 <= 1) {
            return false;
        }
        for (int i = 2; i * i <= ogNumero3; i++) {
            if (ogNumero3 % i == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     *Imprime una serie de caracteres diferentes
     * @param ogTamano4: Tamaño ingresado desde consola
     * @param ogCaracter1: Caracter1 ingresado desde consola
     * @param ogCaracter2: Caracter2 ingresado desde consola
     */
    public static void ogSC4(int ogTamano4, char ogCaracter1, char ogCaracter2) {
        System.out.println("SC4:");
        for (int i = 1; i <= ogTamano4; i++) {
            for (int j = 0; j < ogTamano4; j++) {
                if (j % 4 == 0) {
                    System.out.print(ogCaracter1);
                } else if (j % 4 == 1) {
                    System.out.print("-");
                } else if (j % 4 == 2) {
                    System.out.print(ogCaracter2);
                } else {
                    System.out.print("/");
                }
            }
            System.out.print(" ");
        }
        System.out.println();
    }
    /**
     * Imprime una figura de caracteres
     * @param ogTamano5: Tamaño ingresado desde consola
     */
    public static void ogF10(int ogTamano5) {
        System.out.println("F10:");
        for (int i = 0; i < ogTamano5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("      "); // Espacios al inicio
            }
            if (i == 0) {
                System.out.println("_+_");
            } else if (i % 2 == 1) {
                System.out.println("| _-_");
            } else {
                System.out.println("| _+_");
            }
        }
        for (int i = 0; i < ogTamano5 - 1; i++) {
            System.out.print("        ");
        }
        System.out.println("|");
    }

    /**
     * Imprime una figura de caracteres
     * @param ogTamano6: Tamaño ingresado desde consola
     */

    public static void ogF11(int ogTamano6) {
        System.out.println("F11:");
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print("    "); 
                }
                System.out.print("| "); 
                for (int k = 1; k <= i; k++) {
                    System.out.print("_ ");
                }
                System.out.println();
            }
        }
        /**
         * Imprime una secuencia númerica de forma descendente
         * @param ogTamano7: Tamaño ingresado desde consola
         */
        public static void ogF12(int ogTamano7) {
            System.out.println("F12:");
            for (int i = ogTamano7; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
}
