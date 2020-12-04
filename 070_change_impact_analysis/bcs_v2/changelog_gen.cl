Changelogs for: diff

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
	rckc_keyID(AutomaticSeatadjustement)
	rck_keyID(RemoteControlKeyController_1)
	rckc_keyId(RemoteControlKeyController_1)
	wheelPos(SeatPositioncontroller_1)
	seatForwardPos(SeatPositioncontroller_1)
	seatHeight(SeatPositioncontroller_1)
	backrestPos(SeatPositioncontroller_1)
	rckc_keyID(SeatPositioncontroller_1)
	mv_wheel_down(SeatPositioncontroller_1)
	mv_wheel_up(SeatPositioncontroller_1)
	mv_wheel_forward(SeatPositioncontroller_1)
	mv_wheel_backward(SeatPositioncontroller_1)
	mv_seat_backward(SeatPositioncontroller_1)
	mv_seat_forward(SeatPositioncontroller_1)
	mv_seat_down(SeatPositioncontroller_1)
	mv_seat_up(SeatPositioncontroller_1)
	mv_backrest_down(SeatPositioncontroller_1)
	mv_backrest_up(SeatPositioncontroller_1)
	mv_wheel_down(WheelPosMotor)
	mv_wheel_up(WheelPosMotor)
	mv_wheel_forward(WheelPosMotor)
	mv_wheel_backward(WheelPosMotor)
	Sender_Portprototyp192(WheelPosMotor)
	mv_seat_backward(SeatForwardMotor)
	mv_seat_forward(SeatForwardMotor)
	mv_seat_down(SeatHeigthMotor)
	mv_seat_up(SeatHeigthMotor)
	mv_backrest_down(BackrestMotor)
	mv_backrest_up(BackrestMotor)
	wheelPos(WheelPossensor)
	seatForwardPos(SeatForwardPosSensor)
	seatHeight(SeatHeigthSensor)
	backrestPos(BackrestPositionSensor)
	rck_keyId(Remote_Cotroll_Key)
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
