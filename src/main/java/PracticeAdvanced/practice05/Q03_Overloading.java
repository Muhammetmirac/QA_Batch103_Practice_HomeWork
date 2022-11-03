package PracticeAdvanced.practice05;

public class Q03_Overloading {

    public static void main(String[] args) {
        //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız)


        Hacim hacim = new Hacim();
        hacim.hacimHesapla(5);
        hacim.hacimHesapla(5,10);
        hacim.hacimHesapla(5,10,20);



    }
}
