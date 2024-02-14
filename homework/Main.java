package homework;

import homework.persister.Persister;
import homework.persister.impl.DataPersister;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        Persister persister = new DataPersister();
        UserRepository userRepository = new UserRepository(persister);
        UserReporter userReporter = new UserReporter();

        userReporter.report(user);
        userRepository.saveUser(user);
    }
}