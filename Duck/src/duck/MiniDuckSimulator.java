package duck;

public class MiniDuckSimulator{
public static void main(String[] args){
	System.out.print("1111");
Duck mallard = new MallarDuck();
mallard.performQuack();
mallard.performFly();
Duck model = new ModelDuck();
model.performFly();
model.setFlyBehavior(new FlyRocketPowered());
model.performFly();
}
}
