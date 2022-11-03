package PracticeAdvanced.practice04;

public class Q03_Arrays_OrtalamadanBuyuk {
    public static void main(String[] args) {
        //Elemetlerin ortalamasından büyük elementleri yazdıran bir kod yazınız.
        int[]arr={5,9,15,1,0,11,3};
        int toplam =0;
        for (int w: arr             ) {
            toplam += w;
        }
        double ortalama = toplam/arr.length;
        System.out.println("ortalama = " + ortalama);
        for (int w : arr             ) {
            if (ortalama<w){
                System.out.print(w+" ");
            }
        }
    }
}
