import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner ( System.in);
        double sal, nsal, aumento=0, percentual=0;
        System.out.println("qual seu salário? ");
        sal = Scanner.nextDouble();
        if (sal >=280){
            percentual = 0.20;
            aumento = sal * percentual;
        }
        else if (sal >= 280 && sal <= 700){
            percentual = 0.15;
            aumento = sal * percentual;
        }
        else if (sal >= 700 && sal <= 1500){
            percentual = 0.10;
            aumento = sal * percentual;
        }
        else if (sal > 1500){
            percentual = 0.05;
            aumento = sal * percentual;
        }
        System.out.println(" primeiro salario: " + sal);
        System.out.println(" percentual de aumento:" + ( percentual * 100 ));
        System.out.println(" valor do aumento: " + aumento );
        System.out.println(" novo salario: " + (sal + aumento));
        Scanner.close();
    }
}
