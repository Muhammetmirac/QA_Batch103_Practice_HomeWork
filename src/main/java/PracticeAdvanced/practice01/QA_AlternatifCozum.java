package PracticeAdvanced.practice01;

public class QA_AlternatifCozum {
    public static void main(String[] args) {
     /*   Scanner al = new Scanner(System.in);
        String kelime ="acaba sdfkj";
        String[] word = kelime.trim().toLowerCase().replaceAll("\\s","").split("");
        System.out.println(Arrays.toString(word));
        List<String> words = new ArrayList<String>();
        for (String w : word) {
            words.add(w);
        }
        List<String> aranan = new ArrayList<>();
        for (String w : word) {
            aranan.add("_");
        }
        int hak=5;
//System.out.println(Arrays.toString(word));
        System.out.println(aranan);
        do {
            System.out.println("\nbir harf giriniz.");
            String ch=al.next().substring(0,1);
            if (words.contains(ch)) {
                int idx=words.indexOf(ch);//s 5index
                System.out.println(ch +" harfi var ");
                for (int w=idx;w<words.size();w++) {
                    if (words.get(w).equals(ch)){
                        aranan.set(w,ch);
                        //words.set(w,ch.toUpperCase());
                    }
                }
                System.out.println(aranan);
                if (!(aranan.contains("_"))){
                    System.out.println("****tebrikler***** Kazandınız!!!.");
                    break;
                }
            }else{
                hak--;
                System.out.println("kalan hakkınız= "+hak);
            }
        }while (hak>0);

        System.out.println("Aradiginiz Kelime: "+ kelime);
        2:19
        System.out.println("Sayi Tahmin Oyununa Hosgeldiniz...");
        System.out.println("Oyunda 5 hakkiniz vardir.");
        System.out.println("Her kullandiginiz hak -20 puan sebebidir.");
        System.out.println("Ilk tahmininizde eger sayiyi bulabilirseniz 100 tam puan kazanacaksiniz.");
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        int oyunSayisi =rnd.nextInt(100);
        int hak = 7;
        int sayi = 0 ;
        int puan = 100/hak;
        int puaniniz = 100;
        System.out.println("1 ile 100 arasi bir sayi giriniz.");
        do {
            sayi = input.nextInt();
            if (sayi>oyunSayisi) {
                hak--;
                if (hak==0) {
                    continue;
                }
                System.out.println("Aradiginiz sayi asagida");

            } else if (sayi<oyunSayisi) {
                hak--;
                if (hak==0) {
                    continue;
                }
                System.out.println("Aradiginiz sayi yukarida");
            } else {
                System.out.println("Oyunu kazandiniz.");
                break;
            }


            System.out.println("Kalan hakkiniz: "+  hak);

        }while (hak>0);

        if (hak==0) {
            System.out.println("Hakkiniz bitmistir.");
        }
        puaniniz = puan* hak;
        System.out.println("Puaniniz: " + puaniniz);
        System.out.println("Aradiginiz Sayi: " + oyunSayisi);
    }
}


      */
    }
}