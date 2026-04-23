package baitap.creational_patterns.abstract_factory.wheel.sub_wheel;

import baitap.creational_patterns.abstract_factory.wheel.Wheel;

public class RoadBikeWheel implements Wheel {
	@Override
	public String name() {
		return "RoadBikeWheel";
	}
}