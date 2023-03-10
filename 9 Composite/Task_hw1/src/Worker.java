public abstract class Worker implements IWorker{
    protected String name;
    protected int salary;

    public Worker(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void payExpenses() {
        System.out.println(name + " has been paid $" + salary);
    }
}
