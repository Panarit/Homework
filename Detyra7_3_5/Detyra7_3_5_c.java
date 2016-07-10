/**Ky aplikacion me metoden factorial kthen faktorielin e nje numri natyror n*/

public class Detyra7_3_5_c
{
   long factorial = 1;
   int count = 1;
   /**Metoda factoriel kthen faktorielin e nje numri natyror n*/
   public long factorial(long n)
   {
      while(count <= n)
           {
               factorial = factorial * count;
               count = count + 1;
           }
      return factorial;
   }
   
   public static void main(String[] args)
   {
     Detyra7_3_5_c obj = new Detyra7_3_5_c();
     int n = 5;
     long factorial = obj.factorial(n);
     System.out.println("Faktorieli i numrit " + n + " eshte " + factorial);
   }

}