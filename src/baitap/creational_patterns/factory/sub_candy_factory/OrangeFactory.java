package baitap.creational_patterns.factory.sub_candy_factory;

import baitap.creational_patterns.factory.Candy;
import baitap.creational_patterns.factory.CandyFactory;
import baitap.creational_patterns.factory.sub_candy.Orange;

public class OrangeFactory extends CandyFactory {
    @Override
    public Candy createCandy() {
        return new Orange();
    }
}