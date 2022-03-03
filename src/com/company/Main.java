package com.company;

import static com.company.Enum_Hobbi.READ_BOOK;
import static com.company.Enum_Hobbi.RUN_IN_MORNIN;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Otes otes = new Otes(15, "Alex", READ_BOOK);
        System.out.println(otes.get_Info());
        otes.say();
        otes.eat(
                " eat a hamburger");


        System.out.println("------------------------------");


    Son son = new Son(15,"Ali",RUN_IN_MORNIN);
        System.out.println(son.get_Info());
        son.say();

        System.out.println("------------------------------");

    Son son1 = new Son(20,"Rock",READ_BOOK);
        System.out.println(son1.get_Info());
        son1.say();

    }
}
