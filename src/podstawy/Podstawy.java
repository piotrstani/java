
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
          
          0001
          ~ 1110  <- 1 na lewym bicie oznacza liczbę ujmeną???
          
          
          
        */           
                
         System.out.println("*****OPERATORY BITOWE****");
         System.out.println(5&4);
         System.out.println(5|4);
         System.out.println(5^4);
         System.out.println(4 << 1);
         System.out.println(4 >> 1);
         System.out.println(~1);
          
        /* INSTRUKCJE WARUNKOWE &  PO CO SĄ KLAMERKI 
        
          
            if (WYRAŻENIE)
                instrukcja;
            else if (WYRAŻENIE) 
                instrukcja;
            else  
              {  
                instrukcja1;
                instrukcja2;
              }              
          
        */           
                
         System.out.println("*****INSTRUKCJE WARUNKOWE****");
          
          int aWarunkowe = 5,
              bWarunkowe = 5; 
          
         System.out.println("a = " + aWarunkowe + " b = " + bWarunkowe); 
         
         if (aWarunkowe != bWarunkowe) 
            System.out.println("a różne od b" + (aWarunkowe != bWarunkowe));  
         else
            System.out.println("a równe b"+ (aWarunkowe != bWarunkowe));
         
             
        if (aWarunkowe > bWarunkowe) 
            System.out.println("a > b");      
        else if (aWarunkowe > bWarunkowe)
        {
            System.out.println("a < b");
            System.out.println("UŻYCIE KLAMRY");
        } 
        else 
            System.out.println("a = b");                  
           
          
        /* INSTRUKCJA SWITCH (przełącznik)
              
        instrukcja powoduje przeskok do mijesca i realizacje dalszych instrukcij
        break - przerwanie
        
        działa dla ZMIENNYCH - INT, CHAR 
        
          switch (x)
        
            case x1:
               instrukacja;
               break;
            case x2:
               instrukacja;
               break;
            default:
                instrukcja;
        
        */           
        System.out.println("*****INSTRUKCJA SWITCH****");
        
        char aSwitch = 'a';
        switch(aSwitch)
        {
            case 'a':
                System.out.println(" a równe = 50");
                System.out.println(" a równe = 50");
                break;
            case 100:
                System.out.println(" a równe = 100");
                break; 
            default:
                System.out.println(" a równe = " +aSwitch);              
        }      
                  
        /* WRAZENIA WARUNKOWE
              
     WYRAZENIE ? co ma się stać jeśli TRUE : co ma się stać jeśli FALSE
        
        */    
        
        System.out.println("*****WYRAŻENIE WARUNKOWE***");  
        
        int xWyrazenieWarunkowe  =5;
        
        if (xWyrazenieWarunkowe % 2 == 0)
            System.out.println("PARZYSTA");
        else
            System.out.println("NIEPARZYSTA");
        
       String wynikWyrazeniaWarunkowego = xWyrazenieWarunkowe % 2 == 0 ? "parzysta" : "nieparzysta";
            System.out.println(wynikWyrazeniaWarunkowego);
      
     /* TABLICE JEDNOWYMIAROWE
              
     np. jeśli potrzebujesz duzej ilosci zmiennych 
     
           --------------------------------
            tab[0] tab[1]  tab[2]  tab[3]
           --------------------------------  
            
    */  
     
        int[] tablicaJednowmiarowaA; 
        
        /*
        a można też 
            int tab[]; 
        a można od razu 
            int[] tab = new int[5]; */
        
        tablicaJednowmiarowaA = new int[5];
        
        /* 
        tak jakbyć zrobili x5 deklarcaje zmiennych
        ...
        int A,
            B,
            C;
        ...
        */
        
        System.out.println("*****TABLICE JEDNOWYMIAROWE***"); 
        
        tablicaJednowmiarowaA[0]=1;
        tablicaJednowmiarowaA[1]=2;
        tablicaJednowmiarowaA[2]=3;
        tablicaJednowmiarowaA[3]=4;
        
        System.out.println("TAB1= " + tablicaJednowmiarowaA[0] + " a TAB4= " + tablicaJednowmiarowaA[3]); 
          
        /* LENGHT */
        
        int[]tablicaJednowmiarowaB = {23, 33, 43, 53, 63};
        
        System.out.println(tablicaJednowmiarowaB[3]);
        System.out.println(tablicaJednowmiarowaB.length);
        System.out.println(tablicaJednowmiarowaB[tablicaJednowmiarowaB.length -1]);    
            
               /* TABLICE WIELOWYMIAROWE
        
        ---------------
        0 0 | 0 1 | 0 2
        ---------------
        ---------------
        1 0 | 1 1 | 1 2
        ---------------       
         --------------
        2 0 | 2 1 | 2 2
        ---------------       
        ---------------
        3 0 | 3 1 | 3 2
        ---------------
        int [wiersze][kolmny]
        
        
        */
        
        System.out.println("*****TABLICE WIELOWYMIAROWE***");      
        
        int[][] tablicaWielowymiarowaA = new int[4][3];
        tablicaWielowymiarowaA[0][0] = 34;
        
        System.out.println(tablicaWielowymiarowaA[0][0]);      
                
         int[][] tablicaWielowymiarowaB =
         { 
             {1,2,3},
             {4,5,6},
             {7,8,9},
             {10, 11, 12},
         };
         
             
       
        
        /* PĘTLE WHILE i DO WHILE */                    
               
        System.out.println("*****WHILE I DO WHILE***");       
    
                 String[] tablicaStringow=
         {
                "Java 1",
                "Java 2",
                "Java 3",
                "Java 4",
                "Java 5",
         };
                                         
                int i = 0; 
                 while(i < tablicaStringow.length)
                 {
                     if (i == (tablicaStringow.length -1) )
                     {
                         System.out.println(tablicaStringow[i++]);
                      /* tablicaStringow[i++]*/
                     System.out.println("KONIEC PĘTLI WHILE");
                     }
                     else
                     {
                         System.out.println(tablicaStringow[i]);
                         i++;
                     }                                        
                 }
               
                 /* DO WHILE - najpierw rób a potem sprawdź warunek 
                 do 
                 {
                     System.out.println(tablicaStringow[--i]);
                 }
                     while(i < tablicaStringow.length); */
                 
                 int tabEx_10[] = new int[9];
                 int Ex_10_licznik=0;
                 int Ex_10_liczba;
                 
                 while (Ex_10_licznik < tabEx_10.length)
                 {
                    tabEx_10[Ex_10_licznik]= 10 * (Ex_10_licznik+1);
                     
                   
                    System.out.println(tabEx_10[Ex_10_licznik]);
                    Ex_10_licznik++;
                 }
                 
                /* PĘTLA FOR */
                // for (inicjalizacja zmiennych; warunek; co ma się stać po wykonaiu instrukcij
                System.out.println("*****FOR***");  
                
                
               for ( Ex_10_licznik =0; Ex_10_licznik < tabEx_10.length; Ex_10_licznik++)
               {
                   tabEx_10[Ex_10_licznik]= 10 * (Ex_10_licznik+1);

                   System.out.println(tabEx_10[Ex_10_licznik]);
               }    
                  /* PĘTLA ENHANCED FOR */
                
                  // z tablicaStringow pobierz nazwę i wypisz
                System.out.println("*****ENHANCED FOR***"); 
                
                    for(String myEnhanced: tablicaStringow )
                    {
                       System.out.println(myEnhanced); 
                    }
                 
                    
                  /* PĘTLA W PĘTLI */
                
                  System.out.println("***PĘTLA W PETLI - TABLICZKA MNOŻENIA***");
                  
                  for (int mnożna_i =1; mnożna_i <= 10; mnożna_i++ )
                  {
                      for (int tabliczka_i = 1; tabliczka_i <= 10; tabliczka_i++)
                        {
                            System.out.print( (tabliczka_i * mnożna_i )+ " "); 
                        }
                      System.out.println();
                  }
                    
    }
    
    
    
}
