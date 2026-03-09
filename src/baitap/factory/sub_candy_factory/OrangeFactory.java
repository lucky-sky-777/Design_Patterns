package baitap.factory.sub_candy_factory;

import baitap.factory.Candy;
import baitap.factory.CandyFactory;
import baitap.factory.sub_candy.Orange;

public class OrangeFactory extends CandyFactory {
    @Override
    public Candy createCandy() {
        return new Orange();
    }
}