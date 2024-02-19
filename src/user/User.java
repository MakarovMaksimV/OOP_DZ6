package user;

public class User{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

//    public void save(){
//        user.Persister persister = new user.Persister(this);
//        persister.save();
//    }

//    public void report(){
//        System.out.println("Report for user: " + name);
//    }
}
