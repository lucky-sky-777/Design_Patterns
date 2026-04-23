package baitap.creational_patterns.abstract_factory.factory.sub_factory;

import baitap.creational_patterns.abstract_factory.factory.BikeFactory;
import baitap.creational_patterns.abstract_factory.pedal.Pedal;
import baitap.creational_patterns.abstract_factory.pedal.sub_pedal.RoadBikePedal;
import baitap.creational_patterns.abstract_factory.wheel.Wheel;
import baitap.creational_patterns.abstract_factory.wheel.sub_wheel.RoadBikeWheel;

public class RoadBikeFactory implements BikeFactory {
	@Override
	public Wheel getWheel() {
		return new RoadBikeWheel();
	}

	@Override
	public Pedal getPedal() {
		return new RoadBikePedal();
	}
}