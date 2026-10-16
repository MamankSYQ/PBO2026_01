package Uts;
public class PersonMain {
    public static void main(String[] args) {
        Address alamat = new Address("Jl. Veteran No. 10", "Malang", "Jawa Timur", "65145", "Indonesia");
        alamat.validate();
        alamat.outputAsLabel();

        System.out.println();

        Student mhs = new Student("Budi", "081234567890", "budi@mail.com", "230001", 85.5);
        mhs.setAddress(alamat);
        System.out.println("Nama: " + mhs.getName());
        System.out.println("Email: " + mhs.getEmailAddress());
        System.out.println("NIM: " + mhs.getStudentNumber());
        System.out.println("Rata-rata: " + mhs.getAverageMark());
        mhs.isEligibleToEnroll();
        mhs.getSeminarsTaken();
        mhs.purchaseParkingPass();
        System.out.println("Kota: " + mhs.getAddress().getCity());

        System.out.println();

        Professor dosen = new Professor("Dr. Siti", "081298765432", "siti@mail.com", 5000000);
        dosen.setAddress(alamat);
        System.out.println("Nama: " + dosen.getName());
        System.out.println("Gaji: " + dosen.getSalary());
        dosen.purchaseParkingPass();

        System.out.println();

        Person p1 = new Student("Ani", "081111111111", "ani@mail.com", "230002", 70);
        Person p2 = new Professor("Dr. Joko", "082222222222", "joko@mail.com", 6000000);
        p1.purchaseParkingPass();
        p2.purchaseParkingPass();
    }
}
