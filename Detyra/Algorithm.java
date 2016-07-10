//Kjo klase gjen te gjitha numrat e thjeshte deri ne nje shifer te caktuar
public class Algorithm
{
   public static void main(String[] args) 
   {  int bound = 71; //Te gjendet numrat e thjesht deri te ky numer
      //Duhet te ju caktohet vlera true te gjithe numrave te plotpjesetueshem me pjesen e plote te poshtme te rrenjes katrore te bound
      int sqr = (int)Math.sqrt(bound);
      //Kjo liste mbushet duke u bazuar ne faktin se a eshte nje numer i thjeshte apo jo(nese po, false; perndryshe, true)
      boolean[] composite = new boolean[bound + 1];
      for (int m = 2; m <= sqr; m++) 
      {
         if (!composite[m]) 
         {
            System.out.print(m + " ");
            for (int k = m * 2; k <= bound; k = k+m)          
               composite[k] = true;
         }
      }
      for (int m = sqr; m <= bound; m++)
      
         if (!composite[m])
         
            System.out.print(m + " ");
   }
}