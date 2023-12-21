import java.util.*;
public class lab3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int odd=0, even=0, num=input.nextInt();
        while (num != -1) {
            if ( num %2 == 0) {
                even += 1;
            }else{
                odd += 1;
            }
            num=input.nextInt();
        }
        System.out.println("Odd number = "+ odd +" and Even number = "+ even);
    }
}
