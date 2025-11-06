import java.util.Scanner;
public class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String conf;
        int num=0;
        System.out.println("telefonou para a vitima? ");
        conf = scanner.nextLine();
        if ( conf.equals("sim")){
            num ++;
        }
        System.out.println(" esteve no local do crime? ");
        conf = scanner.nextLine();
        if ( conf.equals("sim")){
            num ++;
        }
        System.out.println(" mora perto da vitima? ");
        conf = scanner.nextLine();
        if ( conf.equals("sim")){
            num ++;
        }
        System.out.println(" devia para a vitima? ");
        conf = scanner.nextLine();
        if ( conf.equals("sim")){
            num ++;
        }
        System.out.println(" já trabalhou para a vitima? ");
        conf = scanner.nextLine();
        if ( conf.equals("sim")){
            num ++;
        }
        System.out.println(" foi vista perto da cena do crime? ");
        conf = scanner.nextLine();
        if ( conf.equals("sim")){
            num ++;
        }
        System.out.println("possuia algum objeto da vitima? ");
        conf = scanner.nextLine();
        if ( conf.equals("sim")){
            num ++;
        }
        System.out.println("tentou fugir apos o crime?  ");
        conf = scanner.nextLine();
        if ( conf.equals("sim")){
            num ++;
        }
        if ( num <= 2){
            System.out.println("suspeito");
        }
        else if ( num == 3 || num == 4){
            System.out.println("cumplice");
        }
        else if ( num == 5 || num == 6){
            System.out.println("assassino");
        }
        else {
            System.out.println("inocente");
        }
    }
}
