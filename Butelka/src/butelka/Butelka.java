package butelka;


public class Butelka {

   private double ileLitrow; 
   
   Butelka(double ileLitrow)
   {
       this.ileLitrow = ileLitrow;
   }
    
   double getIleLitrów()
   {
   return ileLitrow;
   }
    
   void wlej(double ilosc)
   {
       this.ileLitrow += ilosc;
   }
  boolean wylej(double ilosc)
   {
       if (ilosc <= ileLitrow)
            this.ileLitrow -= ilosc;
       else
           return false;
       return true;
   }           
   
   void przelej(double ilosc, Butelka gdziePrzelac)
   {
       if (this.wylej(ilosc))
       {
           gdziePrzelac.wlej(ilosc);
       }
       else 
       System.out.println("za mało");
       
   }  
    
    public static void main(String[] args) {
        
      Butelka[] Czteropak = new Butelka[4]; // maja teraz NULL, są 4 obiekty 
       
      int x;
      for (x=0; x < Czteropak.length; x++)
      {
      Czteropak[x] = new Butelka(x);
      
      System.out.println(Czteropak[x].getIleLitrów());
      
     
      }
      
      Czteropak[0].wlej(1.3);
      System.out.println("w pierwszym: " + Czteropak[0].getIleLitrów());   
      
      Czteropak[3].wylej(0.3);
      System.out.println("w czwartym: " + Czteropak[3].getIleLitrów());
      
      Czteropak[1].przelej(1, Czteropak[2]);
      System.out.println("w 2: " + Czteropak[1].getIleLitrów() + " a w 3: " + Czteropak[2].getIleLitrów() );       
      
    }
    
}
