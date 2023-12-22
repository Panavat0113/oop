import java.util.*;
public class lap2_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tax= input.nextDouble();
        if (tax > 50000) {
            System.out.println(tax*0.1);
        } else {
            System.out.println(tax*0.05);
        }
    }
}
