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
            for (int ogNivel = 1; ogNivel <= ogTamano6; ogNivel++) {
                for (int ogEspacios = 0; ogEspacios < ogNivel * ogNivel - 1; ogEspacios++)
                    System.out.print(" ");
                System.out.print("|");
                for (int ogBase = 0; ogBase < ogNivel; ogBase++)
                    System.out.print(" _");
                System.out.println();
            }
            System.out.println();
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

    public static String ogC05(String frase) {
        
        StringBuilder builder = new StringBuilder(frase);
        builder.reverse();
        String ogFraseInvertida = builder.toString();
        StringBuilder ogFraseTransformada = new StringBuilder();
        for (int i = 0; i < ogFraseInvertida.length(); i++) {
            char c = ogFraseInvertida.charAt(i);
            if (ogEsVocal(c)) {
                ogFraseTransformada.append(Character.toUpperCase(c));
            } else {
                ogFraseTransformada.append(c);
            }
        }

        return ogFraseTransformada.toString();
    }

    
    private static boolean ogEsVocal(char c) {
        return c == 'a' || c == 'A' ||
               c == 'e' || c == 'E' ||
               c == 'i' || c == 'I' ||
               c == 'o' || c == 'O' ||
               c == 'u' || c == 'U';
    }

    public static void ogCadenaC7(String ogFrase1) {
        System.out.println("C07: ");
        System.out.println("Frase: " + ogFrase1);
        ogFrase1 = ogFrase1.toUpperCase();
    
        System.out.println("Frase en mayusculas y sin la J: ");
        for (char c : ogFrase1.toCharArray()) {
            System.out.print((c != 'J') ? c : "");
        }
        System.out.println("\n");
    }
        
    public static void ogMostrarA01(String ogNombreCompleto) {
            
        String[] ogNombres = ogNombreCompleto.split("\\s+");
    
           
        for (String ogNombre : ogNombres) {
            ogAnimacionNombre(ogNombre, ogNombre.length());
        }
    }
    
    public static void ogAnimacionNombre(String ogNombre, int ogTamano) {
        String[] ogBarra = {"[", " ", "]"};
        float ogTamanoFloat = (float) ogTamano;
    
        for (int j = 0; j < ogTamano; j++) {
            System.out.print(ogBarra[0]);
            ogBarraCuerpo(j + 1);
            System.out.print(">");
            ogBarraEspacio(ogTamano - j);
            System.out.print(ogBarra[2]);
    
            float ogDivision = ((j + 1) * 100.0f) / ogTamanoFloat;
            int ogPorcentaje = (int) ogDivision;
            System.out.print(ogPorcentaje + "%  ");
    
            try {
                delay(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
    
            for (int i = 0; i <= j; i++) {
                System.out.print(ogNombre.charAt(i));
            }
            System.out.print("\r");
        }
        System.out.println();
        
    }
    
    public static void ogBarraCuerpo(int size) {
        String ogCuerpoBarra = "=";
        for (int i = 0; i < size; i++) {
            System.out.print(ogCuerpoBarra);
        }
    }
    
    public static void ogBarraEspacio(int ogTamano) {
        for (int k = 1; k < ogTamano; k++) {
            System.out.print(" ");
        }
    }
    
    public static void delay(int ogMilisegundos) throws InterruptedException {
        Thread.sleep(ogMilisegundos);
    }
    
    public static void ogL04(){
        String ogCarga[]= {"0oo","o0o","oo0","o0o"};
        for(int ogPorcentaje=0; ogPorcentaje  <=100; ogPorcentaje ++){
            
            String c = ogCarga[ogPorcentaje %4];
            System.out.print("\r"+ c + " "+ ogPorcentaje  +"%");

            try{ Thread.sleep(100);}
            catch(InterruptedException ie){}
        }
        System.out.println();
    }

    public static void ogL08(String ogNombreIngresado){
        for (int i = 0; i <= ogNombreIngresado.length(); i++) {
            System.out.print("\rCargando: [" + getOGBarraProgreso(ogNombreIngresado, i) + "] " + i * 100 / ogNombreIngresado.length() + "%");

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
            }
        }
    }

    public static String getOGBarraProgreso(String ogNombre, int ite) {
        int ogBarTamano = ite; 
        int ogProgreso = ite * ogBarTamano / ogNombre.length();

        StringBuilder ogBarraProgreso = new StringBuilder();

        for (int i = 0; i < ogBarTamano; i++) {
            if (i < ogProgreso) {
                if (i < ite) {
                    ogBarraProgreso.append(ogNombre.charAt(i));
                } else {
                    ogBarraProgreso.append(" ");
                }
            } else {
                ogBarraProgreso.append(" ");
            }
        }
        return ogBarraProgreso.toString();
    }

    public static void ogR05(int ogN) {
        if (ogN < 1) {
            return;
        }
        ogR05(ogN - 1);
        System.out.println(ogN);
    }
}
