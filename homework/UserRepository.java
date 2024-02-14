package homework;

import homework.persister.Persister;

public class UserRepository {
    private final Persister persister;

    public UserRepository(Persister persister) {
        this.persister = persister;
    }

    public void saveUser(User user) {
        persister.save(user);
    }
}
