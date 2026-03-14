package ExceptionHandling;

public class BankService {
    int Balance =10000;
    void withdraw(int amount) throws Exception {
        if(amount>Balance){
            throw new Exception("Insufficient Balance");
        }
        {
            this.Balance=this.Balance - amount;
            System.out.println("Withdraw Successful");
        }
    }
    public static void main(String[] args) throws Exception {
        BankService bank = new BankService();
        try{
            bank.withdraw(1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            bank.withdraw(1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Balance is "+bank.Balance);
    }
}
