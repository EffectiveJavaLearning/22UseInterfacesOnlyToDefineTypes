package constantinterface;

/**
 * 常量接口的测试类
 *
 * @author LightDance
 */
public class PhysicalConstantsTest implements PhysicalConstants {
    public static void main(String[] args) {
        //无需System.out.println(PhysicalConstants.AVOGADRO_NUMBER);，可以直接使用想用的常量
        System.out.println(AVOGADRO_NUMBER);
        System.out.println(BOLTZMANN_CONSTANT);
        System.out.println(ELECTRON_MASS);
    }
}
