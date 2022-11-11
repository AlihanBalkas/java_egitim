public class Main {
    public static void main(String[] args) {

        employeeDetails employeeDetails = new employeeDetails();
        tax tax1 = new tax();


        employeeDetails.setName("Alihan");
        employeeDetails.setSalary(100);


        System.out.println(employeeDetails.getName());
        System.out.println(employeeDetails.getSalary());



    }
}