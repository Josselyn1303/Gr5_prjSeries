public class PozoJosselyn {

    /**
     * Este método imprime la serie, la cual se incrementa de 3 en 3 y empieza en 1 usando un ciclo For.
     * @param num: limita la serie a un número de elementos 
     * @author Pozo Josselyn 
     */
    public void jpSN7(int num){
        for (int jpnumImprimir = 1; jpnumImprimir < num * 3; jpnumImprimir += 3) {
                System.out.print( jpnumImprimir + " " );                
        }
    
        System.out.println();
    }
    
    //Esta clase genera una serie la cual se incrementa de 5 en 5 y empieza en 3
    public void jpSN8(int num){
        short jpnumImprimir = 3;
    /* Este método imprime la serie mediante un For
    * 
    * @param num: este parámetro permite limitar la serie a un numero de elementos
    */
        while (--num >= 0) {
            System.out.print(jpnumImprimir + " ");
                jpnumImprimir += 5;
        }
            System.out.println();
    }
    
    private char par, impar;
    /**
    * <b>showSerieFor</b> muestra la serie usando el ciclo for 1:  + - + - + - + ... 
    * @author: Pozo Josselyn
    */
    public void jpSC1 (int numCar){
        this.par = '+';
        this.impar = '-';
        for (int jpI = 0; jpI < numCar; jpI++) {
            if (jpI % 2 == 0)
                System.out.print(par + " ");
            else
                System.out.print(impar + " ");
        }
    }
    
    /**
    * jpSC2 muestra la serie usando el ciclo Dowhile S2:  + + ++ +++ +++++ ++++++++ +++++++++++++ ...
    * @param nroTerminos: numero de terminos para la serie
    * @author: Pozo Josselyn
    */
    public void jpSC2(int nroTerminos){
        String jpnum1 = "+";
        String jpnum2 = "+";
        if (nroTerminos < 1)
            System.out.println(jpnum1);
        else if (nroTerminos < 2)
            System.out.println(jpnum1 + " " + jpnum2);
        else {
            int i = 2;
            System.out.print(jpnum1 + " " + jpnum2 + " ");
            do {
                String suma = jpnum1 + jpnum2;
                System.out.print(suma + " ");
                jpnum1 = jpnum2;
                jpnum2 = suma;
            } while (++i < nroTerminos);
        }      
    }
    
    /*jpSF4 imprime la mitad izquierda de una piramide
    *@author: Pozo Josselyn
    */
    public void jpSF4(int filas, char elem){
            
        for (int jpI = 1; jpI <= filas; jpI++) {
            // Imprimir espacios
            for (int jpJ = 0; jpJ < filas - jpI; jpJ++) {
                System.out.print(" ");
            }
            // Imprimir caracteres
            for (int jpK = 0; jpK < jpI; jpK++) {
                System.out.print(elem);
            }
            // Nueva línea después de cada nivel de la pirámide
            System.out.println();
        }
    }
    
    /*jpSF5 imprime una piramide invertida solicitando al usuario el tamaño y el caracter 
     *@author: Pozo Josselyn
     */
    public void jpSF5(int filas, char elem){
            
        int jpI = 0;
        while (jpI < filas) {
            int jpJ = 0;
            while (jpJ < jpI) {
                System.out.print(" ");
                jpJ++;
            }
            int jpK = 0;
            while (jpK < filas * 2 - 1 - 2 * jpI) {
                System.out.print(elem);
                jpK++;
            }
            System.out.println();
            jpI++;
        } 
    }
    
    /*jpSF6: imprime una piramide solicitando al usuario el tamaño y el caracter 
     *@author: Pozo Josselyn
     */
    public void jpSF6(int filas, char elem) {
        for (int jpI = 1; jpI <= filas; jpI++) {
            // Imprimir espacios
            for (int jpJ = 0; jpJ < filas - jpI; jpJ++) {
                System.out.print(" ");
            }
            // Imprimir caracteres
            for (int jpK = 0; jpK < 2 * jpI - 1; jpK++) {
                System.out.print(elem);
            }
            // Nueva línea después de cada nivel de la pirámide
            System.out.println();
        }
    }
}
    
