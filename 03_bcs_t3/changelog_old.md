BCS version 3 at t3 Heatable Windows
====================================

Describtion:
------------
Third evolution of the BCS case study. In time step t3 heatable windows are introduced to the system. The model is based on the data provided by Nahrendorfer et al. [NLS+18]. 

Additions:
----------
### Feature Model
HeatableWindows :: opt
LEDWindowHeatable :: opt
	-- requires --> HeatableWindows

### Software Architecture

HeatableWindowSystem :: SWCO

WindowTemperatureSystem :: SWCO
	WindowTemperatureController ::SWC
		-- frost --> WindowHeatableController; Wipersystem
		-- no Frost --> WindowHeatableController; Wipersystem
	
WindowHeatableController :: SWC
	-- turnWindowHeaterOff --> WindowHeater
	-- turnOffLEDWindowHEatable --> LEDWindowHeatable
	-- turnWindowHeaterOn --> WindowHeater
	-- turnOnLEDWindowHeatable --> LEDWindowHeatable

WindowTemperatureSensor :: sensor
	-- temperature --> WindowTemperatureController
	
	
WindowHeater :: actuator
LEDWindowHeatable ::actuator

### Hardware Architecture

### Variants and Feature Mapping

Removals:
---------
### Feature Model

### Software Architecture
	WindowTemperatureSensor :: from Wipersystem
	WindowTemperatureController :: from Wipersystem
	

### Hardware Architecture

### Variants and Feature Mapping

Modifications:
--------------
### Feature Model

### Software Architecture

### Hardware Architecture

### Variants and Feature Mapping

