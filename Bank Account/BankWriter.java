import javax.swing.*;
import java.awt.*;
import java.text.*;
/** BankWriter writes bank transactions */
public class BankWriter extends JPanel
{
   private int WIDTH = 300;
   private int HEIGHT = 200;
   private BankAccount bank;
   private BankAccount accountA;
   private BankAccount accountB;
   private String last_transaction = " "; 
   private int count;
   private int count2;
   private JFrame frame;
   public BankWriter()
   {
      frame = new JFrame();
      frame.getContentPane().add(this);
      frame.setSize(WIDTH, HEIGHT);
      frame.setVisible(true);
   }
   
   public void paintComponent(Graphics g)
   {
      g.setColor(Color.white);
      g.fillRect(0,0,WIDTH,HEIGHT);
      g.setColor(Color.black);
      int text_margin = 50;
      int text_baseline = 50;
      if(count == 1)
      g.drawString(last_transaction, text_margin, text_baseline);
      if(count == 1)
      {g.drawString("Current balance = $" + unconvert(bank.getBalance()), text_margin, text_baseline+20);
      }
      if(count2 == 1)
      {g.drawString("Current balance of account A $" + unconvert(accountA.getBalance()), text_margin, text_baseline+20);
       g.drawString("Current balance of account B $" + unconvert(accountB.getBalance()), text_margin, text_baseline+40);
       count2 = 0;}
   }  
   
   private String unconvert(int i)
   {
      double dollars_cents = i/100.0;
      return new DecimalFormat("0.00").format(dollars_cents);
   }

   public void showTransaction(String message, int amount)
   {
      last_transaction = message + " " + unconvert(amount);  
      this.repaint();
   }
   
   public void showTransaction(String message)
   {
      last_transaction = message;
      this.repaint();
   }
   
   public void change(String title, BankAccount p)
   {
      frame.setTitle(title);
      bank = p;
      count = 1;
      this.repaint();
   }
   
   public void paintBalance(BankAccount a, BankAccount b)
   {
      accountA = a;
      accountB = b;
      count2 = 1;
      count = 0;
      this.repaint();
   }
   
}