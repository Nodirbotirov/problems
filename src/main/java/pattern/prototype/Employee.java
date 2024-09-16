package pattern.prototype;

public class Employee implements Prototype{

    public int id;
    public String name;
    public int salary;
    private JobTittle jobTittle;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        this.salary = salary;
    }

    public JobTittle getJobTittle() {
        return jobTittle;
    }

    public void setJobTittle(JobTittle jobTittle) {
        this.jobTittle = jobTittle;
    }

    @Override
    public Prototype getPrototype() {
        Employee employee = new Employee();
        employee.setId(this.id +1);
        employee.setName(this.name);
        employee.setSalary(this.salary);
        employee.setJobTittle(this.jobTittle);
        return employee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", jobTittle=" + jobTittle +
                '}';
    }
}
