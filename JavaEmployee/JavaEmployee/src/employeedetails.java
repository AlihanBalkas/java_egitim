public class employeeDetails {

    // çalışanların özelliklzeri

    private String name;
    public int salary;
    private int workHours;
    private int hireYear;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {


        int tax = 0;

        if ((salary>=0) && (salary<1000)){
            System.out.println("Vergi uygulanamaz");
        } else if (salary>1000) {
            // %3 vergi uygulanacak
            tax = (salary /100 *3);
            salary = salary-tax;
            System.out.println("Vergi uygulandı : "+salary);
        }

        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
