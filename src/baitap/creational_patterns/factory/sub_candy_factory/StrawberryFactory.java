package baitap.creational_patterns.factory.sub_candy_factory;

import baitap.creational_patterns.factory.Candy;
import baitap.creational_patterns.factory.CandyFactory;
import baitap.creational_patterns.factory.sub_candy.Strawberry;

public class StrawberryFactory extends CandyFactory {
    @Override
    public Candy createCandy() {
        return new Strawberry();
    }
}