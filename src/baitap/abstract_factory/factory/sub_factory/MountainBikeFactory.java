package baitap.abstract_factory.factory.sub_factory;

import baitap.abstract_factory.factory.BikeFactory;
import baitap.abstract_factory.pedal.Pedal;
import baitap.abstract_factory.pedal.sub_pedal.MountainBikePedal;
import baitap.abstract_factory.wheel.Wheel;
import baitap.abstract_factory.wheel.sub_wheel.MountainBikeWheel;

public class MountainBikeFactory implements BikeFactory {
	@Override
	public Wheel getWheel() {
		return new MountainBikeWheel();
	}

	@Override
	public Pedal getPedal() {
		return new MountainBikePedal();
	}
}