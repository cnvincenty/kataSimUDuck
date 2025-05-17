package bo.edu.uagrm.soe.iface.impl;

import bo.edu.uagrm.soe.iface.QuackBehavior;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Chirrido");
    }

}
