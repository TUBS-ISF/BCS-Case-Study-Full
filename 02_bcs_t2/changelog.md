BCS version 2 at t2 Electric automatic Seat adjustment
======================================================

Describtion:
------------
Second evolution of the BCS case study. In time step t2 a functionality to automatically adjust the seat position based on key ID's is introduced to the system. The model is based on the data provided by Nahrendorfer et al. [NLS+18]. 

addSWBlocks{
	AutomaticSeatadjustement
	SeatPositioncontroller
	WheelPosMotor
	SeatForwardMotor
	SeatHeigthMotor
	BackrestMotor
	WheelPosSensor
	SeatForwardPosSensor
	SeatHeigthSensor
	BackrestPositionSensor
	AutomaticSeatadjustement
	SeatPositioncontroller_1
	WheelPosMotor
	SeatForwardMotor
	SeatHeigthMotor
	BackrestMotor
	WheelPossensor
	SeatForwardPosSensor
	SeatHeigthSensor
	BackrestPositionSensor
	Impl_SeatPositioncontroller
}

removeSWBlock{
}

updateSWBlock{
	System_Software_Architecture(ComposedOfChange)
	RemoteControlKeyController_1(SoftwarePortsChange)
	Remote_Cotroll_Key(SoftwarePortsChange)
}

addSWPort{
	rckc_keyID
	rck_keyID
	rckc_keyId
	wheelPos
	seatForwardPos
	seatHeight
	backrestPos
	rckc_keyID
	mv_wheel_down
	mv_wheel_up
	mv_wheel_forward
	mv_wheel_backward
	mv_seat_backward
	mv_seat_forward
	mv_seat_down
	mv_seat_up
	mv_backrest_down
	mv_backrest_up
	mv_wheel_down
	mv_wheel_up
	mv_wheel_forward
	mv_wheel_backward
	Sender_Portprototyp192
	mv_seat_backward
	mv_seat_forward
	mv_seat_down
	mv_seat_up
	mv_backrest_down
	mv_backrest_up
	wheelPos
	seatForwardPos
	seatHeight
	backrestPos
	rck_keyId
}

removeSWPort{
}

updateSWPort{
}

addHardwareBlock{
	SeatAdjustement
	WheelPosMotor
	SeatForwardMotor
	SeatHeightMotor
	BackrestMotor
	WheelPositionSensor
	SeatForwardSensor
	SeatHeightSensor
	BackrestPositionSensor
}

removeHardwareBlock{
}

updateHardwareBlock{
	ECU5_Wiper(ConnectionsChange)
	ScreenWashSensor(ConnectionsChange)
	ECU1_Doorsystem(ConnectionsChange)
	HighQualityWiper(ConnectionsChange)
}

addHardwarePort{
}

removeHardwarePort{
}

updateHardwarePort{
}

addOther{
	rckc_keyId(InterfaceImpl)
	mv_wheel_forward(InterfaceImpl)
	mv_wheel_backward(InterfaceImpl)
	mv_wheel_down(InterfaceImpl)
	mv_wheel_up(InterfaceImpl)
	mv_seat_backward(InterfaceImpl)
	mv_seat_forward(InterfaceImpl)
	mv_seat_down(InterfaceImpl)
	mv_seat_up(InterfaceImpl)
	mv_backrest_down(InterfaceImpl)
	mv_backrest_up(InterfaceImpl)
	rck_keyId(InterfaceImpl)
	wheel_pos(InterfaceImpl)
	seat_forward_pos(InterfaceImpl)
	seatHeight(InterfaceImpl)
	backrestPos(InterfaceImpl)
}

removeOther{
}

updateOther{
}
