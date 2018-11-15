
package podstawy;

public class Podstawy {

 
    
    public static void main(String[] args) {
        
    /* ZMIENNE 
        deklaracja zmiennych lokalnych 
        pierwsza litera z małej
        druga litera z dużej
        np.: daneOsobowe 
        zmienne samo opisujące 
        
        z duzej litery stałe
        np.: LICZBA_PI = 3.14;
        
        NIE WOLNO:
        używać w nazwie zmiennej keywordów
        zaczynać nazwy zmiennej od liczby
        używać w nazwie zmiennej spacij
        
               
        
        
        Liczby całkowite:
            byte   8 bit     -128 do 127
            short 16 bit -32 768 do 32 767
            int   32 bit   -2^31 do 2^31 -1 integer
            long  64 bit   -2^63 do 2^63
        
        Znakowe:
            char - 2 bajty
            string -ciąg znaków
        
        Zmiennoprzecinkowe:
            float  32 bit -1,4*10^- 45 do 3,4*^10^138
            double 65 bit  -4,9^10-324 do 1,8*^10^308      
    */
    
    /*Całkowite*/
        int aInt = 10;
        long bLong = 3L; /*dopisuje się L aby traktować ajko long*/
        long cLong;     
        int dInt = 4;
        long eLong = 10;
        
            cLong = aInt + bLong;
        
    /*Znakowe:*/
        String imie ="Piotr";
        String nazwisko ="Stani";
        char znak ='&'; /* apostrof do znaków*/
        String daneOsobowe;
        
            daneOsobowe = imie + " " + znak + " " + nazwisko;
      
    /*Zmiennoprzecinkowe:*/ 
        float  liczba1 =1.5f; /*dopisuje się f aby traktować ajko float*/
        double liczba2 = 1.75;
        double liczba3;
                
            liczba3 = liczba1 - liczba2;  
              
     /*Stałe:
       final blokuje stałą nie będzie możliwe przypisanie innej wartosci do zmiennej     */   
        final double LICZBA_PI = 3.14;
                       
     /* println - łamanie lini, print - brak łamania linii */
     /* ; - rozkaz */
        System.out.println("*****ZMIENNE****");
        System.out.println(cLong);
        System.out.println("Imię: " 
                + imie 
                + " " 
                + znak 
                + " Nazwisko: " 
                + nazwisko);
        System.out.println(liczba3);
        System.out.println(daneOsobowe);
        System.out.println(LICZBA_PI);
        
    /*RZUTOWANIE  */  
        
    int wynik4 = aInt / dInt;
    double wynik5 = cLong / bLong;
    
    int wynik6 = aInt / (int)bLong; /*kompilator zwraca błąd - tracenie precyzij*/
        
    System.out.println("*****RZUTOWANIE****");
    
        System.out.println("Wynik 1 int/long: "+ aInt / bLong);
        System.out.println("Wynik 2 int/long rzutowanie na double: "+ (double)aInt / bLong);
        System.out.println("Wynik 3 int/long rzutowanie na double: "+ aInt / (double)bLong);
        
        System.out.println("Wynik 4 int/int: " + wynik4);
        System.out.println("Wynik 5 long/long: " + wynik5);
        System.out.println("Wynik 5 long/long: " + wynik6);  
        
        System.out.println(1/5); 
        System.out.println(1.0/5);
        
        
        /* OPERATORY ARYTMETYCZNE 
        
        +=  dofaj do wartości 
        -=  odejmnij
        /=  podziel
        *=  pomnóż
        %=  reszta z dzielenia, np. jeśli chcemy realiozwać coś co 3 razy 
            1 mod 3  = 1, 2 mod 3 = 2, 3 mod 3 = 0, 
        
        % znak modulo
        
        ++ inkrementacja +1  <=> a + 1
        -- dekrementacja -1  <=> a - 1
        
        x++ POST inkrementacja +1 po wyświetleniu
        x-- POST dekrementacja -1 po wyświetleniu
        
        ++x PRE inkrementacja +1 przed wyświetleniem
        --x PRE dekrementacja -1 przed wyświetleniem     
        
        */
        
        int aOperatory = 5;
        aOperatory += 5;
        
        int bOperatory;
        bOperatory = 2 % 3;
        
        int cOperatory = 7;
        cOperatory %= 3;
        
        int dOperatory = 100;
        int eOperatory = 200;
        
        System.out.println("*****OPERATORY ARYTMETYCZNE****");
        System.out.println(aOperatory);
        System.out.println(bOperatory);
        System.out.println(cOperatory);
        System.out.println("POST x++: " + dOperatory++);
        System.out.println("Pre ++x: " + ++eOperatory);
        System.out.println("POST x++ kolejne wyświetlenie: " + dOperatory);
        
        /* OPERATORY RELACYJNE (PORÓWNANIA) 
        
         x == y  czy x jest równy y wynik jest logiczny boolean
         x != y  czy jest x jest różny od y 
         >    większe
         <    mniejsze
         >=   większe róne
         <=   mniejsze równe
        
        */
         
        
         boolean isTrue = 4 == 4;
         if (4 == 4 ) /* przykład pętli */
         
         System.out.println("*****OPERATORY RELACYJNE****");
         System.out.println(isTrue);
         
        /* OPERATORY LOGICZNE
        
            true vs false
         
            !   negacja
            !   (true)  -> false
            !   (false) -> true
            &&  koniunkcja ("i")
            ||  alternatywa ("lub")
        */
         
        
         int aLogiczne = 5,
             bLogiczne = 5,
             cLogiczne = 6;
         
             
         
         System.out.println("*****OPERATORY LOGICZNE****");
         
          if (aLogiczne == bLogiczne && !(aLogiczne == cLogiczne))              
            System.out.println("KONIUNKCJA - TAK");
          
          if (aLogiczne == bLogiczne || aLogiczne == cLogiczne)              
            System.out.println("ALTERNATYWA - NIE");
          
        /* OPERATORY BITOWE) 
        
          
            &           iloczyn bitowy AND
            |           suma bitowa    OR
            ^           XOR  (1^1->0, 0^0->0, 1^0->1, 0^1->1
          
            x << 1      przesuniecie w lewo o 1
            x >> 2      przesunięcie w prawo o 2
            ~           negacja bitowa  
          
          0101
          0100
          ----
          0100 &
          0101 |
          0001 ^
          
          0100 x << 1 1000
          0100 x >> 1 0010  
          
        */ 
          
        
        
         System.out.println("*****OPERATORY BITOWE****");
         System.out.println(5&4);
         System.out.println(5|4);
         System.out.println(5^4);
         System.out.println(4 << 1);
         System.out.println(4 >> 1);
          
          
          
          
          
          
    }
    
}
