package Lista1;

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Q9 calc = new Q9();
        calc.calcArea();
    }

    public static void calcArea() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Area do circulo: " + String.format("%.2f", area));
    }
}
