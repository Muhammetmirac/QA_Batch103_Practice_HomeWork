package day04_IfStatement;

import java.util.Scanner;

public class C04_IfStatement {
     /*
 Print "Lutfen is unvaninizi girin
 jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
 Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
 Eger jobTitle  qa ise print is unvaniniz Quality Analyst
 test data: qa ise print Quality Analyst
 dev ise print Developer
 ba ise print Business Analyst
 pm ise print Project Manager
*/
     public static void main(String[] args) {
         Scanner scan =new Scanner(System.in);
         System.out.println("Lutfen iş unvanınızı giriniz");
         String jobTitle =scan.nextLine();
         if (jobTitle.equalsIgnoreCase("qa")){
             System.out.println("İs Unvanı = Qyalty Analyst");
         }else if (jobTitle.equalsIgnoreCase("dev")){
             System.out.println("Developer");
         }else if (jobTitle.equalsIgnoreCase("ba")){
             System.out.println("Business analyst");
         }else if (jobTitle.equalsIgnoreCase("pm")){
             System.out.println("Project Manager");
         }else{
             System.out.println("Lutfen qa, dev, pm,ba degerlerinden birini giriniz");
         }

     }
}
