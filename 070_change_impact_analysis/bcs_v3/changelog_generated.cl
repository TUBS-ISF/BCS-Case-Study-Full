BCS version 3 at t3 Heatable Windows
====================================

Describtion:
------------
Third evolution of the BCS case study. In time step t3 heatable windows are introduced to the system. The model is based on the data provided by Nahrendorfer et al. [NLS+18]. 

addSWBlocks{
	WindowHeaterSystem
	WindowTemperatureSystem
	WindowHeatableController
	LED_HeatableWindow
	WindowHeater
	WindowHeaterSystem
	WindowTemperatureSystem
	WindowHeatableController
	LED_HeatableWindow
	WindowHeater
	Impl_WindowHeatableControlle
}

removeSWBlock{
}

updateSWBlock{
	System_Software_Architecture(ComposedOfChange)
	WindShieldTemperatureControl(parentCompositionChange)
	WiperSystem(SoftwarePortsChange)
	WiperSystem(ComposedOfChange)
}

addSWPort{
	sense_Frost(WiperSystem)
	sense_noFrost(WiperSystem)
	sense_frost(WindowHeaterSystem)
	sense_noFrost(WindowHeaterSystem)
	sense_frost(WindowTemperatureSystem)
	sense_noFrost(WindowTemperatureSystem)
	sense_frost(WindowHeatableController)
	sense_noFrost(WindowHeatableController)
	LED_HW_off(WindowHeatableController)
	LED_HW_on(WindowHeatableController)
	WH_off(WindowHeatableController)
	Wh_on(WindowHeatableController)
	lED_HW_off(LED_HeatableWindow)
	LED_HW_on(LED_HeatableWindow)
	Wh_off(WindowHeater)
	WH_on(WindowHeater)
}

removeSWPort{
}

updateSWPort{
}

addHardwareBlock{
	WindowHeatableController
	LED_HeatableWindow
	WindowHeater
	WindowTemperatureController
	WindShieldTemperatureSensor
}

removeHardwareBlock{
	WindShieldTemperatureSensor
}

updateHardwareBlock{
}

addHardwarePort{
}

removeHardwarePort{
}

updateHardwarePort{
}

addOther{
	LED_HW_off(InterfaceImpl)
	LED_HW_on(InterfaceImpl)
	WH_off(InterfaceImpl)
	WH_on(InterfaceImpl)
}

removeOther{
}

updateOther{
}
