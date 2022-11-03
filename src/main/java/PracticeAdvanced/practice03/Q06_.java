package PracticeAdvanced.practice03;

import java.util.*;

public class Q06_ {
    public static void main(String[] args) {
        /*
        //Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
        //Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
        //                                                                                                          */

        int arr[]={-999,1, 2, 5, 7, 9, 22, 8, 3, 1, -100};
        List<Integer>list = new ArrayList<>();
        for (int w:arr             ) {
            list.add(w);
        }
        System.out.println("list = " + list);

        int max = arr[0];
        for (int w: arr             ) {
            if(w>max){
                max=w;
            }
        }
        System.out.println("max = " + max);

        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        for (int i =0; i<arr.length;i++){
            if (arr[i]==max){
                break;
            }
            list1.add(arr[i]);
        }
        System.out.println("list1 = " + list1);

        for (int i = 0; i < list.size(); i++) {
            if (i<list.indexOf(max)){
                continue;
            }
            list2.add(arr[i]);
        }
        System.out.println("list2 = " + list2);

        List<Integer>list1copy=new ArrayList<>(list1);
        System.out.println("list1copy = " + list1copy);
        List<Integer>list2copy=new ArrayList<>(list2);
        System.out.println("list2copy = " + list2copy);
        Collections.sort(list1copy);
        Collections.sort(list2copy);
        Collections.reverse(list2copy);// sıralamayı tersine çevirir

        if (list1.equals(list1copy)&&list2.equals((list2copy))){
            System.out.println("Mountain Array");
        }else{
            System.out.println("Mountain Array  degil");
        }






    }
}
