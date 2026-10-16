package Uts;
public class Student extends Person {
    private String studentNumber;
    private double averageMark;

    public Student(String name, String phoneNumber, String email, String studentNumber, double averageMark){
        super(name, phoneNumber, email);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void isEligibleToEnroll(){
        if(averageMark > 80){
            System.out.println("Mahasiswa bisa mengambil mata kuliah");
        }
        else{
            System.out.println("Mahasiswa belum bisa mengambil mata kuliah");
        }
    }

    public void getSeminarsTaken(){
        System.out.println("Mahasiswa dengan NIM "+getStudentNumber()+" pernah mengikuti seminar");
    }

    @Override
    public void purchaseParkingPass(){
        System.out.println("Mahasiswa : "+getName()+" membeli parking pass");
    }
}
