package Task_hw3.grohvlad.coffee;

public abstract class Espresso implements Coffee {
    protected String name = "Espresso";
    protected int selfCost = 5;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSelfCost() {
        return selfCost;
    }
}
