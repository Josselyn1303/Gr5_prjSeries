public class OrtizJustin {
    /*
     * Metodo para imrprimir la serie numerica 3 con caracteres +
     * @author: Kam1kaze54
     */

    public void OJSN3(int n) {
        
        int ojIncremento = 1; 
        int ojNumero = 1; 

        for (int i = 1; i <= n; i++) {
            
            for (int j = 0; j < ojNumero; j++) {
                System.out.print("+");
            }
            if (i < n) {
                System.out.print(" "); 
            }
            
            ojNumero += ojIncremento;
            ojIncremento += 2; 
        }
    }
/*
 * Imprime los caracteres + - * y / sucesivamente durante 6 veces
 * @author: Kam1kaze54
 */
    public void OJSN4(int n){
        char [] ojChars = {'+', '-', '*', '/'};
        for (int i = 0; i < n; i++){
            System.out.println(ojChars[i % ojChars.length]);
            
        }
        
    }
    /*
     * Imprime un traingulo recatangulo de formasucesiva e interlineada del con los caracteres del 1 al 9 
     * @author: Kam1kaze54
     */
    public void OJF13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); 
        }
    }
    /*
     * Imprime un triangulo de pascal, el traingulo es un isoceles
     * @author: Kam1kaze54
     */
    public void OJF14(int n) {
        for (int linea = 1; linea <= n; linea++) {
           
            for (int k = 0; k < n - linea; k++) {
                System.out.print("  ");
            }

            int num = 1;
            for (int i = 1; i <= linea; i++) {
                System.out.print(num + "   ");
                num = num * (linea - i) / i;
            }
            System.out.println(); 
        }
    }
    /*
     * Imprime un triangulo rectangulo de pascal 
     * author: Kam1kaze54
     */
    public void OJF15(int n) {
        for (int line = 0; line < n; line++) {
            int num = 1;
            System.out.print("1 ");
            for (int i = 0; i < line; i++) {
                num = num * (line - i) / (i + 1);
                System.out.print(num + " ");
            }
            System.out.println(); 
        }
    }
}