package baitap.abstract_factory.wheel.sub_wheel;

import baitap.abstract_factory.wheel.Wheel;

public class MountainBikeWheel implements Wheel {
	@Override
	public String name() {
		return "MountainBikeWheel";
	}
}