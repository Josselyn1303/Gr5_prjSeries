/**
 * Deber poliRetos
 * Clase MosqueraMateo
 * @autor: Mateo Mosquera
 */

import java.util.Scanner;

public class MosqueraMateo {

    private int  mmN;
    private char mmCaracter;
    private int mmRepeticiones;

    /**
     * Construye series numericas, series de caracteres y figuras
     * @param mmN: variable 
     * @param mmCaracter: letra o numero 
     * @param mmRepeticiones: N de repeticiones
     */

    public MosqueraMateo(int mmN, char mmCaracter, int mmRepeticiones){
        setMmCaracter(mmCaracter);
        setMmN(mmN);
        setMmRepeticiones(mmRepeticiones);
    }

    public int getMmN() {
        return mmN;
    }
    public void setMmN(int mmN) {
        this.mmN = mmN;
    }

    public char getMmCaracter() {
        return mmCaracter;
    }

    public void setMmCaracter(char mmCaracter) {
        this.mmCaracter = mmCaracter;
    }

    public int getMmRepeticiones() {
        return mmRepeticiones;
    }

    public void setMmRepeticiones(int mmRepeticiones) {
        this.mmRepeticiones = mmRepeticiones;
    }

    /**
    * Serie Numerica
    *@param mmSN5: imprime los numeros impares 
    */

    public void mmSN5(){
        if (mmN <= 0 ){
            System.out.println("El valor debe ser mayor a 0");
            return;
        }
        int mmContador = 0;
        int mmNum = 2;

        while (mmContador < mmN){
            if (esPrimo(mmNum)){
                System.out.print(mmNum + " ");
                mmContador++;
            }
            mmNum++;
        }
        System.out.println();
    }

    public boolean esPrimo(int mmNum) {
        if (mmNum <= 1){
        return false;
        }
        for (int i = 2; i <= Math.sqrt(mmNum); i++) {
            if (mmNum % i == 0)
            return false;
        }
        return true;
        
    }

    /**
     * Serie numerica
     * @param mmSN6: imprime el cuadrado de los numeros
     */

    public void mmSN6(){
        if (mmN <= 0){
            System.out.println("El valor debe ser mayor a 0");
            return;
        }
        for (int i = 1; i <= mmN; i++) {
            System.out.print((i * i) + " ");    
        }
        System.out.println();    
    }

    /**
     * Serie de caracteres
     * @param mmSC9: imprime los numeros impares en letras del abecedario
     */

    public void mmSC9(){
        if (mmN <= 0 || mmN > 26){
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
    }

    /**
     * @param mmSC10: imprime la  serie de Fibonacci en letras del abecedario
     */

    public void mmSC10(){
        if (mmN <= 0 || mmN > 26){
            System.out.println("El valor debe ser entre 1 y 25");
            return;
        }
        int a = 1, b = 1;
        for (int i = 0; i < mmN; i++) {
            char mmLetra = (char)('a' + i);
            int mmRepeticiones;
            
            if (i == 0) {
                mmRepeticiones = a;
            }
            else if (i == 1) {
                mmRepeticiones = a;
            }
            else {
                mmRepeticiones =  b;
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
    }

    /**
     * @param mmF1: imprime un cuadrado 
     */

    public void mmF1(){
        if (mmN >= 0 && mmN <= 50) {
        for (int i = 0; i < mmN; i++) {
                for (int j = 0; j < mmN; j++) {
                    if( i==0 || i == mmN - 1 || j == 0 || j == mmN - 1 ){
                        System.out.print(mmCaracter + " ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();   
            }    
        }
        else{
            System.out.println("Error: el tamaño debe ser entre 0 y 50");
        }           
    
    }

    /**
     * @param mmF2: Imprime un cuadrado alterno
     */

    public void mmF2(){
                
        if (mmN >= 0 && mmN <= 50) {
            
            for (int i = 0; i < mmN; i++) {
                for (int j = 0; j < mmN; j++) {
                    if( i == 0 || i == mmN - 1 || j == 0 || j == mmN - 1){
                        if ((i + j) % 2 == 0){
                            System.out.print(mmCaracter + " ");
                            }
                        else{
                            System.out.print("+ ");
                            }
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();   
                }    
            }
            else{
                System.out.println("Error: el tamaño debe ser entre 0 y 50");
            }   
    }
    
    /**
     * @param mmF3: imprime un triangulo
     */

    public void mmF3(){
                
        if (mmN >= 0 && mmN <= 50) {
        
                for (int i = 1; i <= mmN; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(mmCaracter + " ");
                    }   
                    System.out.println();   
                }    
            }
            else{
                System.out.println("Error: el tamaño debe ser entre 0 y 50");
            }   
    }

}    