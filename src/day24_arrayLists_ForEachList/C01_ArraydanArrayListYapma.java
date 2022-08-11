package day24_arrayLists_ForEachList;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydanArrayListYapma {
    public static void main(String[] args) {
        String[] arr={"Ismail","Nurullah","Fatih"};
        /*
        uzun listeler olusturmamiz gerektiginde tek tek eklemek yerine
        array olusturup bunlari liste cevirmek daha pratik olabilir
        1-Loop ile arraydaki tum elemantleri liste atabiliriz
        2-Arrays asList () kullanabiliriz
        ancak bu methodun 2 tane kotu yan etkisi var
        1-arrays classi kullanildigi icin array ozellikleri gecerlimolur
        dolayisiyla listte olan add remove gibi size yi degistiren methodla
        bu sekilde olusturulan listlerde kullanilamaz
        2- Kaynak olan array ile urun olan Lait ozdeslesttirilir
        biinde ya[ilan degisiklik dogal olarak digerine de islenir
         */

        List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList);//[Ismail, Nurullah, Fatih]

        List<Integer> sayilar=Arrays.asList(new Integer[5]);

        //1.yan etki
       // sinifList.add("Erdi");
        //
        // sinifList.remove(1);//UnsupportedOperationException
        //2.yan etki
        arr[1]="Emre";
        System.out.println("degisim sonrasi array: "+Arrays.toString(arr));
        System.out.println("Arrayidegistirince list :"+sinifList);//:[Ismail, Emre, Fatih]

        sinifList.set(0,"utku");
        System.out.println("Listi degistirince list :"+sinifList);//utku, Emre, Fatih]
        System.out.println("Listi degistirince Array : "+Arrays.toString(arr));

    }
}
