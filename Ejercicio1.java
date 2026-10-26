
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Ingrese un numero entero positivo: ");
        N = sc.nextInt();

        while (N <= 0) {
            System.out.print("Error. Ingrese un numero positivo: ");
            N = sc.nextInt();
        }

        int suma = 0;
        int contador = 1;

        while (contador <= N) {
            suma = suma + contador;
            contador = contador + 1;
        }

        System.out.println("La suma es: " + suma);

        sc.close();
    }
}
