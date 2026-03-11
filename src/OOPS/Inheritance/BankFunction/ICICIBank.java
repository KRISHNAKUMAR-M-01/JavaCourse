package OOPS.Inheritance.BankFunction;

public class ICICIBank extends Bank{
    int balance=this.totalBalance;
    public void deposit(int amount){
        this.balance += amount;
        this.totalBalance =this.balance;
        System.out.println("Deposited " + amount + " from " + this.totalBalance);
    }
    public void withdraw(int amount){
        if(this.balance >= amount){
            System.out.println("Withdrawn " + amount + " from " + this.totalBalance);
            this.balance -= amount;
            this.totalBalance =this.balance;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public static void main(String[] args) {
        ICICIBank bank = new ICICIBank();
        bank.deposit(1500);
        bank.withdraw(500);
        System.out.println("Current Balance:"+bank.checkBalance());
    }
}
