package duck;

public class Duck{
	QuackBehavior quackBehavior;//ÿֻѼ�Ӷ�������ʵ��QuackBehavior�ӿڵĶ���
	FlyBehavior flyBehavior;
	public void performQuack(){
		quackBehavior.quack();//Ѽ�Ӷ������Դ������ɽ���Ϊ������ί�и�quackBehavior���õĶ���
	}
	public void performFly(){
		flyBehavior.fly();//Ѽ�Ӷ������Դ������ɽ���Ϊ������ί�и�quackBehavior���õĶ���
	}
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
		} 
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
		} 

}
