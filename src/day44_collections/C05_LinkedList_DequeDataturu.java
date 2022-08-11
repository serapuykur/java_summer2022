package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataturu {
    public static void main(String[] args) {
        Deque<String>ll4=new LinkedList<>();
        ll4.add("Cavidan");
        ll4.add("mesut");
        ll4.add("selim");
        ll4.add("Tevfik");
        ll4.add("sinan");
        ll4.removeLastOccurrence("selim");
        System.out.println(ll4);//[Cavidan, mesut, Tevfik, sinan]
        System.out.println(ll4.pop());//Cavidan
    }
}
