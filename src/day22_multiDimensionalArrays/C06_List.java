package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

        /*Arrayi array yapan sembol koseli parantezdi[] array liste ise diamond <> elmas kullaniriz

         */

        List<String> isimler=new ArrayList<>();
        System.out.println(isimler);//[]
        //bir liste eleman eklemek istersek
        isimler.add("Basak");
        System.out.println(isimler.add("serap"));
        System.out.println(isimler);//[Basak,serap]

        /*
        Stringde bir method calistirdigimizda assign yazmazsak String degismiyordu

        String isim="Suleyman"
        isim.toUpperCase();//SULEYMAN
        sout(isim)-->Suleyman
         */
        //listin tek kotu tarafi array alt yapisini kullandigi icin elemanlari birer birer eklemek zorunda olmamizdir
    }
}
