package InnerClass;

public class App {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Apple");

        System.out.println("Company: " + company.getName());
        Company.Employee employee = company.new Employee();
        employee.setName("Steve Jobs");
        System.out.println("Employee: " + employee.getName());

        // System.out.println("Employee: " + employee.getName());
        // employee.showCompany();
    }
}
