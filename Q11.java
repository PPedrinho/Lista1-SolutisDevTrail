package Lista1;

import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite duas palavras:");
        String palavra1 = scan.nextLine();
        String palavra2 = scan.nextLine();

        //verifica ordem alfabética
        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("Ordem alfabética: " + palavra1 + ", " + palavra2);
        } else if (palavra1.compareTo(palavra2) > 0) {
            System.out.println("Ordem alfabética: " + palavra2 + ", " + palavra1);
        } else {
            System.out.println("As palavras são iguais.");
        }

        //verificar qual palavra tem o maior número de caracteres
        if (palavra1.length() > palavra2.length()) {
            System.out.println("A palavra '" + palavra1 + "' tem o maior número de caracteres.");
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println("A palavra '" + palavra2 + "' tem o maior número de caracteres.");
        } else {
            System.out.println("As palavras têm o mesmo número de caracteres.");
        }
    }
}