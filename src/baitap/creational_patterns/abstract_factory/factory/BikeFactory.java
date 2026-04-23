package baitap.creational_patterns.abstract_factory.factory;

import baitap.creational_patterns.abstract_factory.pedal.Pedal;
import baitap.creational_patterns.abstract_factory.wheel.Wheel;

public interface BikeFactory {
	Wheel getWheel();
	Pedal getPedal();
}