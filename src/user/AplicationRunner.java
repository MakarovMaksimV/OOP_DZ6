package user;

import user.util.UserReporter;
import user.util.UserSaver;

public class AplicationRunner {
    public void run() {
        User user = new User("Bob");

        UserReporter userReport = new UserReporter();
        userReport.report(user.getName());

        UserSaver userSaver = new UserSaver();
        userSaver.save(user);
    }

}
