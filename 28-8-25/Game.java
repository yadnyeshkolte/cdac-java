import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int number = UsingInGame.giveMaxOutput(num1, num2, num3);
        System.out.println(number);
    }
}
