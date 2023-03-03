package Task_hw3.grohvlad.coffee;
public abstract class Cappuccino implements Coffee {
    protected String name = "Cappuccino";
    protected int selfCost = 15;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSelfCost() {
        return selfCost;
    }
}
