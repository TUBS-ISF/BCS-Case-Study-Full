BCS version 4 at t4 Automatic Headlights
========================================

Describtion:
------------
fourth evolution of the BCS case study. In time step t4 automatic headlights are introduced to the system. The model is based on the data provided by Nahrendorfer et al. [NLS+18]. 

Additions:
----------
### Feature Model
AutomaticHeadlights :: opt


### Software Architecture 
	HighBeamSwitch :: sensor
		-- HB_off_but --> HMI
		-- HB_auto_but --> HMI
		-- HB_on_but --> HMI
	HeadLightSwitch :: sensor
		-- HL_on_but --> HMI
		-- HL_off_but --> HMI
		-- HL_auto_but --> HMI
		
HL_System :: SWCO
	--> turn_HB_off
	--> turn_HB_auto
	--> turn_HB_on
	--> turn_HL_on
	--> turn_HL_off
	--> turn_HL_auto
	--> car_drives
	--> motor_on
	--> motor_off
	
	NatLight_sensor :: sensor
		lightingCondition --> LightSensorController
		
	AproachingVehicle_sensor :: sensor
		-- AV_detected --> HL_Controller
		-- no_AV_detected --> HL_Controller
	
	
	LightSensorController :: SWC
		--> LightingCondition
		-- dark --> HL_Controller
		-- not_dark --> HL_Controller
		
	HL_Controller :: SWC
		--> dark
		--> not_dark
		
		--> AV_detected
		--> no_Av_detected
		
		--> turn_HB_off
		--> turn_HB_auto
		--> turn_HB_man
		--> turn_HL_on
		--> turn_HL_off
		--> turn_HL_auto
		
		--> car_drives
		--> motor_on
		--> motor_off
		
		-- PL_on --> ParkingLights
		-- PL_off --> ParkingLights
		-- DRL_on --> DaytimeRunningLights
		-- DRL_off --> DaytimeRunningLights
		-- LB_on --> LowBeam
		-- LB_off --> LowBeam
		-- HB_on --> HighBeam
		-- HB_off --> HighBeam

ParkingLights :: actuator
DaytimeRunningLights :: actuator
LowBeam :: actuator
HighBeam :: actuator

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
HMI :: SWC
	--> HB_off_but
	-->HB_auto_but
	--> HB_on_but
	--> HL_on_but
	--> HL_off_but
	--> HL_auto_but
	
	-- turn_HB_off --> HL_System
	-- turn_HB_auto --> HL_System
	-- turn_HB_on --> HL_System
	-- turn_HL_on --> HL_System
	-- turn_HL_off --> HL_System
	-- turn_HL_auto --> HL_System

driving_sensor :: sensor
	-- car_drives --> HL_System
	-- motor_on --> HL_System
	-- motor_off --> HL_System
	

### Hardware Architecture

### Variants and Feature Mapping

