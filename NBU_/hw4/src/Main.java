import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

enum ContractType {
    PERMANENT, PART_TIME, TRAINEE
}

class Employee {
    String name;
    String id;
    int hoursWorked;
    ContractType contractType;
    BigDecimal baseSalary;
    BigDecimal additionalSalary;

    public Employee(String name, String id, int hoursWorked, ContractType contractType, BigDecimal baseSalary) {
        this.name = name;
        this.id = id;
        this.hoursWorked = hoursWorked;
        this.contractType = contractType;
        this.baseSalary = baseSalary;
        this.additionalSalary = BigDecimal.ZERO;
    }

    public BigDecimal salary() {
        return baseSalary.add(additionalSalary).multiply(BigDecimal.valueOf(hoursWorked));
    }

    public void increaseSalary(BigDecimal percentage) {
        additionalSalary = additionalSalary.add(baseSalary.multiply(percentage.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP)));
    }
}

class Company {
    String name;
    int maxEmployees;
    List<Employee> employees;

    public Company(String name, int maxEmployees) {
        this.name = name;
        this.maxEmployees = maxEmployees;
        this.employees = new ArrayList<>();
    }

    public void hireEmployee(Employee employee) {
        if (employees.size() < maxEmployees && !employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public void fireEmployee(Employee employee) {
        employees.remove(employee);
    }

    public BigDecimal averageSalary() {
        BigDecimal totalSalary = BigDecimal.ZERO;
        for (Employee employee : employees) {
            totalSalary = totalSalary.add(employee.salary());
        }
        return totalSalary.divide(BigDecimal.valueOf(employees.size()), 2, RoundingMode.HALF_UP);
    }

    public void increaseSalaries(BigDecimal percentage) {
        for (Employee employee : employees) {
            employee.increaseSalary(percentage);
        }
    }

    public BigDecimal averageSalaryPerContractType(ContractType contractType) {
        BigDecimal totalSalary = BigDecimal.ZERO;
        int count = 0;
        for (Employee employee : employees) {
            if (employee.contractType == contractType) {
                totalSalary = totalSalary.add(employee.salary());
                count++;
            }
        }
        return totalSalary.divide(BigDecimal.valueOf(count), 2, RoundingMode.HALF_UP);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create employees
        Employee employee1 = new Employee("John", "1", 40, ContractType.PERMANENT, BigDecimal.valueOf(20.0));
        Employee employee2 = new Employee("Jane", "2", 30, ContractType.PART_TIME, BigDecimal.valueOf(15.0));
        Employee employee3 = new Employee("Doe", "3", 20, ContractType.TRAINEE, BigDecimal.valueOf(10.0));

        // Create a company
        Company company = new Company("TechComp", 5);

        // Hire employees
        company.hireEmployee(employee1);
        company.hireEmployee(employee2);
        company.hireEmployee(employee3);

        // Print average salary
        System.out.println("Average salary: " + company.averageSalary());

        // Increase salaries
        company.increaseSalaries(BigDecimal.valueOf(10)); // Increase salaries by 10%

        // Print average salary after increase
        System.out.println("Average salary after increase: " + company.averageSalary());

        // Print average salary per contract type
        System.out.println("Average salary for permanent employees: " + company.averageSalaryPerContractType(ContractType.PERMANENT));
        System.out.println("Average salary for part-time employees: " + company.averageSalaryPerContractType(ContractType.PART_TIME));
        System.out.println("Average salary for trainee employees: " + company.averageSalaryPerContractType(ContractType.TRAINEE));

        // Fire an employee
        company.fireEmployee(employee1);

        // Print average salary after firing an employee
        System.out.println("Average salary after firing an employee: " + company.averageSalary());
    }
}