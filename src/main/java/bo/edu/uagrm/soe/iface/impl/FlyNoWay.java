package bo.edu.uagrm.soe.iface.impl;

import bo.edu.uagrm.soe.iface.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Pato no volando");
    }

}
