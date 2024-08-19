package Lista1;

import java.util.Scanner;
public class Q3 {
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scan.nextInt();     
        System.out.println("Numeros primos menores que " + num + ":");
        for (int i = 2; i < num; i++) {
            if (ehPrimo(i)) {
                System.out.println(i);
            }
        }
    }
}
