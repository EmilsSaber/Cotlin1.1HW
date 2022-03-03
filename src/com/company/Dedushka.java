package com.company;

public class Dedushka {
    private int age;
    private String name;
    private Enum hObbi;


    public Dedushka(int age, String name, Enum hObbi) {
        this.age = age;
        this.name = name;
        this.hObbi = hObbi;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String get_Info(){

        return "name: " + name +
                "age: " + age +
                "hobbi: " + hObbi;
    }


}
