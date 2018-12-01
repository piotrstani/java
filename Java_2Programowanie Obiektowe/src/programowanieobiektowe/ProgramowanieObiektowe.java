/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programowanieobiektowe;


import newpackage.ClassaPubliczna;
/**
 *
 * @author PiT
 */
public class ProgramowanieObiektowe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here      
      
    /* Obiekty - "pojemnik do przechowywania zmiennych i funkcij teamtycznie ze sobą związanych
       Klasy    - foremki do tworzenia egzemplarzy obiektów
        
        properties  - wałaściwości np. kolor, wysokość     
        metody      - funkcje 
        -> teoretycznnie funkcij nie ma w JAVIE 
        (bo ogólnie funkcje są poza klasą/ metody w klasie, 
        a w Javie wszytko jest w klasach
        np. włącz/wyłącz    
    
        np.:
        System.out.println();
        KLASA.wyjście.METODA...
        
        PRZECIĄŻANIE METOD 
        tworzenie tych samych metod ale operujących np. na innych typach zmiennych 
        kompilator sam wybierze 
        
    */
// tworzenie nowego obiektu i rezerwacja miejsca w pamieci, mozemy się odwoływać         
    

 // **************KLASA MONITORY*************
   System.out.println();
   System.out.println("******MONITORY********");

    // WEJŚCIE    
    Monitor LG = new Monitor();
    LG.szer =100;
    LG.wys =0;
    LG.nazwa="Eldżi";
       
    Monitor DELL = new Monitor(); 
    DELL.szer =200;
    DELL.wys =11100;
    DELL.nazwa="Delł";
    
    
    // UŻYCIE METODY WYPISYWANIE
    System.out.println();
    System.out.println ("*****Metody służące wypisywaniu****");
            
    System.out.println ("Szerokość: " + LG.szer + " Wysokość: " + LG.wys);       
    LG.pokaz(LG.nazwa);
    
    System.out.println ("Szerokość: " + DELL.szer + " Wysokość: " + DELL.wys);  
    DELL.pokaz(DELL.nazwa);
    
   
    // UŻYCIE METODY DODAWANIE
    System.out.println();
    System.out.println ("*****Metody służące dodawniu****");           
    int wynik = LG.dodaj(LG.szer, LG.wys);
    System.out.println("Wynik dodawnia: "+ LG.nazwa+ " "  + wynik);
    
    // UŻYCIE METODY DODAWANIE -PRZECIĄŻENIE
    System.out.println();
    System.out.println ("*****Metody służące dodawniu - metoda przeciążona****");           
    double  wynik2 = LG.dodaj(1.25, 1.5);
    System.out.println("Wynik dodawnia: "+ LG.nazwa+ " "  + wynik2);
    
    
    
    // UŻYCIE METODY DZIELENIE
    System.out.println();
    System.out.println ("*****Metody służące dzielniu****"); 
    
    double iloraz = LG.dzielenie(LG.szer, LG.wys);
    System.out.println("Wynik dzielenia: "+ LG.nazwa+ " "  + iloraz);
    

    
 // ************UŻYCIEKLASA SAMOCHODY*****************
    System.out.println();
    System.out.println("******SAMOCHODY********");
    
    
    Car polonez = new Car(1995,100);
    System.out.println("Polonez " + polonez.rok + " " + polonez.szybkosc);
   
    Car audi = new Car();
    System.out.println("Audi " + audi.rok + " " + audi.szybkosc);
    
     // ************UŻYCIE KLASA MATEMATYKA****************
    System.out.println();
    System.out.println("******MATEMATYKA********");
    
    System.out.println(Matematyka.plus(1, 2));
    System.out.println(Matematyka.PI);
    
     // ************UŻYCIE KLASA KLIENCI****************
    System.out.println();
    System.out.println("******KLIENCI********");
    
   Klient a = new Klient ("Ala");
   Klient b = new Klient ("Ola");
   Klient c = new Klient ("Ela");
    
   System.out.println(a.id); 
   System.out.println(b.id); 
   System.out.println(c.id); 
   
    // U ZYCIE KLASY Z INNEGO PAKUNKU
    System.out.println();
    System.out.println("******KLASA Z INNEGO PAKIETU********");
    System.out.println(ClassaPubliczna.napis_ClassaPubliczna);
 
// ************UŻYCIE KLASA BANK*****************
    System.out.println();
    System.out.println("******BANK********");
    
    Bank lokataBank = new Bank();

    // pobierz informacje o saldzie
    System.out.println("Saldo: " + lokataBank.getSaldo() + " zł");
    
    // ustaw saldo
    
    lokataBank.setSaldo(10000);
    System.out.println("Saldo: " + lokataBank.getSaldo() + " zł");
    
    
    // wypłaty
    
    if (lokataBank.wyplata(100000))
    {
    System.out.println("Saldo po wypłacie: " + lokataBank.getSaldo() + " zł");
    }
    else
    {
        System.out.println("Za mało kasy"); 
    }
   
// ************REFERENCJE*****************
    System.out.println();
    System.out.println("******REFERENCJE********");
    
    
    
    int aReferencja = 20;
    int bReferencja = aReferencja;
    
    System.out.println("Referencja a przed konstruktorem: " + aReferencja);
    System.out.println("Referencja b przed konstruktorem: " + bReferencja);
    
    bReferencja = 44;
    
    System.out.println("Referencja b przed konstruktorem, zmiana: " + bReferencja);
        
    
    Referencja XReferencja = new Referencja(); 
    // w sumie XReferenja jest adresem (miejscem w pamięci, nie zwiera wartości
  
    System.out.println("Referencja a po konstruktorze: " + XReferencja.aReferencja);
    System.out.println("Referencja b po konstruktorze: " + XReferencja.bReferencja);
    
    Referencja YReferencja = XReferencja;
    // adres YReferenja = XReferenja, zmiana czekoś po stronie Y => X i odwrotnie
    
    YReferencja.aReferencja=5;
    YReferencja.bReferencja=1;
    
    System.out.println("Referencja a po X=Y: " + XReferencja.aReferencja);
    System.out.println("Referencja b po X=Y: " + XReferencja.bReferencja);
    
    String imieReferencje = "Ala";
    String imieReferencje2 = imieReferencje; 
    
    
    imieReferencje2 ="Ola";
    System.out.println(imieReferencje);
    
    
    }   
}

class Referencja
{
 int aReferencja =10;
 int bReferencja =33;
}


// ************KLASYY***************

        class Monitor // klasa z dużej litery
    {    
         int szer; // propeties 
         int wys;
         String nazwa;
         
         void pokaz( String nazwa) 
            //metoda z małej litery, wywłaj instrukcje z klamerki
            // void pustka nie zwraca wyniku !!!
            // metoda 
         {          
           
            System.out.println("Nazwa: " + nazwa);
         }
        
         int dodaj(int a, int b)
         {
              // metoda zajmująca się dodawaniem           
             
             return a + b;
         }
         
         double dodaj(double a, double b)
         {
              // metoda zajmująca się dodawaniem           
             
             return a + b;
         }
         double dzielenie (int a, int b)
         {
            if (b==0)
            {
              System.out.println("NIe dziel przez zero!!!!");
              return 0;
            }
            else
                
            return a/b;
         }
               
       
    } 

        //KONSTRUKTORY - pozwala na skonfigurowanie nowo tworzonego obiektu
        class Car
    {       
            // co się ma stać po wywołaniu  - konstruktory
            
            Car() // domsyślny jeśli nie przekażemy parametrów
            { 
            System.out.println("Konstruktor domyślny:");
             rok = 1990;
             szybkosc = 200;
            }
            
            Car(int rok, int szybkosc) // jeśli przekażemy parametry
            { 
            System.out.println("Konstruktor z parametrami:");
                                
             this.rok = rok; // this używa się pzry kolizi nazw jakby użyć Car(x,y) nie potrzebne było by this
             this.szybkosc = szybkosc;                   
            }            
                                
            int rok;
            int szybkosc;
    }


        //METODY i POLA STATYCZNE

        class Matematyka
    {       
         //  po dodaniu static nie jest wymagnae storzenie egzeplarza (rezerwacja miejsca)   
            
            // właćiwość final - ostateczna
            static final double PI = 3.14;

            // metoda                      
            static int plus (int a, int b)
            { 
                 return a + b; 
            }            

    }
        class Klient
    {       
      Klient (String imie)
      {
         this.imie=imie;
         
         id = nextId;
         nextId++;
      }
            
     String imie;
     int id =0;
     static int nextId = 1; // wspólne 

    }

        class Bank
        // do wartości private mozemy dostać się z poziomu klasy, 
    {       
      {
            saldoBank = 100;
      }
      private int saldoBank;
      int getSaldo ()// get (w ang) piszemy przed funkją która ma zwrócić
      { 
          return saldoBank; 
      }
      
      /* 
      POWINNY BYĆ WARUNKI CZY MOZNA ZMIENIC STAN SALDA
      */
      
      
      void setSaldo (int saldo)
      {
      this.saldoBank=saldo;
      }
      
      boolean wyplata( int ileWyplataoBnak)
      {
          
      if (saldoBank < ileWyplataoBnak)
      {
          return false;
            
      }
     else 
          setSaldo(saldoBank - ileWyplataoBnak );
      return true;
      }
      
    }
            
    

    