package Uts;
public class User {
    private UserProfile profile;

    public User(int userId, String password, String name, int age, String emailId, String doc){
        this.profile = new UserProfile(userId, password, name, age, emailId, doc);
    }

    public UserProfile getProfile() {
        return profile;
    }

    public boolean logIn(int userId, String password){
        if (profile.getUserId() == userId && profile.getPassword().equals(password)){
            System.out.println(profile.getName() + " berhasil login");
            return true;
        }
        else{
            System.out.println("Login gagal");
            return false;
        }
    }

    public void recoverPassword(){
        System.out.println("Link reset password dikirim ke email " + profile.getEmail());
    }

    public void logOut(){
        System.out.println(profile.getName() + " logout");
    }
}
