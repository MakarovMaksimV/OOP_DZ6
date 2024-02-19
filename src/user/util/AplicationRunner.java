package user.util;

import user.Persister;
import user.User;
import user.util.Reportable;
import user.util.Saveble;
import user.util.UserReporter;

public class AplicationRunner {
    public void run() {
        User user = new User("Bob");

        Reportable userReport = new UserReporter();
        userReport.report(user.getName());

        Saveble persister = new Persister(user);
        persister.save();
    }

}
