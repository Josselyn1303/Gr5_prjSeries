/**
* Autor: Mateo Mosquera
*/

import java.util.Scanner;

public class MosqueraMateo {
    private int mmN;       
    private int mmTam;     
    private char mmCaracter; 
    private String mmFrase;
    private char letraAEliminar;
    private String nombre;
    private int mmProgreso;
    private char mmAnimacion[];
    private static final int LONGITUD_BARRA = 20;
    private static final int TIEMPO_ESPERA = 100;

    /**
     * Constructor para inicializar la clase.
     */
    public MosqueraMateo() {
        this.mmN = 0;
        this.nombre = "";
    }
    
    /**
     * Obtiene el número de elementos generados para la serie.
     * @return Número de elementos generados para la serie
     */
    public int getMmN() {
        return mmN;
    }
    
    /**
     * Establece el número de elementos generados para la serie.
     * @param mmN Número de elementos generados para la serie
     */
    public void setMmN(int mmN) {
        this.mmN = mmN;
    }

    /**
     * Obtiene el tamaño deseado para la serie.
     * @return Tamaño deseado para la serie
     */
    public int getMmTam() {
        return mmTam;
    }
    
    /**
     * Establece el tamaño deseado para la serie.
     * @param mmTam Tamaño deseado para la serie
     */
    public void setMmTam(int mmTam) {
        this.mmTam = mmTam;
    }

    /**
     * Obtiene el carácter a utilizar en ciertas series.
     * @return Caracter a utilizar
     */
    public char getMmCaracter() {
        return mmCaracter;
    }
    
    /**
     * Obtiene la frase ingresada.
     * @return mmFrase ingresada
     */
    public String getfrase() {
        return mmFrase; 
    }
    
    /**
     * Establece la frase ingresada.
     * @param mmFrase Frase ingresada
     */
    public void setfrase(String frase) {
        this.mmFrase = frase;
    }
    
    /**
     * Obtiene la letra a eliminar.
     * @return Letra a eliminar
     */
    public char getmmLetraAEliminar() {
        return letraAEliminar;
    }
    /**
    * Obtiene el nombre ingresado.
    * @return Nombre ingresado
    */
        public String getNombre() {
            return nombre;
        }
        
    /**
     * Establece el nombre ingresado.
     * @param nombre Nombre ingresado
     */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        
    /**
     * Establece el carácter a utilizar en ciertas series.
     * @param mmCaracter Caracter a utilizar
     */

    public void setMmCaracter(char mmCaracter) {
        this.mmCaracter = mmCaracter;
    }
    
    /**
     * @param mmSN5 método para generar y mostrar una serie de números impares hasta el tamaño deseado.
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
     * @param mmSN6 método para generar y mostrar una serie de cuadrados hasta el tamaño deseado.
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
     * @param mmSC9 método para generar y mostrar una serie de números impares con letras hasta el tamaño deseado.
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
     *@param mmSC10 método para generar y mostrar una serie de números de Fibonacci con letras hasta el tamaño deseado.
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
     * @param mmF1 método para generar y mostrar un cuadrado con un carácter deseado hasta el tamaño deseado.
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
     * @param mmF2 método para generar y mostrar un cuadrado alternativo con un carácter deseado hasta el tamaño deseado.
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
     * @param mmF3 método para generar y mostrar un triángulo rectángulo con un carácter deseado hasta el tamaño deseado.
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
    
    /**
     * Establece la letra a eliminar.
     *
     * @param mmLetraAEliminar Letra a eliminar
     */
    public void setmmLetraAEliminar(char mmLetraAEliminar) {
        this.letraAEliminar = mmLetraAEliminar;
    }

    /**
     *@param mmSolicitarDatos Solicita la frase y la letra al usuario. Ejercicio C04
     */
    public void mmSolicitarDatos() {
        System.out.print("Ingrese una frase: ");
        setfrase(App.sc.nextLine());

        System.out.print("Ingrese una letra a eliminar: ");
        String letra = App.sc.nextLine();

        if (letra.length() != 1) {
            System.out.println("Por favor, ingrese solo una letra.");
            mmSolicitarDatos(); // Volver a solicitar los datos si la letra no es válida
        } else {
            setmmLetraAEliminar(letra.charAt(0));
        }
    }

    /**
     *@param mmEliminarLetra Elimina la letra especificada de la frase.
     */
    public void mmEliminarLetra() {
        setfrase(getfrase().replace(String.valueOf(getmmLetraAEliminar()), ""));
    }

    /**
     * @param mmMostrarFraseModificada Muestra la frase modificada.
     */
    public void mmMostrarFraseModificada() {
        System.out.println("Frase modificada: " + getfrase());
    }

    /**
     *@param mmSolicitarFrase solicita frase al usuario ejercicio C09
     */

    public void mmSolicitarFrase() {
        System.out.print("Ingrese una frase: ");
        setfrase(App.sc.nextLine());
    }

    /**
     *@param mmAlternarLetras alterna las letras de la frase entre mayúsculas y minúsculas.
     */
    public void mmAlternarLetras() {
        StringBuilder fraseModificada = new StringBuilder();
        boolean convertirAMayuscula = true;

        for (char c : getfrase().toCharArray()) {
            if (Character.isLetter(c)) {
                if (convertirAMayuscula) {
                    fraseModificada.append(Character.toUpperCase(c));
                } else {
                    fraseModificada.append(Character.toLowerCase(c));
                }
                convertirAMayuscula = !convertirAMayuscula;
            } else {
                fraseModificada.append(c);
            }
        }
        setfrase(fraseModificada.toString());
    }

    /**
     * @param mmMostrarFraseModificada2 muestra la frase modificada.
     */
    public void mmMostrarFraseModificada2() {
        System.out.println("Frase modificada: " + getfrase());
    }

    /**
     * @param mmSolicitaNombre solicuta el nombre al usuario.
     */
    public void mmSolicitarNombre() {
        System.out.print("Ingrese su nombre: ");
        setNombre(App.sc.nextLine());
    }

    /**
     * @param mmDibujarPlanoYGrafica dibuja el plano de coordenadas y grafica la función f(x) = 2x.
     */
    public void mmDibujarPlanoYGraficar() {
        int maxY = 2 * (getNombre().length() - 1);

        for (int y = maxY; y >= 0; y--) {
            System.out.printf("%2d |", y);

            for (int x = 0; x < getNombre().length(); x++) {
                if (y == 2 * x) {
                    System.out.print(" " + getNombre().charAt(x));
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.print("   ");
        for (int x = 0; x < getNombre().length(); x++) {
            System.out.print("__");
        }
        System.out.println();
    }
    
    /**
     * @param mmIniciarCarga inicia el indicador de carga.
     */
    public void mmIniciarCarga() {
        char[] animacion = {'|', '/', '-', '\\'};
        int progreso = 0;
        System.out.println("Cargando...");

        while (progreso <= 100) {
            System.out.print("\r " + animacion[progreso % animacion.length] + "  " + progreso + "%");
            progreso++;
            try {
                Thread.sleep(100); // 100 ms
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("El hilo fue interrumpido.");
            }
        }
        System.out.print("\r/ 100%");
        System.out.println();
    }
   
    /**
     * @param mmIniciarCarga2 inicia el indicador de carga 2.
     */
    public void mmIniciarCarga2() {
        char[] mmAnimacion = {'|', '/', '-', '\\'};
        int mmProgreso = 0;
        System.out.println("Cargando espere por favor :)");
        while (mmProgreso <= 100) {
            int mmLlenos = (mmProgreso * LONGITUD_BARRA) / 100;
            int mmVacios = LONGITUD_BARRA - mmLlenos - 1;

            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < mmLlenos; i++) {
                barra.append("=");
            }
            barra.append(mmAnimacion[mmProgreso % mmAnimacion.length]);
            for (int i = 0; i < mmVacios; i++) {
                barra.append(" ");
            }
            barra.append("] ");

            System.out.print("\r" + barra + mmProgreso + "%");
            mmProgreso++;
            try {
                Thread.sleep(TIEMPO_ESPERA); // 100 ms
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("El hilo fue interrumpido.");
            }
        }
        System.out.print("\r[====================] 100%");
        System.out.println();
    }

    /**
     * @param mmConteoRegresivo Método para solicitar al usuario el número e iniciar el conteo regresivo.
     */
    public void mmConteoRegresivo() {
        // Solicitar al usuario un número
        System.out.print("Ingrese un número para iniciar el conteo regresivo: ");
        int mmNumero = App.sc.nextInt();

        // Iniciar el conteo regresivo
        conteoRegresivo(mmNumero);
    }

    /**
     * Método recursivo para realizar un conteo regresivo desde n hasta 0.
     *
     * @param mmN Número desde el cual iniciar el conteo regresivo
     */
    private void conteoRegresivo(int mmN) {
        if (mmN < 0) {
            return; // Condición base para detener la recursión
        }

        // Imprimir el número actual
        System.out.println(mmN);

        // Llamar al método recursivamente con n-1
        conteoRegresivo(mmN - 1);
    }

}




