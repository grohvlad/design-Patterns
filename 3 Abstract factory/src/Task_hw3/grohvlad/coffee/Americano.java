package Task_hw3.grohvlad.coffee;
public abstract class Americano implements Coffee {
    protected String name = "Americano";
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
