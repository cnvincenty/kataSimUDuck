package bo.edu.uagrm.soe.Model;

import bo.edu.uagrm.soe.iface.impl.FlyNoWay;
import bo.edu.uagrm.soe.iface.impl.MuteQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Soy un pato senuelo");
    }

}
