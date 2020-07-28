BCS version 2 at t2 Electric automatic Seat adjustment
======================================================

Describtion:
------------
Second evolution of the BCS case study. In time step t2 a functionality to automatically adjust the seat position based on key ID's is introduced to the system. The model is based on the data provided by Nahrendorfer et al. [NLS+18]. 

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

