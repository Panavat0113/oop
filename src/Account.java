public class Account {
    protected int balance;
    protected String name;
    public Account (int balance, String name){
        this.name = name;
        this.balance = balance;
    }
    public void deposit(int a){
        if (a > 0){
            balance += a;
//            System.out.println(a +" baht is deposited to "+ name +".");
//        }else{
//            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(int a){
        if (a > 0 && balance-a > 0){
            balance -= a;
//            System.out.println(a +" baht is withdrawn from "+ name +".");
//        }else if (a < 0){
//            System.out.println("Input number must be a positive integer.");
//        }else{
//            System.out.println("Not enough money!");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
    public void showAccount(){
        System.out.println(name +" account has "+ balance +" baht.");
    }
}