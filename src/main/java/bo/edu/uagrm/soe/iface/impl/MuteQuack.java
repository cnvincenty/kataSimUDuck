package bo.edu.uagrm.soe.iface.impl;

import bo.edu.uagrm.soe.iface.QuackBehavior;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Silencio");
    }

}
