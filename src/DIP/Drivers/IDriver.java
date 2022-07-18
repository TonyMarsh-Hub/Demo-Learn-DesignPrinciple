package DIP.Drivers;

import DIP.Cars.ICar;

/**
 * 司机接口
 */
public interface IDriver {
    //司机驾驶汽车：通过传入ICar接口实现抽象之间的依赖关系
    void drive(ICar car);
}
