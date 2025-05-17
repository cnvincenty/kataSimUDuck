package bo.edu.uagrm.soe;

import bo.edu.uagrm.soe.Model.DecoyDuck;
import bo.edu.uagrm.soe.Model.Duck;
import bo.edu.uagrm.soe.Model.MallardDuck;
import bo.edu.uagrm.soe.Model.RedheadDuck;
import bo.edu.uagrm.soe.Model.RubberDuck;
import bo.edu.uagrm.soe.iface.impl.FlyNoWay;

public class SimUDuckApp {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("---");

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();

        System.out.println("---");

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performFly();
        decoy.performQuack();

        System.out.println("---");

        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.performFly();
        redhead.performQuack();

        System.out.println("---");

        System.out.println("Cambiando el comportamiento en tiempo de ejecucion");
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }
}