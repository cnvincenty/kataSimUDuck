package bo.edu.uagrm.soe.iface.impl;

import bo.edu.uagrm.soe.iface.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Cuac");
    }

}
