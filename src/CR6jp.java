import java.util.Scanner;

public class CR6jp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cadena de caracteres: Ejercicio 6 Josselyn Pozo
        System.out.println("----- Cadena 6 -----");
        System.out.println("Ingrese la frase que desea trabajar:");
        String frase = sc.nextLine();
        CR6jp oCR6jp = new CR6jp();
        oCR6jp.mostrarCadena6(frase);
    }

    public void mostrarCadena6(String frase) {
        System.out.println("Su frase será invertida y modificada con las consonantes en mayúsculas:");
        frase = invertir(frase);
        System.out.println(frase);
    }

    /**
     * Invertir la frase y poner consonantes en mayúsculas
     */
    public static String invertir(String frase) {
        StringBuilder builder = new StringBuilder(frase);
        builder.reverse();

        for (int i = 0; i < builder.length(); i++) {
            char c = builder.charAt(i);
            if (esConsonante(c)) {
                builder.setCharAt(i, Character.toUpperCase(c));
            }
        }

        return builder.toString();
    }

    public static boolean esConsonante(char c) {
        c = Character.toLowerCase(c);
        return c >= 'b' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }
}