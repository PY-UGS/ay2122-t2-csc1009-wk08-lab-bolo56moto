package Lab8.Qn2;

public class CheckingAccount {
    double balance = 0;


    public void deposit(double amount){
        this.balance += amount;

    }

    public void withdraw(double amount) throws Exception{
        if(this.balance <amount) throw new InsufficientFundsException(amount-balance);
        this.balance -=amount;

    }
    
    public double getBalance(){
        return balance;
    }

    public double getNumber(double number){
        return number;
    }
    
}
