package PracticeAdvanced.practice03;

import java.util.Arrays;

public class Q01_Arrays_IsaretDegistir {
    public static void main(String[] args) {
      /*
       ////Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.

        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6
                                                                                                                      */

        int []arr= {1,2,-3,4,-5,-6};
        int []brr=new int[arr.length];
        int idx=0;
        for (int w:arr             ) {
            w*=-1;
            brr[idx]=w;
           idx++;
        }
        System.out.println("brr = " + Arrays.toString(brr));














    }
}
