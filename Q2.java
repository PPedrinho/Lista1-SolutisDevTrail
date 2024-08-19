package Lista1;

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1>num2){
            System.out.println("O número " + num1 + " é maior que o número " + num2);
        }
        else if(num1<num2){
            System.out.println("O número " + num2 + " é maior que o número " + num1);
        }
        else{
            System.out.println("Os números são iguais");
        }
    }
}
