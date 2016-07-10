/**Ky aplikacion permban metoden sine dhe cosine qe kthejne sinusin dhe kosinusin e argumentit te tij perkatesisht*/
public class Detyra7_3_5_d1
{  
   //Krijimi i nje objekti nga klasa qe e permban metoden factorial
   Detyra7_3_5_c obj = new Detyra7_3_5_c();
   
   /**Metoda sine kthen sinusin e argumentit te tij*/
   public double sine(double x)
   { 
     double sine = x;
     int count = 3;
     int n = 1;
     while(count <= 19)
           {
               sine = sine + Math.pow(-1, n)*(Math.pow(x,count)/obj.factorial(count));
               count = count + 2;
               n = n+1;
           }
     return sine;
   }
   
   /**Metoda cosine kthen kosinusin e argumentit te tij*/
   public double cosine(double x)
   { 
     int count = 2;
     double cosine = 1;
     int n = 1;
     while(count <= 20)
           {
               cosine = cosine + Math.pow(-1, n)*(Math.pow(x,count)/obj.factorial(count));
               count = count + 2;
               n = n+1;
           }
     return cosine;
   }    
  
   public static void main(String[] args)
   {
      Detyra7_3_5_d1 obj1 = new Detyra7_3_5_d1();
      double sine = obj1.sine(Math.PI/2);
      //Testim i metodes sine duke e krahasuar me metoden Math.sin()
      System.out.println("Sinus");
      System.out.println(sine);
      System.out.println(Math.sin(Math.PI/2));
      System.out.println("");
      double cosine = obj1.cosine(0);
      //Testim i metodes cosine duke e krahasuar me metoden Math.cos()
      System.out.println("Kosinus");
      System.out.println(cosine);
      System.out.println(Math.cos(0));
   }
}