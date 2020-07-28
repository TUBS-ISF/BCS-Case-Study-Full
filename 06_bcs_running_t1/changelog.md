BCS Running Example version 2 at t2 Electric automatic Seat adjustment
======================================================================

Describtion:
------------
Second evolution of the BCS Running Example. In time step t2 a functionality to automatically adjust the seat position based on key ID's is introduced to the system. The model is based on the data provided by Nahrendorfer et al. [NLS+18]. 

addSWcomponent{
	AutomaticSeatadjustement
	SeatPositionController
	BackrestMotor
	BackrestPositionSensor
	SeatForwardMotor
	SeatForwardPositionSensor
	SeatHeightMotor
	SeatHeigthSensor
	WheelPosMotor
	WheelPosSensor
}

removeSWcomponent{}

addSWport{
	rck_keyID(RemoteControllKeyController, AutomaticSeatadjustement)
	backrestPos(BackrestPositionSensor, SeatPositionController)
	seatHeigthPos(SeatHeigthSensor, SeatPositionController)
	seatForwardPos(SeatForwardPositionSensor, , SeatPositionController)
	wheelPos(WheelPosSensor, SeatPositionController)
	mv_backrest_up(SeatPositionController, BackrestMotor)
	mv_backrest_down(SeatPositionController, BackrestMotor)
	mv_seat_up(SeatPositionController, SeatHeightMotor)
	mv_seat_down(SeatPositionController, SeatHeightMotor)
	mv_seat_forward(SeatPositionController, SeatForwardMotor)
	mv_seat_backward(SeatPositionController, SeatForwardMotor)
	mv_wheel_up(SeatPositionController, WheelPosMotor)
	mv_wheel_down(SeatPositionController, WheelPosMotor)
	mv_wheel_forward(SeatPositionController, WheelPosMotor)
	mv_wheel_backward(SeatPositionController, WheelPosMotor)	
}

removeSWport{}

addHWcomponent{
	BackrestMotor
	SeatForwardMotor
	SeatHeightMotor
	WheelPosMotor
	SeatAdjustement
	BackrestPositionSensor
	SeatForwardSensor
	SeatHeigthSensor
	WheelPositionSensor
}

removeHWcomponent{}

addSWHWmapping{
	Mapping_BackrestMotor_BackrestMotor(BackrestMotor, BackrestMotor)
	Mapping_BackrestPositionSensor_BackrestPositionSensor(BackrestPositionSensor, BackrestPositionSensor)
	Mapping_SeatForwardMotor_SeatForwardMotor(SeatForwardMotor, SeatForwardMotor)
	Mapping_SeatForwardPositionSensor_SeatForwardPositionSensor(SeatForwardPositionSensor, SeatForwardPositionSensor)
	Mapping_SeatHeightMotor_SeatHeightMotor(SeatHeightMotor, SeatHeightMotor)
	Mapping_SeatHeightPositionSensor_SeatHeightPositionSensor(SeatHeightPositionSensor, SeatHeightPositionSensor)
	Mapping_WheelPosMotor_WheelPosMotor(WheelPosMotor, WheelPosMotor)
	Mapping_WheelPosSensor_WheelPosSensor(WheelPosSensor, WheelPosSensor)
}

removeSWHWmapping{}

addFeature{
	Seat
}

removeFeature{}

addFeatureConstraint{
	Seat implies RCK
}

removeFeatureConstraint{}

indirectImpactedComponents{
	RemotecontrolKeycontroller
	PowerWindow
	HMI
	CentralLockingSystem
}

indirectImpactedFeatures{
	RCK
	HMI
	Doorsystem
	PW
}

Additions:
----------
### Feature Model
Seat :: opt
	-- requires --> RCK

### Software Architecture

SeatPositionController :: SWC 
	-- loadSeatPosition --> LoadSeatPosController
	-- saveSeatPosition --> SavePosController
	-- setBackrestPosition --> BackrestMotor
	-- setSeatHight --> SeatHightMotor
	-- setSeatForwardPos --> SeatForwardMotor
	-- setWheelPos --> WheelPosMotor
	
BackrestPosition :: sensor
	--backrestPos-->SeatPositionController
SeatHight :: sensor
	--seatHight-->SeatPositionController
SeatForwardPos :: sensor
	--seatForwardPos-->SeatPositionController
WheelPos :: sensor
	--wheelPos-->SeatPositionController

BackrestMotor :: actuator
SeatHightMotor :: actuator
SeatForwardMotor :: actuator
WheelPosMotor :: actuator

### Hardware Architecture

### Variants and Feature Mapping

Removals:
---------
### Feature Model

### Software Architecture

### Hardware Architecture

### Variants and Feature Mapping

Modifications:
--------------
### Feature Model

### Software Architecture
	RCK :: SWC
	--keyID--> SeatPositionController

### Hardware Architecture

### Variants and Feature Mapping

