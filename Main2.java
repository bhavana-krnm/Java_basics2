class UserRegistration{
    void register(String name,int userId){
        System.out.println("Registered User:"+name+" with ID:"+userId);
    }
    void register(int userId, String name){
        System.out.println("Registered ID: " + userId + " for user: " + name);
    }
}
class Main2 {
    public static void main(String[] args) {
        UserRegistration u=new UserRegistration();
        u.register("Bhavana",45);
        u.register(45, "Bhavana");
    }
}
