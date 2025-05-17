package bo.edu.uagrm.soe.iface.impl;

import bo.edu.uagrm.soe.iface.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Pato volando");
    }


}