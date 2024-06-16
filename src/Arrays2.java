/* Copyright (C) 2023, Sebastian_Ramos
 * (CodeCrew) sebastian.ramos01@epn.edu.ec
 * version 1.0
 */
/**
 * Esta clase sirve para generar una matriz con las letras de mis iniciales "quemadas y un caracter cualquiera"
 */
public class Arrays2 {
    char[][] matrizNombre;
    /**
     * Crea la matriz
     * @param tamañoMatriz el tamaño que tendra la matriz
     * @param caracter el caracter que etendran las iniciales
     */
    public void crearMatriz(int tamañoMatriz, char caracter) {
        matrizNombre = new char[tamañoMatriz][tamañoMatriz * 2 + 2];
        //espacios
        for (int fila = 0; fila < tamañoMatriz; fila++) {
            for (int col = 0; col < tamañoMatriz * 2 + 2; col++) {
                matrizNombre[fila][col] = ' ';
            }
        }
        //S
        for (int fila = 0; fila < tamañoMatriz; fila++) {
            if (fila == 0 || fila == tamañoMatriz - 1 || fila == tamañoMatriz / 2) {
                for (int col = 0; col < tamañoMatriz / 2 + 1; col++) {
                    matrizNombre[fila][col] = caracter;
                }
            } else if (fila < tamañoMatriz / 2) {
                matrizNombre[fila][tamañoMatriz / 4] = caracter;
            }
        }
         //C
         int espacioLetra = tamañoMatriz + 2;
         for (int fila = 0; fila < tamañoMatriz; fila++) {
             if (fila == 0 || fila == tamañoMatriz - 1 || fila == tamañoMatriz / 2) {
                 for (int col = espacioLetra; col < espacioLetra + tamañoMatriz / 2 + 1; col++) {
                     matrizNombre[fila][col] = caracter;
                 }
             } else {
                 matrizNombre[fila][espacioLetra] = caracter;
             }
         }
     }
    /**
     * Este metodo sirve para mostrar la matriz
     */
   public void mostrarMatriz() {
    for (char[] fila : matrizNombre) {
      for (char valor : fila) {
        System.out.print(valor);
        }
        System.out.println();
     }  
    }
}