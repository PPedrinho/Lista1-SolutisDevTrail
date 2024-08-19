package Lista1;

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma distancia em milhas: ");
        double milhas = scan.nextDouble();
        double quilometros = milhas * 1.609;
        System.out.println("Distância em quilometros: " + quilometros + "km");
    }
}
