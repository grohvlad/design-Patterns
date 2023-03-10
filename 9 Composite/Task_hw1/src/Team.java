import java.util.ArrayList;
import java.util.List;

public class Team implements IWorker {

    private final List<IWorker> workers = new ArrayList<>();
    private final String name;
    public Team(String name){
        this.name = name;
    }

    void addWorker(IWorker worker) {
        workers.add(worker);
    }
    @Override
    public void payExpenses() {
        System.out.println("\n" + this.name);
        for (IWorker worker : workers) {
            worker.payExpenses();
        }
    }
}