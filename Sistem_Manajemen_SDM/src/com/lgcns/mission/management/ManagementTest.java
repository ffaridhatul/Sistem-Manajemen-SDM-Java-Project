package com.lgcns.mission.management;

public class ManagementTest {
    public static void main(String[] args) {
        String[] nameList = {
            "Skye Heredia", "Lucille Waltz", "Nichol Sutphin", "Vernia Caraway", "Rita Rangel",
            "Waldo Ontiveros", "Milton Grantham", "Loura Swilley", "Lola Duropan", "Kandis Mcnary",
            "Milford Kirts", "Denita Taniguchi", "Talia Fenderson", "Truman Daoust", "Alfonso Chaloux",
            "Fernanda Overby", "Cristy Yearby", "Daniell Pabst", "Bradley Newson", "Renda Maffei"
        };

        Department techTeam = new Department("DEPT01", "Tim Teknis", 100);
        Department hrTeam = new Department("DEPT02", "Tim SDM", 5);
        Department securityTeam = new Department("DEPT03", "Tim Keamanan", 5);

        Employee[] employees = new Employee[nameList.length];

        for (int i = 0; i < nameList.length; i++) {
            String id = "EMP" + String.format("%02d", i + 1);
            employees[i] = new Employee(id, nameList[i]);
            employees[i].setDepartment(techTeam);
        }

        System.out.println("Status Penetapan Awal:");
        techTeam.printEmployeeList();
        hrTeam.printEmployeeList();
        securityTeam.printEmployeeList();

        for (Employee employee : employees) {
            int empId = Integer.parseInt(employee.getId().substring(3));
            if (empId % 2 == 0 && empId % 5 == 0) {
                employee.setDepartment(securityTeam);
            } else if (empId % 2 == 0) {
                employee.setDepartment(hrTeam);
            } else if (empId % 5 == 0) {
                employee.setDepartment(securityTeam);
            }
        }

        System.out.println("\nStatus setelah terjadi transfer:");
        techTeam.printEmployeeList();
        hrTeam.printEmployeeList();
        securityTeam.printEmployeeList();
    }
}
