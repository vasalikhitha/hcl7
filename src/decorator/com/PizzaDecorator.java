package decorator.com;

public class PizzaDecorator implements Pizza{
	
	
	private Pizza pizza;

	public PizzaDecorator(Pizza pizza) {
		this.pizza=pizza;
	}
	public String makePizza() {
		return pizza.makePizza();
	}
	

}
