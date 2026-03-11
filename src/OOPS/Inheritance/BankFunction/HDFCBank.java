package OOPS.Inheritance.BankFunction;

public class HDFCBank extends Bank {
    public boolean IsEligible(){
        if(this.totalBalance>=2000){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        HDFCBank bank1=new HDFCBank();
        System.out.println(bank1.totalBalance);
        System.out.println(bank1.IsEligible());
    }
}
