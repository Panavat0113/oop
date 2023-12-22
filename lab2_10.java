import java.util.*;
public class lap2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your money : ");
        int tax = input.nextInt();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char text = input.next().charAt(0);
        if (text == 'A') {
            System.out.println("Your total money in one year = "+tax*1.015);
        } else if (text == 'B') {
            System.out.println("Your total money in one year = "+tax*1.02);
        } else if (text == 'C') {
            System.out.println("Your total money in one year = "+tax*1.015);
        } else {
            System.out.println("Your total money in one year = "+tax*1.05);
        }
    }
}
