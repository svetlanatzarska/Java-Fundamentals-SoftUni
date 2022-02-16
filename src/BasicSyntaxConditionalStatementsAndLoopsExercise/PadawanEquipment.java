package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

       double saberCount = Math.ceil(students * 1.10);
       int beltCount = students - students / 6;

       double totalPrice = saberCount * priceLightSaber + students * priceRobe + beltCount * priceBelt;


        if (money >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",totalPrice - money);
        }

    }

}
