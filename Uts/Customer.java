package Uts;
public class Customer extends User{
    private boolean verificationStatus = false;

    public Customer(int userId, String password, String name, int age, String emailId, String doc){
        super(userId, password, name, age, emailId, doc);
    }

    public boolean getVerificationStatus(){
        return verificationStatus;
    }

    public void applyVerification(String doc){
        System.out.println(getProfile().getName() + " mengajukan verifikasi dengan dokumen " + doc);
    }
}
