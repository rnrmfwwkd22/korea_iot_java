package org.example.chapter07;

class EmployeeClass {
    final String employeeId;
    private String name;
    private String position;
    private int salary;

    EmployeeClass(String employeeId, String name, String position, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("급여를 " + salary + "으로 변경 시도 합니다.");
        }
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
       this.name = name;
        System.out.println("이름을 '" + name + "' 으로 변경합니다.");

    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    void displayInfo() {
        System.out.println("사원 ID: " + employeeId + ", 이름: " + name + ", 직급: " + position + ", 급여: " + salary);
    }
}

class Manager extends EmployeeClass {

    int teamSize;


    Manager(String employeeId, String name, String position,  int salary,int teamSize) {
        super(employeeId, name, position, salary);
        this.teamSize = teamSize;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("팀 크기: " + teamSize);
    }
}

public class A__Employee {
    public static void main(String[] args) {


        EmployeeClass employeeClass1 = new EmployeeClass("E001", "조성성", "대리", 350000);

        employeeClass1.displayInfo();
        employeeClass1.setName("조승버미");
        employeeClass1.setSalary(-500000);
        employeeClass1.displayInfo();

        Manager manager = new Manager("E001", "조성성", "대리", 350000, 3);
        manager.displayInfo();
    }
}
