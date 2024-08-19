package Lista1;

import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Q10 q10 = new Q10();
        q10.verificarCaracteres();
    }

    public void verificarCaracteres() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine();
        int qtdVogais = 0;
        int qtdEspacos = 0;
        int qtdConsoantes = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                qtdVogais++;
            } else if (frase.charAt(i) == ' ') {
                qtdEspacos++;
            } else {
                qtdConsoantes++;
            }
        }
        System.out.println("Quantidade de vogais: " + qtdVogais);
        System.out.println("Quantidade de espacos em branco: " + qtdEspacos);
        System.out.println("Quantidade de consoantes: " + qtdConsoantes);
    }
}
