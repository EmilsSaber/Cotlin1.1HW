package com.company;

public class Otes extends Dedushka{
    private String name;
    private int age;
    private Enum hOBbi;

    public Otes(int age, String name, Enum hObbi) {
        super(age, name, hObbi);

        this.name = name;
        this.age = age;
        this.hOBbi = hObbi;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public Enum gethOBbi() {
        return hOBbi;
    }

    public void say(){
        System.out.println(name + " say today is (a good day)  ");
    }

    public final void eat(String eat){
        System.out.println(name + eat);
    }

    public String get_Info(){

        return "name: " + name +
                "\n age: " + age +
                "\n hobbi: " + hOBbi;

    }

}
