package day24_arrayLists_ForEachList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqeArrayOlusturma {
    public static void main(String[] args) {
        //Soru 2) Verilen bir array’deki tekrr eden elementleri  tek bir defa barindiran
        // yeni bir array olarak donduren bir method olusturun

        int[] arr={2,3,5,6,3,5,4,1,9,6,3};
       int[] uniqeArray=uniqeArrayOlustur(arr);
        System.out.println(Arrays.toString(uniqeArray));
    }

   public  static int[] uniqeArrayOlustur(int[] arr) {
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));//[1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 9]
       List<Integer> benzersizList=new ArrayList<>();

       for (int i = 0; i < arr.length-1; i++) {
           if(arr[i]!=arr[i+1]){
               benzersizList.add(arr[i]);
           }

       }
       if(!benzersizList.contains(arr[arr.length-1])){
           benzersizList.add(arr[arr.length-1]);//son elementi kontrol edip yoksa listeye ekliyoruz
       }
       //benzersizList==>1,2,3,4,5,6,9
       //benzersiz listenin size bilgisini kullanarak bir array olusturuduk
       int[] tekrarsizArr=new int[benzersizList.size()];
       for (int i = 0; i < tekrarsizArr.length; i++) {
           tekrarsizArr[i]=benzersizList.get(i);


       }
       return tekrarsizArr;//[1, 2, 3, 4, 5, 6, 9]
    }
}
