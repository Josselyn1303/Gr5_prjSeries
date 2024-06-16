import java.util.Scanner;

// Clase que simula una carga carga
public class Loading3 {
    Scanner sc = new Scanner(System.in);

    /**
     * Este método pide un carácter y simula una barra de carga con este
     */
    public void mostrarLoading3() throws InterruptedException {
        System.out.print("Ingresa el carácter de carga: ");
        char caracter = sc.next().charAt(0);

        int porcentaje = 0;

        System.out.println();
        while (porcentaje <= 100) {
            int ubicacionCaracter = porcentaje / 5,
            espacios = 20 - ubicacionCaracter;
            
            System.out.print("\r[");

            for (int i = 0; i < ubicacionCaracter; i++)
                System.out.print(" ");
            System.out.print(caracter);
            for (int i = 0; i < espacios; i++)
                System.out.print(" ");

            System.out.print("] " + porcentaje + "%");
            Thread.sleep(100);
            porcentaje += 5;
        }

        System.out.println("\n");
    }
}