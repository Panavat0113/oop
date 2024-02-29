public class Bank {
    private Account acct[];
    private int numAcct;
    public Bank(){
        acct = new Account[10];
        numAcct = 0;
    }
    public void addAccount(Account ac){
        acct[numAcct] = ac;
        numAcct += 1;
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public int getNumAccount(){
        return numAcct;
    }
    public static void main(String[] args) {
        Account a1 = new Account(5000, "Sommai");
        Account a2 = new Account(3000, "Somchai");
        Account a3 = new Account(900, "Somsri");

        Bank myBank = new Bank();
        myBank.addAccount(a1);
        myBank.addAccount(a2);
        myBank.addAccount(a3);

        System.out.println("Number of Account: " + myBank.getNumAccount());
        myBank.getAccount(0).showAccount();
        System.out.println("Deposit 500...");
        myBank.getAccount(0).deposit(500);
        myBank.getAccount(0).showAccount();
        System.out.println("Show all accounts");
        System.out.println("==============================");
        for(int i=0; i<myBank.getNumAccount(); i++){
        myBank.getAccount(i).showAccount();
        }
    }
}
