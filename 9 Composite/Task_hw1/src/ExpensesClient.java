public class ExpensesClient {

    public static void main(String[] args) {

        Team teamTree = new Team("Head's team");
        IWorker boss = new Boss("Jane (boss)", 1000);
        teamTree.addWorker(boss);

        Team milkTeam = new Team("Milk team");
        IWorker managerMilk = new Manager("Bob (milk manager) ", 400, boss);
        IWorker SFSCMilk = new Salesperson("John (SFSCMilk)", 350, boss); //SalesmenForSpecialClientsMilk
        IWorker salesmenMilk1 = new Salesperson("Pall (sMilk)", 150, managerMilk);
        IWorker salesmenMilk2 = new Salesperson("Pete (sMilk)", 150, managerMilk);
        IWorker salesmenMilk3 = new Salesperson("Podrick (sMilk)", 150, managerMilk);
        milkTeam.addWorker(SFSCMilk);
        milkTeam.addWorker(SFSCMilk);
        milkTeam.addWorker(salesmenMilk1);
        milkTeam.addWorker(salesmenMilk2);
        milkTeam.addWorker(salesmenMilk3);

        teamTree.addWorker(milkTeam);

        Team meatTeam = new Team("Meat team");
        IWorker managerMeat = new Manager("Jack (meat manager) ", 450, boss);
        IWorker SFSCMeat = new Salesperson("John (SFSCMeat)", 400, boss); //SalesmenForSpecialClientsMeat
        IWorker salesmenMeat1 = new Salesperson("Pall (sMeat)", 200, managerMeat);
        IWorker salesmenMeat2 = new Salesperson("Pete (sMeat)", 200, managerMeat);
        IWorker salesmenMeat3 = new Salesperson("Podrick (sMeat)", 200, managerMeat);
        meatTeam.addWorker(managerMeat);
        meatTeam.addWorker(SFSCMeat);
        meatTeam.addWorker(salesmenMeat1);
        meatTeam.addWorker(salesmenMeat2);
        meatTeam.addWorker(salesmenMeat3);

        teamTree.addWorker(meatTeam);

        Team sweetsTeam = new Team("Sweets team");
        IWorker managerSweets = new Manager("Jack (sweets manager) ", 250, boss);
        IWorker SFSCSweets = new Salesperson("John (SFSCSweets)", 200, boss); //SalesmenForSpecialClientsSweets
        IWorker salesmenSweets1 = new Salesperson("Pall (sSweets)", 100, managerSweets);
        IWorker salesmenSweets2 = new Salesperson("Pete (sSweets)", 100, managerSweets);
        IWorker salesmenSweets3 = new Salesperson("Podrick (sSweets)", 100, managerSweets);
        sweetsTeam.addWorker(managerSweets);
        sweetsTeam.addWorker(SFSCSweets);
        sweetsTeam.addWorker(salesmenSweets1);
        sweetsTeam.addWorker(salesmenSweets2);
        sweetsTeam.addWorker(salesmenSweets3);

        teamTree.addWorker(sweetsTeam);

        ExpensesClient.payToWorkers(teamTree);
    }

    private static void payToWorkers(IWorker worker) {
        System.out.println("Expenses have been requested");
        worker.payExpenses();
        System.out.println("Expenses have been paid");
    }
}