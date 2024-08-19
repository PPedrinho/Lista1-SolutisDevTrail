package Lista1;

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        int num = scan.nextInt();
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
        System.out.println(dias[num - 1]);
    }
}

