public class Salesperson extends Worker {

    private final IWorker manager;
    public Salesperson(String name, int salary, IWorker manager) {
        super(name, salary);
        if(manager instanceof Manager || manager instanceof Boss){
            this.manager = manager;
        } else {
            this.manager = null;
            System.out.println("You try to make thee manager from another worker");
        }
    }

    public IWorker getManager() {
        return manager;
    }
}