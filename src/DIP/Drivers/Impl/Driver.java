package DIP.Drivers.Impl;

import DIP.Cars.ICar;
import DIP.Drivers.IDriver;

//司机类实现司机接口
public class Driver implements IDriver {
    @Override
    public void drive(ICar car){
        System.out.println("司机开车：");
        car.run();
    }
}
