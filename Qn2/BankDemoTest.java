package Lab8.Qn2;
import java.util.Scanner;
public class BankDemoTest {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
            CheckingAccount ca = new CheckingAccount();
            int con = 1;
            double amount =0;
            while(con ==1){
            System.out.println("Withdraw or deposit :\n1) Withdraw\n2) Deposit ");
            int choice = sc.nextInt();
            while(amount < 1){
            System.out.println("Amount?");
            amount = sc.nextDouble();
            }
            if(choice ==2){
                ca.deposit(amount);
                System.out.println("The balance after deposit is $"+ ca.getBalance());
            }
            else if(choice ==1){
            try{
                ca.withdraw(amount);
                System.out.println("The balance after withdrawal is $"+ ca.getBalance());
            }catch(InsufficientFundsException ife){
                System.err.println(ife);
                System.err.println("Sorry, but your account is short by:$" + ife.getAmount());

            }
            
            
        }   System.out.println("1)Continue \n2)End Session");
            con = sc.nextInt(); 
        }
            sc.close(); 
    }
}

