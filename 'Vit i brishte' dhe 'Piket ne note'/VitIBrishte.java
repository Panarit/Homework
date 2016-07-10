import javax.swing.*;
/**Tregon se nje vit a eshte i brishte apo jo*/
public class VitIBrishte
{
   public static void main(String[] args)
   {
      int viti = new Integer(JOptionPane.showInputDialog("Shkruaj vitin")).intValue();  
      String brishtesia = "";
      if(viti%4 == 0)
        {
            if(viti%100 == 0)
              {
                  if(viti%400 == 0)
                    {
                     brishtesia = "i brishte";
                    }
                 else{brishtesia = "jo i brishte";}
              }
            else{brishtesia = "i brishte";}
        }
     else
         {
            brishtesia = "jo i brishte";
         }
       JOptionPane.showMessageDialog(null,"Viti " + viti + " eshte vit " + brishtesia );

   }
}