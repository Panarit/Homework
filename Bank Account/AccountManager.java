/** AccountManager starts the application that maintains a bank account. */
public class AccountManager
{
   public static void main(String[] args)
   {
      BankAccount account = new BankAccount(0);
      BankAccount account2 = new BankAccount(0);
      BankReader reader = new BankReader();
      BankWriter writer = new BankWriter();
      AccountController controller = new AccountController(reader, writer, account, account2);
      controller.choose();
   }
}