package david.geraldo.application;

import david.geraldo.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("ILCS");

        Company.Employee employee = company.new Employee();
        employee.setName("David");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Belum ada");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("John");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
