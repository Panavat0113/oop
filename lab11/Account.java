public class Account {
    protected double balance;
    protected String name;
    public Account (double balance, String name){
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double a){
        if (a > 0){
            balance += a;
            System.out.println(a +" baht is deposited to "+ name +".");
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double a) throws WithdrawException{
        if (a > 0 && balance-a > 0){
            balance -= a;
            System.out.println(a +" baht is withdrawn from "+ name +".");
        }else if (a < 0){
            System.out.println("Input number must be a positive integer.");
        }else{
            throw new WithdrawException("Account <"+this.getName()+"> has not enough money.");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void showAccount(){
        System.out.println(name +" account has "+ balance +" baht.");
    }
}