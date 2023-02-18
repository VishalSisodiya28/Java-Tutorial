class Employee {

    int id;
    String firstName;
    String lastName;
    int salary;

    Employee(int id, String firstName, String lastName, int salary) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }

    int getId() {
        return id;
    }

    String getFirstName() {

        return firstName;
    }

    String getLastName() {

        return lastName;
    }

    String getName() {

        return (firstName + " " + lastName);
    }

    int getSalary() {

        return salary;
    }

    void setSalary(int salary) {

        this.salary = salary;
    }

    int getAnnualSalary() {

        return (12 * salary);
    }

    int raiseSalary(int percent) {

        salary = (salary + (salary * percent / 100));
        return salary;
    }

}

class Exercise {
    public static void main(String[] args) {

        Employee obj = new Employee(28, "Vishal", "Sisodiya", 5000000);

        System.out.println("First Name : " + obj.getFirstName());
        System.out.println("Last Name : " + obj.getLastName());
        System.out.println("Full Name : " + obj.getName());
        System.out.println("Employee id : " + obj.getId());
        System.out.println("Monthly Salary : " + obj.getSalary());
        System.out.println("Annual Salary : " + obj.getAnnualSalary());
        obj.setSalary(10000000);
        System.out.println("Monthly Salary : " + obj.getSalary());
        System.out.println("Annual Salary : " + obj.getAnnualSalary());
        System.out.println("Raised Monthly Salary : " + obj.raiseSalary(10));
        System.out.println("Raised Annual Salary : " + obj.getAnnualSalary());

    }

}
