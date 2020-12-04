package de.tu_bs.cs.isf.familymining.models.stateoriented.impl.custom;

import de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartImpl;

public class StateChartImplCustom extends StateChartImpl {

	private static final String FILE_EXTENSION = "statechart";

	@Override
	public String getModelFileExtension() {
		return FILE_EXTENSION;
	}
	
}
