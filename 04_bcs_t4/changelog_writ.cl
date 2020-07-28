Changelogs for: deltas

addSWBlocks{
	HL_Controller
	LightSensorController
	HighBeam
	LowBeam
	DayTimeRunningLights
	ParkingLights
	ApproachingVehilceSensor
	NatLightSensor
	HL_System
	HL_System
	HeadLightSwitch
	HighBeamSwitch
	HL_Controller
	LightSensorController
	HighBeam
	LowBeam
	DayTimeRunningLights
	ParkingLights
	ApproachingVehilceSensor
	NatLightSensor
	HeadLightSwitch
	HighBeamSwitch
	Impl_HL_Controller
	Impl_LightSensorController
}

removeSWBlock{
}

updateSWBlock{
}

addSWPort{
	car_motor_off(HL_System)
	car_motor_on(HL_System)
	car_drives(HL_System)
	turn_HL_auto(HL_System)
	turn_HL_off(HL_System)
	turn_HL_on(HL_System)
	turn_HB_auto(HL_System)
	turn_HB_off(HL_System)
	turn_HB_on(HL_System)
	HL_auto_but(HumanMachineInterface)
	HL_on_but(HumanMachineInterface)
	HL_off_but(HumanMachineInterface)
	HB_auto_but(HumanMachineInterface)
	HB_on_but(HumanMachineInterface)
	HB_off_but(HumanMachineInterface)
	turn_HL_auto(HumanMachineInterface)
	turn_HL_off(HumanMachineInterface)
	turn_HL_on(HumanMachineInterface)
	turn_HB_auto(HumanMachineInterface)
	turn_HB_off(HumanMachineInterface)
	turn_HB_on(HumanMachineInterface)
	no_AV_detected(HL_Controller)
	AV_detected(HL_Controller)
	not_dark(HL_Controller)
	dark(HL_Controller)
	car_motor_off(HL_Controller)
	car_motor_on(HL_Controller)
	car_drives(HL_Controller)
	turn_HL_auto(HL_Controller)
	turn_HL_off(HL_Controller)
	turn_HL_on(HL_Controller)
	turn_HB_auto(HL_Controller)
	turn_HB_off(HL_Controller)
	turn_HB_on(HL_Controller)
	HB_off(HL_Controller)
	HB_on(HL_Controller)
	LB_off(HL_Controller)
	LB_on(HL_Controller)
	DRL_off(HL_Controller)
	DRL_on(HL_Controller)
	PL_off(HL_Controller)
	PL_on(HL_Controller)
	LightingCondition(LightSensorController)
	not_dark(LightSensorController)
	dark(LightSensorController)
	HB_off(HighBeam)
	HB_on(HighBeam)
	LB_off(LowBeam)
	LB_on(LowBeam)
	DRL_off(DayTimeRunningLights)
	DRL_on(DayTimeRunningLights)
	PL_off(ParkingLights)
	PL_on(ParkingLights)
	no_AV_detected(ApproachingVehilceSensor)
	AV_detected(ApproachingVehilceSensor)
	LightingCondition(NatLightSensor)
	HL_auto_but(HeadLightSwitch)
	HL_off_but(HeadLightSwitch)
	HL_on_but(HeadLightSwitch)
	HB_auto_but(HighBeamSwitch)
	HB_on_but(HighBeamSwitch)
	HB_off_but(HighBeamSwitch)
	car_motor_off(driving_sensor)
	car_motor_on(driving_sensor)
}

removeSWPort{
}

updateSWPort{
}

addHardwareBlock{
	HL_Controller
	HighBeam
	LowBeam
	DaytimeRunningLights
	ParkingLights
	ApproachingVehicle_snesor
	NatLight_sensor
	HeadLightSwitch
	HighBeamSwitch
}

removeHardwareBlock{
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
	not_dark(InterfaceImpl)
	dark(InterfaceImpl)
	turn_HL_auto(InterfaceImpl)
	turn_HL_off(InterfaceImpl)
	turn_HL_on(InterfaceImpl)
	turn_HB_auto(InterfaceImpl)
	turn_HB_on(InterfaceImpl)
	turn_HB_off(InterfaceImpl)
	HB_off(InterfaceImpl)
	HB_on(InterfaceImpl)
	LB_off(InterfaceImpl)
	LB_on(InterfaceImpl)
	DRL_off(InterfaceImpl)
	DRL_on(InterfaceImpl)
	PL_off(InterfaceImpl)
	PL_on(InterfaceImpl)
	no_AV_detected(InterfaceImpl)
	AV_detected(InterfaceImpl)
	LightingCondition(InterfaceImpl)
	car_motor_off(InterfaceImpl)
	car_motor_on(InterfaceImpl)
	HL_auto_but(InterfaceImpl)
	HL_off_but(InterfaceImpl)
	HL_on_but(InterfaceImpl)
	HB_on_but(InterfaceImpl)
	HB_auto_but(InterfaceImpl)
	HB_off_but(InterfaceImpl)
}

removeOther{
}

updateOther{
}
