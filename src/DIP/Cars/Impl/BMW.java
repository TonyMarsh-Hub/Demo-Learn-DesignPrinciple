package DIP.Cars.Impl;

import DIP.Cars.ICar;

/**
 * 宝马车
 */
public class BMW implements ICar {
    @Override
    public void run(){
        System.out.println("宝马车飞驰------------");
    }
}
