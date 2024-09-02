package com.lgcns.mission.management;

public class Department {
    private String id;
    private String name;
    private int maxNum;
    private Employee[] employeeList;

    public Department(String id, String name, int maxNum) {
        this.id = id;
        this.name = name;
        this.maxNum = maxNum;
        this.employeeList = new Employee[maxNum];
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public int getEmployeeCount() {
        int count = 0;
        for (Employee employee : employeeList) {
            if (employee != null) {
                count++;
            }
        }
        return count;
    }

    public void printEmployeeList() {
        System.out.println("Departemen: " + name + ", Jumlah Karyawan: " + getEmployeeCount());
        for (Employee employee : employeeList) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public boolean canAddEmployee() {
        return getEmployeeCount() < maxNum;
    }

    public void deleteEmployee(Employee employee) {
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] != null && employeeList[i].getId().equals(employee.getId())) {
                employeeList[i] = null;
                break;
            }
        }
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] == null) {
                employeeList[i] = employee;
                break;
            }
        }
    }
}
