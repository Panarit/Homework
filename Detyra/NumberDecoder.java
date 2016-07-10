import javax.swing.*;
/**Kjo klase dekodon numrat duke i kthyer ata ne karakteret para enkodimit*/
public class NumberDecoder
{  
   public static void main(String[] args)
   {  //Merr numrat qe duhen dekoduar nga shfrytezuesi  
      boolean more = true;
      int seed = new Integer(JOptionPane.showInputDialog("Type the seed number")).intValue();
      while (more)
      {  int number = new Integer(JOptionPane.showInputDialog("Type the number you want to decode.\nIf you want to quit type -1")).intValue();
         if ( number == -1 )
         { more = false; }
         else { char c = decoder(number, seed);
                System.out.println(c); 
              }
      }
   
   }
   /**Kjo metode ben dekodimin e numrave*/
   private static char decoder(int p, int seed)
   {  //Lista e cila permban numrat ne te cilen kodohen shkronjat e alfabetit 
      int[] code = new int[27];
      code[0] = seed;
      for ( int i = 1; i != code.length; i = i + 1 )
      {  //Rregulla e kodimit te shkronjave
         code[i] = (code[i - 1] * 2) + 1; }
      //Nese nje numer nuk gjendet ne listen e numrave atehere do te printohen '.'
      char c = '.';
      boolean found = false;
      int count = 0;
      while ( !found  &&  count != code.length )
      { 
         if ( code[count] == p )
         { found = true;
            if ( count == 0 )
            { c = ' '; }
            else { c = (char)(count + 'a' - 1); }
         }
         else { count = count + 1; }
      }
      return c;
   }
}