package Lab8.Qn2;

 
public class InsufficientFundsException extends Exception {  
  private double amount;  

  public InsufficientFundsException(double amount) throws Exception {
    this.amount = amount; 
    
} 
  public double getAmount() { 
      return amount; 
    } 
}