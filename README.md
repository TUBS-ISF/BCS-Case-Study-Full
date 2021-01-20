# BCS-Case-Study
This repository contains a collection of artifacts for the body comfort system case study.

## Mapping of collected artifacts to original sources

### [000_documentation](https://github.com/TUBS-ISF/BCS-Case-Study/tree/master/000_documentation)
In this directory, the documentation of modeling the Body-Comfort-System case study as Delta-oriented Software Product Line can be found.
* Lity, Sascha, et al. "[Delta-oriented software product line test models-the body comfort system case study.](https://github.com/TUBS-ISF/BCS-Case-Study/blob/master/000_documentation/Lity%20et%20al._2015_Delta-oriented%20Software%20Product%20Line%20Test%20Models%20-%20The%20Body%20Comfort%20System%20Case%20Study.pdf)" TU Braunschweig, Tech. Rep. 2012-07 (2013).
* Nahrendorf, Sophia, Sascha Lity, and Ina Schaefer. "[Applying Higher-Order Delta Modeling for the Evolution of Delta-Oriented Software Product Lines.](https://github.com/TUBS-ISF/BCS-Case-Study/blob/master/000_documentation/Nahrendorf%2C%20Lity%2C%20Schaefer_2018_Applying%20Higher-Order%20Delta%20Modeling%20for%20the%20Evolution%20of%20Delta-Oriented%20Software%20Product%20Lines.pdf)" Technical Report. TU Braunschweig-Institute of Software Engineering and Automotive Informatics, 2018.

### [010_featuremodels](https://github.com/TUBS-ISF/BCS-Case-Study/tree/master/010_featuremodels)
Contains the variability models of the different BCS versions described in [Applying Higher-Order Delta Modeling for the Evolution of Delta-Oriented Software Product Lines.](https://github.com/TUBS-ISF/BCS-Case-Study/blob/master/000_documentation/Nahrendorf%2C%20Lity%2C%20Schaefer_2018_Applying%20Higher-Order%20Delta%20Modeling%20for%20the%20Evolution%20of%20Delta-Oriented%20Software%20Product%20Lines.pdf). The variability models are provided in the [FeatureIDE](https://featureide.github.io/) feature model format.

#### The data was used in:
* Pett, Tobias, Domenik Eichhorn, and Ina Schaefer. "[Risk-based compatibility analysis in automotive systems engineering.](https://dl.acm.org/doi/abs/10.1145/3417990.3421263)" Proceedings of the 23rd ACM/IEEE International Conference on Model Driven Engineering Languages and Systems: Companion Proceedings. 2020.

### [020_delta_architectures](https://github.com/TUBS-ISF/BCS-Case-Study/tree/master/020_delta_architectures)
Modeled Delta-Architectures described in [Delta-oriented software product line test models-the body comfort system case study.](https://github.com/TUBS-ISF/BCS-Case-Study/blob/master/000_documentation/Lity%20et%20al._2015_Delta-oriented%20Software%20Product%20Line%20Test%20Models%20-%20The%20Body%20Comfort%20System%20Case%20Study.pdf) and [Applying Higher-Order Delta Modeling for the Evolution of Delta-Oriented Software Product Lines.](https://github.com/TUBS-ISF/BCS-Case-Study/blob/master/000_documentation/Nahrendorf%2C%20Lity%2C%20Schaefer_2018_Applying%20Higher-Order%20Delta%20Modeling%20for%20the%20Evolution%20of%20Delta-Oriented%20Software%20Product%20Lines.pdf).

#### Used in:
* Lachmann, Remo. [Black-Box Test Case Selection and Prioritization for Software Variants and Versions.](https://publikationsserver.tu-braunschweig.de/receive/dbbs_mods_65266) Diss. Technische Universität Carolo-Wilhelmina zu Braunschweig, 2017.
* Lity, Sascha Burkhard. [Model-Based Product-Line Regression Testing of Variants and Versions of Variants.](https://publikationsserver.tu-braunschweig.de/receive/dbbs_mods_00068116) Diss. Braunschweig University of Technology, Germany, 2020.

### [030_preevision_models](https://github.com/TUBS-ISF/BCS-Case-Study/tree/master/030_preevision_models)
This section contains the BCS case study's software and hardware architecture models, modeled in [PREEvision](https://www.vector.com/int/en/products/products-a-z/software/preevision/). Includes models in the PREEvision standard format and in the [ARXML](https://www.autosar.org/fileadmin/user_upload/standards/classic/4-3/AUTOSAR_TPS_ARXMLSerializationRules.pdf) format. The architectures are modeled after the descriptions contained in [Delta-oriented software product line test models-the body comfort system case study.](https://github.com/TUBS-ISF/BCS-Case-Study/blob/master/000_documentation/Lity%20et%20al._2015_Delta-oriented%20Software%20Product%20Line%20Test%20Models%20-%20The%20Body%20Comfort%20System%20Case%20Study.pdf) and [Applying Higher-Order Delta Modeling for the Evolution of Delta-Oriented Software Product Lines.](https://github.com/TUBS-ISF/BCS-Case-Study/blob/master/000_documentation/Nahrendorf%2C%20Lity%2C%20Schaefer_2018_Applying%20Higher-Order%20Delta%20Modeling%20for%20the%20Evolution%20of%20Delta-Oriented%20Software%20Product%20Lines.pdf).

#### Used in:
* Pett, Tobias, Domenik Eichhorn, and Ina Schaefer. "[Risk-based compatibility analysis in automotive systems engineering.](https://dl.acm.org/doi/abs/10.1145/3417990.3421263)" Proceedings of the 23rd ACM/IEEE International Conference on Model Driven Engineering Languages and Systems: Companion Proceedings. 2020.

### [040_statcharts](https://github.com/TUBS-ISF/BCS-Case-Study/tree/master/040_statecharts)
Contains the modeled behavior of the BCS versions as statecharts. The behavior of components is modeled according to the requirements of the BCS case study. Both requirements and state chart modeling is described in [Delta-oriented software product line test models-the body comfort system case study.](https://github.com/TUBS-ISF/BCS-Case-Study/blob/master/000_documentation/Lity%20et%20al._2015_Delta-oriented%20Software%20Product%20Line%20Test%20Models%20-%20The%20Body%20Comfort%20System%20Case%20Study.pdf) and [Applying Higher-Order Delta Modeling for the Evolution of Delta-Oriented Software Product Lines.](https://github.com/TUBS-ISF/BCS-Case-Study/blob/master/000_documentation/Nahrendorf%2C%20Lity%2C%20Schaefer_2018_Applying%20Higher-Order%20Delta%20Modeling%20for%20the%20Evolution%20of%20Delta-Oriented%20Software%20Product%20Lines.pdf).

#### Used in:
* Lachmann, Remo. [Black-Box Test Case Selection and Prioritization for Software Variants and Versions.](https://publikationsserver.tu-braunschweig.de/receive/dbbs_mods_65266) Diss. Technische Universität Carolo-Wilhelmina zu Braunschweig, 2017.
* Lity, Sascha Burkhard. [Model-Based Product-Line Regression Testing of Variants and Versions of Variants.](https://publikationsserver.tu-braunschweig.de/receive/dbbs_mods_00068116) Diss. Braunschweig University of Technology, Germany, 2020.

### [050_message_sequence_charts](https://github.com/TUBS-ISF/BCS-Case-Study/tree/master/050_message_sequence_charts)
Contains test cases for the integration test of components of the BCS case study. The test cases are modeled as message sequence charts.

#### Used in:
* Lachmann, Remo. [Black-Box Test Case Selection and Prioritization for Software Variants and Versions.](https://publikationsserver.tu-braunschweig.de/receive/dbbs_mods_65266) Diss. Technische Universität Carolo-Wilhelmina zu Braunschweig, 2017.
* Lity, Sascha Burkhard. [Model-Based Product-Line Regression Testing of Variants and Versions of Variants.](https://publikationsserver.tu-braunschweig.de/receive/dbbs_mods_00068116) Diss. Braunschweig University of Technology, Germany, 2020.
* Lischke, Sabrina. [Delta-oriented Test SetOptimization using GeneticAlgorithms](https://github.com/TUBS-ISF/BCS-Case-Study/blob/master/000_documentation/Lischke%20et%20al._2016_Delta-oriented%20Test%20SetOptimization%20using%20GeneticAlgorithms.pdf). Master’s thesis. TU Braunschweig, Germany, 2016.

### [070_change-impact_analysis](https://github.com/TUBS-ISF/BCS-Case-Study/tree/master/070_change_impact_analysis)
This section contains the analysis of the impact of changes on the BCS case study's architectural level. The impact of changes between the four BCS versions is used to calculate risk values for the BCS software and hardware components.

#### Used in:
* Pett, Tobias, Domenik Eichhorn, and Ina Schaefer. "[Risk-based compatibility analysis in automotive systems engineering.](https://dl.acm.org/doi/abs/10.1145/3417990.3421263)" Proceedings of the 23rd ACM/IEEE International Conference on Model Driven Engineering Languages and Systems: Companion Proceedings. 2020.

### [080_samples](https://github.com/TUBS-ISF/BCS-Case-Study/tree/master/080_samples)
Contains samples created for all four BCS version using various sampling algorithms provided by [FeatureIDE](https://featureide.github.io/).

#### Used in:
* Pett, Tobias, Domenik Eichhorn, and Ina Schaefer. "[Risk-based compatibility analysis in automotive systems engineering.](https://dl.acm.org/doi/abs/10.1145/3417990.3421263)" Proceedings of the 23rd ACM/IEEE International Conference on Model Driven Engineering Languages and Systems: Companion Proceedings. 2020.


## Licensing
The source code in this repository is licensed under the [GNU General Public License v3.0](https://github.com/TUBS-ISF/BCS-Case-Study/blob/master/LICENSE). The data files contained in this repository are licensed under the [CC-BY-4.0](https://github.com/TUBS-ISF/busybox-data/edit/master/cc-by-4.0.md). You are free to use, share, and adapt the data and source code in this repository as long as you give appropriate credit to the data owner.

## Note
This repository is under constant development and changes frequently. If you encounter any challenges using the content or identify missing or broken content, please reach out to us via e-mail at [t.pett@tu-braunschweig.de].
