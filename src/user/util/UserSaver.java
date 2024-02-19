package user.util;

import user.Persister;
import user.User;

public class UserSaver  {

    Persister persister = new Persister();
    persister.save();
//    public void save(User user){
//        Persister persister = new Persister(user);
//
//        System.out.println("Save user: " + user.getName());
//    }

//    @Override
//    public void save() {
//        System.out.println("Save user: " + new User(user).getName());
//
//    }
}
