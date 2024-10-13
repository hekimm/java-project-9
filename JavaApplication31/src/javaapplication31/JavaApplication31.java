/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;
import java.util.Scanner;

/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication31 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*****************************************\n" +
"Atm Programına Hoşgeldiniz...\n" +
"*****************************************\n");
       
       int bakiye=1000;
        int kredi=15000;
        int yks=230;
        int ehliyet=130;
        int meb=75;
       int kyk=850;
       while(true){
           
           System.out.println("İşlemler;\n" +
"Bakiye Sorgulama İçin:(1)\n" +
"Para Yatırma İçin:(2)\n" +
"Para Çekmek İçin:(3)\n" +
"Kredi Kartı Nakit Avans İçin:(4)\n" +
"YKS Sınav Ücreti Yatırmak İçin(5)\n" +
"Ana Menüye Dönmek İçin 'A' ya basın\n" +
"Kart İade İçin 'q' ya basın");
            Scanner scanner = new Scanner(System.in);
        String islem = scanner.nextLine();
        if(islem.equals("A")){
           continue;
            
        }
        else if(islem.equals("q")){
            System.out.println("Bizi tercih etiğiniz için teşekkür ederiz");
            break;
        }
        else if(islem.equals("1")){
            System.out.println("Bakiyeniz " + bakiye+ " TL dir");
        }
        else if(islem.equals("2")){
            System.out.println("Kaç  tl yatırmak istiyorsunuz : ");
           int yatirilanPara = scanner.nextInt();
           bakiye +=yatirilanPara;
           
        }
        else if(islem.equals("3")){
            System.out.println("Kaç tl çekmek istiyorsunuz : ");
           int cekilenPara = scanner.nextInt();
           if(cekilenPara>bakiye){
               System.out.println("Bakiyeniz yetersiz !!");
               continue;
           }
           bakiye -= cekilenPara;

        }
        
        else if(islem.equals("4")){
            System.out.println("Kaç tl nakit avans çekmek istiyorsunuz : ");
            int nakitAvansMiktarı =scanner.nextInt();
            if(nakitAvansMiktarı>kredi){
                System.out.println("Kredi bakiyesi yetersiz");
                continue;
            }
           kredi -= nakitAvansMiktarı;
        }
        
        else if(islem.equals("5") ){
            while(true){
                System.out.println("YKS sınav ücreti 230 Tldir.Lütfen tam olarak 230 tl yatırınız ");
                 int yksSinavUcreti = scanner.nextInt();
                 if(yksSinavUcreti == 230){
                     break;
                 }
            }
        
            
            
        }
        else{
            System.out.println("Geçersiz işlem girdiniz !!");
        }
           
           
           
           
           
           
           
           
           
       }


    }
    
}
