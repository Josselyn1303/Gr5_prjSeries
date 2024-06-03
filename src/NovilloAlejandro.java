public class NovilloAlejandro {
    
    
    public void naSN11(int tamano) {
        int valor = 2;
        int diferencia = 4; 

        for (int i = 0; i < tamano; i++) {
            System.out.print(valor + " ");
            valor += diferencia;
            diferencia += 2;
        }
    }

    public void naSC7(int tamano, char caracter) {
        for (int i = 0, k = 2; i < tamano; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(caracter);
            }
            k = k + 2;
            System.out.print(" ");
            caracter++;
        }
        System.out.println("");
    }

    public void naSC8(int tamano, char caracter){
        for (int i = 0, k = 1; i < tamano; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(caracter);
            }
            k = k + 2;
            System.out.print(" ");
            caracter++;
        }
        System.out.println("");
    }

    public void naF16(int tamano) {
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
               if (j == i || j == tamano - i - 1){
                    if (i % 2 == 0){
                        System.out.print("+");
                    }else{
                        System.out.print("-");
                    }
                }else{
                    System.out.print(" ");
               }
            }
            System.out.println("");
        }
    }

    public void naF19(int tamano){
        int[][] numeros = new int[tamano][tamano];
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
               if (i > j && j != 0){
                    if (j == 1){
                        numeros[i][j] = i + 1;
                    }else if (i == j + 1){
                        numeros[i][j] = i + j;
                    }else {
                        numeros[i][j] = numeros[i - 1][j] + numeros[i - 1][j - 1];
                    }
               }
            }
        }
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
               if (i >= j){
                    if (j == i){
                        System.out.print("* ");
                    }else if (j == 0){
                        System.out.print("+ ");
                    }else if (j == 1){
                        System.out.print(numeros[i][j] + " ");
                    }else if (i == j + 1){
                        System.out.print(numeros[i][j] + " ");
                    }else{
                        System.out.print(numeros[i][j] + " ");
                    }
               }
            }
            System.out.println("");
        }
    }
}
