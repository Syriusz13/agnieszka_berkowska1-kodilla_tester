package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {

    public static void main(String[] args) {

        Integer a = 1000; //to 2 różne obiekty o tej samej wartości
        Integer b = 1000;

        System.out.println(a == b); //== porównuje obiekty (a właściwie ich adresy) więc będzie false
        System.out.println(a.equals(b)); // aby porównć czy obiekty (a nie ich adresy) są takie same trzeba wykorzystać  metodę boolean equals (Object o)
        System.out.println("--------");

        String x = "This is string";
        String y = "This is string";

        System.out.println(x==y);
        System.out.println(x.equals(y));
        System.out.println("------------");

        Integer c = 100;
        Integer d = 100;

        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c==d);

        c=c+10;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c==d);

        c=10567;
        d=10567;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c==d);
        System.out.println("-----------------");

        String s1 = "text";
        String s2 = new String ("text");    //wymuszenie utworzenia nowego obiektu
    }
}
// uwaga - Integer jeżeli użyjamy wartości -128 do 127 to obiekty i ich wartości będą takie same
// uwaga - String - Java tym samym wartością przypisuje te same obiekty, można wymusić przypisanie nowego obiektu