package user.util;

public class UserReporter implements Reportable {
    public void report(String name){
        System.out.println("Report for user: " + name);
    }

}
