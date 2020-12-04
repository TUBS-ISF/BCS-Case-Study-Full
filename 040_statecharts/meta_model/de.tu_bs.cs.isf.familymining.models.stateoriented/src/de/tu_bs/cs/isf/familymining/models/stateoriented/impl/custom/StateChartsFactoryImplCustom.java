package de.tu_bs.cs.isf.familymining.models.stateoriented.impl.custom;

import de.tu_bs.cs.isf.familymining.models.stateoriented.StateChart;
import de.tu_bs.cs.isf.familymining.models.stateoriented.impl.StateChartsFactoryImpl;

public class StateChartsFactoryImplCustom extends StateChartsFactoryImpl {
	
	@Override
	public StateChart createStateChart() {
		return new StateChartImplCustom();
	}

}
