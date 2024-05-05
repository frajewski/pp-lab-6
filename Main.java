import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Katarzyna", 1800, 1);
        Worker worker2 = new Worker("Maria", 1500, 2);
        Worker worker3 = new Worker("Piotr", 2600, 3);
        Worker worker4 = new Worker("Pawel", 2200, 4);

        Manager manager = new Manager("Tomek", 6100, 5);

        System.out.println("worker1s salary:" + worker1.getSalary());
        worker1.work();

        System.out.println("worker2s salary:" + worker2.getSalary());
        worker2.work();

        System.out.println("worker3s salary:" + worker3.getSalary());
        worker3.work();

        System.out.println("worker4s salary:" + worker4.getSalary());
        worker4.work();

        System.out.println("managers salary:" + manager.getSalary());
        manager.work();
    }
}