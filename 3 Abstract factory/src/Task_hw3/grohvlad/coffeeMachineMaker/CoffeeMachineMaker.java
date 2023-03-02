package Task_hw3.grohvlad.coffeeMachineMaker;


import Task_hw3.grohvlad.coffee.Coffee;

public abstract class CoffeeMachineMaker {
    protected int cost;
    protected int servCost;
    protected int satisfactionCoef;

    public int getCost() {
        return this.cost;
    }

    public int getServCost() {
        return this.servCost;
    }

    public int getSatisfactionCoef() {
        return this.satisfactionCoef;
    }

    public CoffeeMachineMaker(int cost, int servCost, int satisfactionCoef) {
        this.cost = cost;
        this.servCost = servCost;
        this.satisfactionCoef = satisfactionCoef;
    }

    abstract Coffee makeAmericano();
    abstract Coffee makeCappuccino();
    abstract Coffee makeEspresso();
    abstract Coffee makeLatte();
}
