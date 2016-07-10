/**Ky aplikacion me metoden summation kthen shumen e "i" termave te pare natyror te njepasnjeshem ku termi i pare eshte 1*/
public class Detyra7_3_5_a
{  
   int sum = 0;
   int count = 1;
   /**Metoda summation kthen shumen e "i" termave te pare natyror te njepasnjeshem ku termi i pare eshte 1*/
   public int summation(int i)
   {
      while(count <= i)
           {
               sum = sum + count;
               count = count + 1;
           }
           
      return sum;
   }
   
   public static void main(String[] args)
   {
     Detyra7_3_5_a obj = new Detyra7_3_5_a();
     int i = 100;
     int sum = obj.summation(i);
     System.out.println("Shumimi i numrit " + i + " eshte " + sum);
   }
  
}