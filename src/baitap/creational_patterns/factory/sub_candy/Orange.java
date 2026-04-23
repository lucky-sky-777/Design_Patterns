package baitap.creational_patterns.factory.sub_candy;

import baitap.creational_patterns.factory.Candy;

public class Orange implements Candy {
    @Override
    public void display() {
        System.out.println("Display Orange Candy");
    }
}