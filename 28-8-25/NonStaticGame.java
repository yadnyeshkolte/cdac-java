import java.util.Scanner;
public class NonStaticGame {

    public boolean returnOddEvenNumber(int num) {
        return num%2==0;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        NonStaticGame game = new NonStaticGame();
        boolean methodReturn = game.returnOddEvenNumber(num);
        System.out.println("It is " + methodReturn +" Even from Non Static method ");

        NonStaticUsingInGame four = new NonStaticUsingInGame();
        four.printOddEvenNumber(num);
    }
}
