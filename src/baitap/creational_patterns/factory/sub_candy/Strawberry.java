package baitap.creational_patterns.factory.sub_candy;

import baitap.creational_patterns.factory.Candy;

public class Strawberry implements Candy {
    @Override
    public void display() {
        System.out.println("Display Strawberry Candy");
    }
}