package DIP.Cars.Impl;

import DIP.Cars.ICar;

/**
 * 奔驰车
 */
public class Benz implements ICar {
    @Override
    public void  run(){
        System.out.println("奔驰车飞驰-----------------");
    }
}
