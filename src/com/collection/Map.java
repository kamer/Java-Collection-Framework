package com.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Map {

    public static void main(String[] args) {

        /////////////
        ///HashMap///
        /////////////

        HashMap<String, String> sozluk = new HashMap<>();
        sozluk.put("pencil", "kalem");
        sozluk.put("computer", "bilgisayar");
        sozluk.put("bottle", "şişe");
        sozluk.put("shoe", "ayakkabı");

        System.out.print("HashMap -> ");
        sozluk.forEach((kelimeEN, kelimeTR) -> System.out.print(kelimeEN + "-" +kelimeTR + " | "));
        System.out.println();


        /////////////
        ///TreeMap///
        /////////////

        TreeMap<Integer, String> alisverisListesi = new TreeMap<>();
        alisverisListesi.put(3, "Süt");
        alisverisListesi.put(4, "Yumurta");
        alisverisListesi.put(2, "Un");
        alisverisListesi.put(1, "Kakao");

        System.out.print("TreeMap -> ");
        alisverisListesi.forEach((siraNu, urun) -> System.out.print(siraNu + "." + urun + " | "));
        System.out.println();


        ///////////////
        ///HashTable///
        ///////////////

        Hashtable<Integer, String> menu = new Hashtable<>();
        menu.put(1, "Mercimek Çorbası");
        menu.put(2, "Alinazik");
        menu.put(3, "Pilav");
        menu.put(4, "Kola");

        System.out.print("HashTable -> ");
        menu.forEach((sira, yemek) -> System.out.print(sira + "." + yemek + " | "));


    }

}
