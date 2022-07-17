package LSP.Example.Guns.Impl;

import LSP.Example.Guns.AbstractGun;

/**
 * 机枪：威力更大连续发射
 */
public class MachineGun extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("机枪射击------------");
    }
}
