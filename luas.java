 
package LUAS;
import java.util.Scanner;

public class luas {
    public static void main(String[] args) {
           for (String i = "Y"; i.equals("Y")||i.equals("y"); ){
             System.out.println("=====================================================");
             System.out.println("    MENU PERHITUNGAN  ");
             System.out.println("1. Perhitungan Mencari Luas Persegi :  ");
             System.out.println("2. Perhitungan Mencari Luas Lingkaran :  ");
             System.out.println("3. Perhitungan Mencari Luas Persegi Panjang : ");
             System.out.println("=====================================================");
             Scanner in = new Scanner(System.in);
             System.out.print("Masukkan pilihan : ");
             int pilihan = in.nextInt();
         
      if ( pilihan == 1){
          int sisi,luas;
           System.out.println ("luas persegi") ; 
           System.out.println ("--------------------------------------") ; 
           System.out.println ("masukkan sisinya       :    ") ; 
           sisi=in.nextInt();
           luas=sisi * sisi;
           System.out.println ("luas persegi "+luas) ;

                }
        else if (pilihan == 2){
            System.out.println("Luas Lingkaran");
            System.out.println ("--------------------------------------") ; 
            int jari;
            double luas;
            double phi=22/7;
            System.out.print("Masukan Panjang Jari-Jari : ");
            jari=in.nextInt();
            luas=(phi*jari*jari);
            System.out.println("Luas Lingkaran adalah : "+luas);
        }
       
      else if (pilihan == 3){
           System.out.println("Luas Persegi Panjang");
           System.out.println ("--------------------------------------") ; 
           int panjang,lebar;
           double luas;
           System.out.print("Masukan Panjang : "); panjang=in.nextInt();
           System.out.print("Masukan Lebar : "); lebar=in.nextInt();
           luas=(lebar*panjang);
           System.out.println("Luas Persegi Panjang adalah : "+luas);
        }
      

      else{
           System.out.println("TIDAK ADA PILIHAN BANG HEHE" );
      }
           System.out.print("Apakah Anda Ingin Mengulang Perhitungan Lagi? Y/T: ");
      i = in.next();
    }
       
    for (String j = "T"; j.equals("T")||j.equals("t"); ){
          System.exit(0);
          break;
      }
           
    }
    }



     
       
   
     
    
    
    
    

