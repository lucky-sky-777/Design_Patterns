package baitap.creational_patterns.factory;

import baitap.creational_patterns.factory.sub_candy_factory.OrangeFactory;
import baitap.creational_patterns.factory.sub_candy_factory.StrawberryFactory;

public class Client {

    public static void main(String[] args) {
        CandyFactory candyFactory;

        candyFactory = new OrangeFactory();
        candyFactory.displayCandy();

        candyFactory = new StrawberryFactory();
        candyFactory.displayCandy();
    }

}