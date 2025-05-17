package bo.edu.uagrm.soe.Model;

import bo.edu.uagrm.soe.iface.impl.FlyNoWay;
import bo.edu.uagrm.soe.iface.impl.Squeak;

public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("Soy un pato de goma");
    }

}
