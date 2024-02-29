
import java.util.*;
class Collection_API {
private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;
    public Collection_API(){
        this("", "");
    }
    public Collection_API(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
        numOfAccount = 0;
    }
    public Account getAccount(int index){
       return (Account) acct.get(index);
    }
    public void addAccount(Account acct){
       this.acct.add(acct);
       numOfAccount += 1;
    }
   public int getNumOfAccount(){
       return acct.size();
   }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    @Override
    public String toString(){
        if (acct == null){
            return firstName+" "+lastName+" doesn’t have account.";
        }else{
            return "The " + firstName+" "+lastName + " account has " + numOfAccount;
        }
    }
    public boolean equals(Customer c){
        if (firstName.equals(c.getFirstName()) && lastName.equals(c.getLastName())){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        System.out.println(cust);
        for (int i = 0; i < cust.getNumOfAccount(); i++) {
        cust.getAccount(i).showAccount();
        }
     }
}
