BCS version 1 at t1 Wiper
=========================

Describtion:
------------
First evolution of the BCS case study. In time step t1 the wiper functionality was introduced to the system. The model is based on the data provided by Nahrendorfer et al. [NLS+18]. 

Additions:
----------
### Feature Model
Wiper :: man
	and :: Clean, Sensor, Permanent, WiperType
Clean :: opt
Sensor :: man
	alt :: LowQualitySensor, HighQualitySensor
Permanent :: opt
	and :: Intensity
WiperType :: man [nicht EE relevant]
	alt :: LowQualityWiper, HighQualityWiper
LowQualitySensor :: opt
HighQualitySensor :: opt
FrostProtection :: opt
	and :: CleanProtection, SensorProtection, PermanentProtection
Intensity :: opt
LowQualityWiper :: opt
HighQualityWiper :: opt
CleanProtection :: opt
	constraint :: ==> Clean
SensorProtection :: man
PermanentProtection :: opt
	constraint :: ==> Permanent
LEDWiper :: opt
	constraint: Wiper ==> LEDWiper
LEDFrostProtection :: opt
	constraint: LEDFrostProtecton ==> FrostProtection
LEDClean :: opt
	
### Software Architecture
WiperSystem :: SWCO
	composedOf ::
Wiper :: SWCO
	composedOf :: LowQualityWiper
	composedOf :: HighQualityWiper

WiperButton :: sensor
	-- disableWiper --HMI
	--enableWiper--> HMI
	--permanentOn--> HMI
WiperIntensityButton :: sensor
	--level_1--> HMI
	--level_2--> HMI
	--level_3--> HMI
LowQualityRainSensor :: sensor
	-- noRainDetected --> RainSensorControler
	-- rainDetected --> RainSensorControler
HighQualityRainSensor :: sensor
	-- noRainDetected --> RainSensorControler
	-- littleRainDetected --> RainSensorControler
	-- heavyRainDetected --> rainSensorController
WindShieldTemperatureSensor :: sensor
	-- temperature --> WindShieldTemperatureController
ScreenWashsensor :: sensor
	-- ScreenWashFill --> ScreenWashcontroller
CleaningButton :: sensor
	--clean--> HMI
	
WiperController :: SWC
	-- disableWiper --> LowQualityWiper; HighQualityWiper
	-- enableWiper --> LowQualityWiper; HighQualityWiper
	-- WipeSlow --> LowQualityWiper, HighQualityWiper
	-- WipeFast --> HighQualityWiper
	-- WipeMedium --> HighQualityWiper
	-- clean --> LowQualityWiper; HighQualityWiper
	-- ledFrostProtection_on --> LEDFrostProtection
	-- ledFrostProtection_off --> LEDFrostProtection
	-- autoWiping_on --> ledWiper_on
	-- autowiping_off --> ledWiper_off
	
RainSensorController :: SWC
	-- WiperOff --> WiperController
	-- WipeSlow --> WiperController
	-- WipeFast --> WiperController
WindShieldTemperatureController :: SWC
	-- frost_detected --> LEDFrostProtection
	-- no_frost_detected --> LEDFrostProtection
	-- frost_detected --> ScreenWashcontroller
	-- no_frost_detected --> ScreenWashcontroller
	-- frost_detected --> WiperController
	-- no_frost_detected --> WiperController
	
ScreenWashcontroller :: SWC
	-- ScreenWashLow --> LEDClean
	-- ScreenWashRefilled --> LEDClean
	-- useScreenWash --> ScreenWashNozzel
	
LowQualityWiper :: actuator
HighQualityWiper :: actuator
ScreenWashNozzel :: actuator
LEDFrostProtection :: actuator
LEDClean :: actuator
LEDWiper :: actuator

### Hardware Architecture
WiperSystem :: ECU 


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
StatusLED :: opt
	or :: LEDWiper, LEDFrostProtection, LEDClean

### Software Architecture
HMI
	-- WiperDisabled -- WiperController
	-- WiperEnabled --WiperController
	-- WipePermanent --> WiperController
	-- WipeAuto --> WiperController
	-- WipeAuto --> LEDWiper
	-- WipeLevel_1 --> WiperController
	-- WipeLevel_2 --> WiperController
	-- WipeLevel_3 --> WiperController
	-- clean--> WiperController
### Hardware Architecture

### Variants and Feature Mapping

