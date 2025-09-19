package main;

public class PizzaFactory {
    public Pizza createPizza(PizzaType type) {
        if (type == null) {
            throw new IllegalArgumentException("Pizza type cannot be null");
        }
        switch (type) {
            case CHEESE:
                return new CheesePizza();
            case GREEK:
                return new GreekPizza();
            case PEPPERONI:
                return new PepperoniPizza();
            case GLUTEN_FREE:
                return new GlutenFreePizza();
            default:
                throw new IllegalArgumentException("Invalid pizza type: " + type);
        }
    }
}