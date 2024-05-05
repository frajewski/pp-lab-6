import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Maria", 2500, 1, "2022-10-04", "Junior Developer");
        Worker worker2 = new Worker("Sofia", 2200, 2, "2023-01-11", "Senior Developer");
        Worker worker3 = new Worker("Natalia", 2400, 1, "2021-05-11", "Tester");
        Manager manager = new Manager("Ewa", 6100, 3, "2022-07-12", "Department Head");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println(worker3.getName() + " equals worker1: " + worker3.equals(worker1));
        System.out.println(worker3.getName() + " equals worker2: " + worker3.equals(worker2));
        System.out.println(worker3.getName() + " equals manager: " + worker3.equals(manager));
    }
}