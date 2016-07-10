/**Ky aplikacion me metoden product kthen produktin e numrave natyror te intervalit [a,b], ku a dhe b jane numra natyrore*/

public class Detyra7_3_5_b
{  
   /**Metoda product kthen produktin e numrave natyror te intervalit [a,b], ku a dhe b jane numra natyrore*/
   public int product(int a, int b)
   {  int product = 1;
      if(a <= b)
         {
            int count = 0;
            while(count <= b-a)
                 {
                     product = product*(a + count);
                     count = count + 1;
                 }
         }
      return product;
   }
   
    public static void main(String[] args)
   {
     Detyra7_3_5_b obj = new Detyra7_3_5_b();
     int a = 3;
     int b = 6;
     int product = obj.product(a,b);
     System.out.println("Produkti i numrave natyror ndermjet " + a + " dhe " + b + " eshte: " + product);
   }

}