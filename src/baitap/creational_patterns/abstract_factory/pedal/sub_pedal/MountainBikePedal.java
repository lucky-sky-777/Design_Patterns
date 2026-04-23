package baitap.creational_patterns.abstract_factory.pedal.sub_pedal;

import baitap.creational_patterns.abstract_factory.pedal.Pedal;

public class MountainBikePedal implements Pedal {
	@Override
	public String name() {
		return "MountainBikePedal";
	}
}