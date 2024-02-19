package user;

import user.util.Saveble;

public class Persister implements Saveble {
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    @Override
    public void save() {
        System.out.println("Save user: " + user.getName());
    }
}
