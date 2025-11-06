import java.util.Scanner;
public class main3 {
    public static void main(String[] args) {
        double valor, desc = 0, lv;
        Scanner scanner = new Scanner(System.in);
        System.out.println("numero de litros vendidos: ");
        lv = scanner.nextDouble();
        System.out.println("tipo de combustível (A-álcool, G-gasolina): ");
        String comb = scanner.next();

        if (comb.equalsIgnoreCase("A")) {
            valor = 1.90;
            if (lv <= 25) {
                desc = 0.035;
            } else {
                desc = 0.053;
            }
        } else if (comb.equalsIgnoreCase("G")) {
            valor = 2.50;
            if (lv <= 35) {
                desc = 0.04;
            } else {
                desc = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            scanner.close();
            return;
        }

        valor = valor * lv;
        valor = valor - (valor * desc);
        System.out.println("o valor é: " + valor);
        scanner.close();
    }

}
