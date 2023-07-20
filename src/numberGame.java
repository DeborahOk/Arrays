// Workbook 3 Q.5
import java.util.Scanner;
public class numberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers= {2,4,5,9,3,7,8,10};
        System.out.println("Guess my number : ");
        int userNum = scanner.nextInt();

        boolean isFound = false;

        for (int i=0; i<numbers.length; i++) {
            if (userNum == numbers[i]){
                isFound = true;
            }
        }

        System.out.println("Your guess is ? " + isFound);
    }
}


