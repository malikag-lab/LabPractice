/*Create a BankAccount class with:
accountNumber (public).
accountHolder (protected).
balance (private).
Write methods to:
Access and modify balance using public methods.
Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.
 */
class SavingsAccount extends Bank_Account{

    boolean hasSavingsAccount;
    SavingsAccount(String accountNumber,String accountHolder, int balance, boolean hasSavingsAccount){
        super(accountNumber, accountHolder, balance);
        this.hasSavingsAccount=hasSavingsAccount;
    }

    void displaySavingsAccount(){
        System.out.println("The Account Number is: "+accountNumber);
        System.out.println("The Account Holder is: "+accountHolder);
        System.out.println("The Balance is: "+getBalance());
        System.out.println("Is this a savings account? "+hasSavingsAccount);
        System.out.println();
    }
}
public class Bank_Account {
  public String accountNumber;
  protected String accountHolder;
  private int balance;

  Bank_Account(String accountNumber,String accountHolder, int balance)
{
    this.accountNumber=accountNumber;
    this.accountHolder=accountHolder;
    this.balance=balance;
   
}    

  int getBalance(){
    return balance;
  }
  void setBalance(int balance)
{
    this.balance=balance;
}
void displayBankAccount(){
    System.out.println("The Account Number is: "+accountNumber);
    System.out.println("The Account Holder is: "+accountHolder);
    System.out.println("The Balance is: "+balance);
    System.out.println();
}
    public static void main(String[] args) {
     Bank_Account obj= new Bank_Account("10108900", "Malika", 95000);
     obj.displayBankAccount();
     System.out.println("Changing the Balance: ");
     obj.setBalance(105000);
     System.out.println("Displaying the updated Details: "); 
     obj.displayBankAccount();  

     SavingsAccount obj2=new SavingsAccount("10347890", "John", 67000, true);
     obj2.displaySavingsAccount();
     System.out.println("Changing the Balance: ");
     obj2.setBalance(78000);
     System.out.println("Displaying the updated Details: ");
     obj2.displaySavingsAccount();
    }
}
