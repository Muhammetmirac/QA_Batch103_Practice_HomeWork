package day07_stringManipulation;

public class C06_Length_01 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
// ve girilen kelimeyi tersten yazdirin
        String str = "Kabaa";

        char ch0 = str.charAt(0);
        char ch1 = str.charAt(1);
        char ch2 = str.charAt(2);
        char ch3 = str.charAt(3);


        if (str.length()==4){

            System.out.println("Tersten yazılmış hali ="+ch3+ch2+ch1+ch0);
        }else System.out.println("4 harfli kelime gir");
    }
}
