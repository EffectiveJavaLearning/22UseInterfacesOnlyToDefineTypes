
/**
 * 接口应当只能用于定义类型(type)。
 *
 * 当类implements 某个接口时，同时该接口也指定了这个类的实例的类型(type)。
 * 因此，实现类的接口应当说明客户端可以对这个实例做些什么。为了任何其他的目的而定义接口都是不正确的。
 *
 * 有一种接口叫“常量接口”(constant interface)，它不包含任何方法，只有public static final型的常量，
 * 而想要使用它们的类就可以实现这个接口，以此方式避免“路径名.类名.常量”的冗长使用方式，
 * 例如PhysicalConstants的测试类{@link constantinterface.PhysicalConstantsTest}
 *
 * 这种常量接口是对接口的不良使用。
 *      1.类在其内部使用某些常量，这纯粹是该类的细节实现，但常量接口却将它们暴露到了公开的API之中。
 *      并且，类实现什么常量接口跟这个类的使用者本来没什么关系，实际上却令他们十分困惑。
 *      2.如果在今后的版本中，这个类不再需要使用这些常量了，但由于需要保证二进制兼容性，
 *      它依然得implements这个接口。
 *      3.对于非final型的类来说，如果继承了这个常量接口，那么其子类也会受到接口中常量的影响。
 *
 * Java类库中仍然存在常量接口的使用，比如{@link java.io.ObjectStreamConstants}。
 * 但这些应当作为反例，不值得我们去效仿。
 *
 * 如果想要导出常量，“正常的”方式如下：
 *  1.当常量与类或接口关系十分紧密时，把常量添加到其中，如{@link Integer#MAX_VALUE}等
 *  2.如果把常量视为枚举类型之一较好，则应放到枚举类里面
 *  3.前面都不满足，考虑放到静态工具类里面(见item4)，而不是接口{@link PhysicalUtils}
 *
 * 总之，接口时定义类型的，不该放常量
 *
 * @author LightDance
 */
public class InterfacesOnlyDefineTypes {
}
