package baitap.abstract_factory.factory;

import baitap.abstract_factory.pedal.Pedal;
import baitap.abstract_factory.wheel.Wheel;

public interface BikeFactory {
	Wheel getWheel();
	Pedal getPedal();
}