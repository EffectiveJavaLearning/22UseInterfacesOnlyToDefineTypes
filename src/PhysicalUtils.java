import constantinterface.PhysicalConstantsTest;

/**
 * 注意，在其他地方大量使用该类中某一或某一些变量时，考虑静态导入：
 *      import static PhysicalUtils.AVOGADRO_NUMBER;
 *
 * @author LightDance
 */
public class PhysicalUtils {

    private PhysicalUtils(){}

    /**Avogadro's number (1/mol)*/
    static final double AVOGADRO_NUMBER = 6.022_140_857e23;

    /**Boltzmann constant (J/K)*/
    static final double BOLTZMANN_CONSTANT = 1.380_648_52e-23;

    /**Mass of the electron (kg)*/
    static final double ELECTRON_MASS = 9.109_383_56e-31;
}
