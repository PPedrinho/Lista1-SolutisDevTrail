package Lista1;

import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Q8 palindromo = new Q8();
        palindromo.palindromoCheck();
}

public static void palindromoCheck() { 
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite uma palavra: ");
    String palavra = scan.nextLine();
    String palavraInvertida = "";

    for (int i = palavra.length() - 1; i >= 0; i--) {
        palavraInvertida += palavra.charAt(i);
    }
    
    if (palavra.equals(palavraInvertida)) {
        System.out.println("A palavra '" + palavra + "' é um palindromo");
    } else {
        System.out.println("A palavra '" + palavra + "' não é um palindromo");
    }
}
}