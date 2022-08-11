package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydanListYapmak {
    public static void main(String[] args) {


    /*

    List ile calisirken en kotu ozelligi elemanlari tek tek eklmek
     */
        Integer[] arr = {2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0};
        //bu kadar cok elemanli bir listeyi tek tek eleman olarak girmek yerine array olusturup forloop  ile
        //olusturdugumuz liste tasiyabiliriz

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);

        //bu islemi yapmak icin javanin da olusturdugu bir yol var ama bunun cok yan etkisi var
        //yan etkiler
        //1-bu sekilde olusturulan listede add,remove gibi sizeyi degistiren  methodlar kullanilamaz
        //2-asList methodu ile olusturulan liste ve kaynak olan olan array
        // birbiri ile ilisik olarak hayatlarina devam ederler
        //birinde yaptigimiz degisiklik digerini de etkiler
        List<Integer> sayilar2 =  Arrays.asList(arr);
        System.out.println(sayilar2);

        sayilar.add(5);
        System.out.println(sayilar);
       // sayilar2.add(5);//burda hata verir
       // System.out.println(sayilar2);

        arr[0]=20;
        System.out.println(Arrays.toString(arr));//[20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        System.out.println("Arrayda degisiklik yapinca  sayilar2"+sayilar);



    }
}
