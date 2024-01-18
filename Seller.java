public class Seller extends Employee{
    public Food sell(Employee e){
        if (e.getWallet().getBalance() >= Food.getPrice()){
            getWallet().setBalance(getWallet().getBalance()+Food.getPrice());
            e.getWallet().setBalance(e.getWallet().getBalance()-Food.getPrice());
            return new Food();
        }else{
            System.out.println("Your money is no enough.");
            return null;
        }
    }
}
