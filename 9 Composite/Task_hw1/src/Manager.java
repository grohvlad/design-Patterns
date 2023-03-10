public class Manager extends Worker{

    private final IWorker boss;
    public Manager(String name, int salary, IWorker boss) {
        super(name, salary);

        if(boss instanceof Boss || boss instanceof Manager){
            this.boss = boss;
        } else {
            this.boss = null;
            System.out.println("You try to make a boss from bed candidate");
        }
    }
}