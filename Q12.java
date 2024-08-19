package Lista1;

import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quilometrosDirigidos = 0;
        int litrosConsumidos = 0;
        int totalQuilometros = 0;
        int totalLitros = 0;

        while (true) {
            System.out.print("Digite os quilômetros dirigidos para o tanque cheio (ou -1 para sair): ");
            quilometrosDirigidos = scan.nextInt();

            if (quilometrosDirigidos == -1) {
                break;
            }

            System.out.print("Digite os litros de gasolina consumidos: ");
            litrosConsumidos = scan.nextInt();

            float consumo = (float) quilometrosDirigidos / litrosConsumidos;

            System.out.printf("Consumo para o tanque cheio: %.2f km/l\n", consumo);

            totalQuilometros += quilometrosDirigidos;
            totalLitros += litrosConsumidos;

            System.out.printf("Quilometragem combinada: %d km\n", totalQuilometros);
            System.out.printf("Soma total de litros de combustível consumidos: %d litros\n", totalLitros);
        }
        scan.close();
    }
}
