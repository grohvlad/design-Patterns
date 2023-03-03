package Task_hw3.grohvlad.coffee;

public abstract class Latte implements Coffee {
    protected  String name = "Latte";
    protected int selfCost = 12;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSelfCost() {
        return selfCost;
    }
}
