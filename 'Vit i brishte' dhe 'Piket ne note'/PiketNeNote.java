import javax.swing.*;
/**Kthen rezultatin e nje testi nga numri ne shkronje(note) */
public class PiketNeNote
{
   public static void main(String[] args)
   {
      int piket = new Integer(JOptionPane.showInputDialog("Shkruaji piket:")).intValue();
      String nota = "";
      //Kthen piket e testit ne note
      /*Per nje note te caktuar ekziston nje interval i caktuar i pikeve, p.sh. me pike prej 90 deri ne 100 
        mund te sigurohet nota A*/
      /*Piket jane pjesetuar me 10 me qellim qe ne nje rast(case) te perfshihet nje interval i plote(nje note)*/
      switch(piket/10)
        {
            case 10: {nota = "A";
                     break;}
            case 9: {nota = "A";
                     break;}
            case 8: {nota = "B";
                     break;}
            case 7: {nota = "C";
                     break;}
            case 6: {nota = "D";
                     break;}
            default: {nota = "F";}       
         }
      JOptionPane.showMessageDialog(null,"Nota juaj eshte " + nota);
   }
}