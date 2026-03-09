package baitap.factory.sub_candy_factory;

import baitap.factory.Candy;
import baitap.factory.CandyFactory;
import baitap.factory.sub_candy.Strawberry;

public class StrawberryFactory extends CandyFactory {
    @Override
    public Candy createCandy() {
        return new Strawberry();
    }
}