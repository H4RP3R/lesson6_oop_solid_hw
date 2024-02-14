package homework.persister.impl;

import homework.User;
import homework.persister.Persister;

public class DataPersister implements Persister {

    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
