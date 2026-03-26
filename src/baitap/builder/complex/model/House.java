package baitap.builder.complex.model;

import java.util.ArrayList;
import java.util.List;

public class House {

	private List<Storey> storeys = new ArrayList<>();

	public void addStorey(Storey storey) {
		storeys.add(storey);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("House{");
		sb.append("storeys=").append(storeys);
		sb.append('}');
		return sb.toString();
	}

}