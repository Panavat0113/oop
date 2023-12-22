import java.util.*;
public class lap2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sc.nextLine();
        System.out.print("Please insert your age : ");
        int age = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        int wday = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        int aday = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        int weight = sc.nextInt(), salary = 0;
        if (age > 20 && age <= 30) {
            salary = wday*300-aday*50;
        } else if (age > 30 && age <= 40) {
            salary = wday*500-aday*50;
        } else if (age > 40 && age <= 50) {
            salary = wday*1000-aday*25;
        } else if (age > 50 && age <= 60) {
            salary = wday*3000;
        }
        System.out.println("Hi, "+name);
        System.out.println("Your salary is "+salary+" Baht");
        if (weight >= 10 && weight <= 60) {
            salary = salary + 5000;
        } else if  (weight > 60 && weight <= 90){
            salary = salary + (5000-(weight-60)*10);
        }
        System.out.println("Your salary and bonus is "+salary+" Baht");
    }
    
}
