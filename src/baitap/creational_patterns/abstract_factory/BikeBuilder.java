package baitap.creational_patterns.abstract_factory;

import baitap.creational_patterns.abstract_factory.factory.BikeFactory;
import baitap.creational_patterns.abstract_factory.factory.sub_factory.MountainBikeFactory;
import baitap.creational_patterns.abstract_factory.factory.sub_factory.RoadBikeFactory;
import baitap.creational_patterns.abstract_factory.pedal.Pedal;
import baitap.creational_patterns.abstract_factory.wheel.Wheel;

public class BikeBuilder {
	public static void main(String[] args) {
		BikeFactory bikeFactory;

		Wheel mountainBikeWheel;
		Pedal mountainBikePedal;

		Wheel roadBikeWheel;
		Pedal roadBikePedal;

		bikeFactory = new MountainBikeFactory();

		mountainBikeWheel = bikeFactory.getWheel();
		mountainBikePedal = bikeFactory.getPedal();

		System.out.println(mountainBikeWheel.name());
		System.out.println(mountainBikePedal.name());

		bikeFactory = new RoadBikeFactory();

		roadBikeWheel = bikeFactory.getWheel();
		roadBikePedal = bikeFactory.getPedal();

		System.out.println(roadBikeWheel.name());
		System.out.println(roadBikePedal.name());
	}
}