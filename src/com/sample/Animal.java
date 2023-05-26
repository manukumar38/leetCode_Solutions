package com.sample;

public class Animal {

    public final int height = 200;

    public void food () {
        System.out.println("Animal food");
    }

}

class Tiger extends Animal{

    public final int height = 300;

    public void food () {
        System.out.println("Tiger food");
    }

}

class Test1 {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        System.out.println(t1.height);// prints 300 in Tiger, if not initialized prints default 0
        t1.food();// prints "Tiger food"

        Animal t2 = new Tiger();
        System.out.println(t2.height);// prints 200 in Animal, Make sure it is not private(Compilation error)
        System.out.println(((Tiger) t2).height);// prints 300 in Tiger
        t2.food();// prints "Tiger food" , reverse to variables

        Animal t3 = new Animal();
        System.out.println(t3.height);// prints 200 in Animal
        t3.food();
        ((Tiger) t3).food(); // java.lang.ClassCastException
    }
}