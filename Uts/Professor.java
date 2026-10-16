package Uts;
public class Professor extends Person{
    private int salary;

    public Professor(String name, String phoneNumber, String email, int salary){
        super(name, phoneNumber, email);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override 
    public void purchaseParkingPass(){
        System.out.println("Professor : "+getName()+" membeli parking pass");
    }
}
