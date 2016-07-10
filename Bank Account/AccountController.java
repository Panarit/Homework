/** AccountController maintains the balance on a bank account. */
public class AccountController
{
   private BankReader reader;
   private BankWriter writer;
   private BankAccount accountA;
   private BankAccount accountB;
   private BankAccount account;


public AccountController(BankReader r, BankWriter w, BankAccount a, BankAccount b)
{
   reader = r;
   writer = w;
   accountA = a;
   accountB = b;
}

public void choose()
{
   char command1 = reader.readCommand("Type the user:\nA = user A\nB = user B\nE = Accountant");
   if(command1 == 'A')
      {account = accountA;
       writer.change("Account of user A", account);
       processTransactions();
         
      }
   else{ if(command1 == 'B')
          {
            account = accountB;
            writer.change("Account of user B",account);
           this.processTransactions();
          }
         else{ writer.change("", account);
               char command2 = reader.readCommand("Type A to enter the account of user A\nType B to enter the account of user B\nType R to view their balances");
               if(command2 == 'A')
                 {account = accountA;
                  writer.change("Account of user A", account);
                  this.processTransactions();
                 }
               else{ if(command2 == 'B')
                   {
                     account = accountB;
                     writer.change("Account of user B",account);
                     this.processTransactions();
                   }               
                   else {writer.paintBalance(accountA, accountB);
                        this.choose(); }
                       } 
             }
       }
}

public void processTransactions()
{
   char command = reader.readCommand("Command (D,W,Q,C) and amount:\nD=Deposit\nW=Withdraw\nQ=Quit\nC=Change user");
   if(command == 'Q'){}
   else{ if(command == 'D')
            {
               int amount = reader.readAmount();
               boolean ok = account.deposit(amount);
               if(ok)
                 {writer.showTransaction("Latest deposit of $", amount);
                  this.processTransactions();}
               else{writer.showTransaction("Deposit invalid ", amount);
                    this.processTransactions();}  
            }
         else if(command == 'W')
               {
                  int amount = reader.readAmount();
                  boolean ok = account.withdraw(amount);
                  if(ok){writer.showTransaction("Latest withdrawal of $",amount);
                         this.processTransactions();
                        }
                     else{writer.showTransaction("Withdrawal invalid ", amount);
                           this.processTransactions();  
                         }
               } 
               else{ if(command == 'C')
                        {
                           this.choose();
                        }
                     else { writer.showTransaction("Illegal command: " + command);}
                     
                   }
       }
}



}