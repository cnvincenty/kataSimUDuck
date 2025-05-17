package bo.edu.uagrm.soe.Model;

import bo.edu.uagrm.soe.iface.impl.FlyWithWings;
import bo.edu.uagrm.soe.iface.impl.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Soy un pato cabeza roja");
    }

}
