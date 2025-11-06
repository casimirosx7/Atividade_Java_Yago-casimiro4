import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        double sal, nsalario, valor, vhora, desc=0;
        Scanner Scanner = new Scanner ( System.in);
        System.out.println("quantas horas você trabalha? ");
        valor = Scanner.nextDouble();
        System.out.println("quanto você recebe por hora? ");
        vhora = Scanner.nextDouble();
        sal = valor * vhora;
        if ( sal <= 1518){
            desc = 0;
        }
        else if ( sal <= 2700){
            desc = 0.05; 
        }
        else if (sal <= 3400){
            desc = 0.10;
        }  
        else if (sal > 400){
            desc = 0.20;
        } 
        nsalario = sal - (sal * desc) - (sal * 0.10);
        System.out.println("seu salário é : " + nsalario);
        Scanner.close();
    }
}