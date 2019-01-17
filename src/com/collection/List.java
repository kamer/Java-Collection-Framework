package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {

    public static void main(String[] args) {

        ///////////////
        ///ArrayList///
        ///////////////

        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Amasya");
        sehirler.add("Sivas");
        sehirler.add("İzmir");
        sehirler.add("Eskişehir");

        // Tekrarlı element ekliyoruz.
        sehirler.add("Amasya");

        // İstediğimiz index'e eleman ekliyoruz.
        sehirler.add(3, "Isparta");

        System.out.print("ArrayList -> ");
        sehirler.forEach(sehir -> System.out.print(sehir + " "));
        System.out.println();


        ////////////////
        ///LinkedList///
        ////////////////

        LinkedList<String> filmler = new LinkedList<String>();
        filmler.add("Person of Interest");
        filmler.add("Black Books");
        filmler.add("Seinfeld");
        filmler.add("Fargo");

        // İstediğimiz index'e eleman ekliyoruz.
        filmler.add(4, "Akasya Durağı");

        System.out.print("LinkedList -> ");
        filmler.forEach(film -> System.out.print(film + " "));

    }

}
