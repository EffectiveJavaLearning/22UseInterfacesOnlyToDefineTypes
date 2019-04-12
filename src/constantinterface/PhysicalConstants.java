package constantinterface;

/**
 * 一个常量接口的例子，里面只有各种常量，但是有很多缺陷，是接口的不良使用。
 * 注意，常量中可以用下划线隔开，不影响数值但方便阅读
 *
 * @author LightDance
 */
interface PhysicalConstants {
    /**Avogadro's number (1/mol)*/
    double AVOGADRO_NUMBER = 6.022_140_857e23;

    /**Boltzmann constant (J/K)*/
    double BOLTZMANN_CONSTANT = 1.380_648_52e-23;

    /**Mass of the electron (kg)*/
    double ELECTRON_MASS = 9.109_383_56e-31;

}
