import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Maria", 2100, 1, "2022-11-11", "Junior Developer");
        Worker worker2 = new Worker("Sofia", 2800, 2, "2022-03-15", "Senior Developer");
        Worker worker3 = new Worker("Ewa", 2500, 3, "2021-11-11", "Tester");
        Worker worker4 = new Worker("Romek", 2300, 4, "2021-06-20", "Project Manager");
        Worker worker5 = new Worker("Tomek", 2200, 3, "2024-06-21", "Project Manager");
        Manager manager1 = new Manager("Pawel", 6100, 5, "2018-05-14", "Department Head");
        Manager manager2 = new Manager("Alicja", 4700, 1, "2019-02-11", "CTO");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;


        Map<Integer, List<Employee>> idMap = new HashMap<>();
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }

            if (idMap.containsKey(emp.getId())) {
                idMap.get(emp.getId()).add(emp);
            } else {
                List<Employee> empList = new ArrayList<>();
                empList.add(emp);
                idMap.put(emp.getId(), empList);
            }
        }


        System.out.println("Total salary: " + totalSalary);
        System.out.println("Total manager salary: " + totalManagerSalary);
        System.out.println("Total worker salary: " + totalWorkerSalary);

        for (Map.Entry<Integer, List<Employee>> entry : idMap.entrySet()) {
            List<Employee> empList = entry.getValue();
            if (empList.size() > 1) {
                System.out.println("Employees with the same ID: ");
                for (Employee emp : empList) {
                    System.out.println("- " + emp.getName());
                }
            }
        }
    }
}