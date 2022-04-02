package TextProcessingExercises;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringWouldExplode = scanner.nextLine();

        StringBuilder survived = new StringBuilder();
        int power = 0;
        for (int i = 0; i <stringWouldExplode.length() ; i++) {
            char currentElement = stringWouldExplode.charAt(i);
            if(currentElement == '>'){
                survived.append(currentElement);
                power+=Integer.parseInt(String.valueOf(stringWouldExplode.charAt(i + 1)));
            }else if(power == 0){
                survived.append(currentElement);
            }else{
                power--;
            }
        }

        System.out.println(survived.toString());


    }
}
