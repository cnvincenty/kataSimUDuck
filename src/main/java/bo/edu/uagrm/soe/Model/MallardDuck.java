package bo.edu.uagrm.soe.Model;

import bo.edu.uagrm.soe.iface.impl.FlyWithWings;
import bo.edu.uagrm.soe.iface.impl.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Soy un pato de collar");
    }

}
