package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

    public static void main(String[] args) {

        /////////////
        ///HashSet///
        /////////////

        HashSet<String> meyveler = new HashSet<String>();
        meyveler.add("Elma");
        meyveler.add("Armut");
        meyveler.add("Muz");
        meyveler.add("Çilek");

        // Aynı elementten bir tane daha eklemeye çalışıyoruz.
        meyveler.add("Armut");

        // İki tane null eklemeye çalışıyoruz.
        meyveler.add(null);
        meyveler.add(null);
        System.out.print("HashSet -> ");
        meyveler.forEach(meyve -> System.out.print(meyve + " "));
        System.out.println();

        ///////////////////
        ///LinkedHashSet///
        ///////////////////

        LinkedHashSet<String> gunler = new LinkedHashSet<String>();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        // Aynı elementten tekrar kaydediyoruz.
        // Tekrarlı element sıralamayı değiştirmeyecek.
        gunler.add("Pazartesi");

        System.out.print("LinkedHashSet -> ");
        gunler.forEach(gun -> System.out.print(gun + " "));
        System.out.println();

        /////////////
        ///TreeSet///
        /////////////

        TreeSet<Integer> sayilar = new TreeSet<Integer>();
        sayilar.add(4);
        sayilar.add(7);
        sayilar.add(2);
        sayilar.add(9);

        // Tekrarlı element ekliyoruz.
        // Kaydetmeyecek.
        sayilar.add(7);

        System.out.print("TreeSet -> ");
        sayilar.forEach(sayi -> System.out.print(sayi + " "));

    }

}
