package homework.util;

import homework.User;
import homework.UserReporter;
import homework.UserRepository;
import homework.persister.Persister;
import homework.persister.impl.DataPersister;

public class AppRunner {
    private AppRunner() {
        User user = new User("Bob");
        Persister persister = new DataPersister();
        UserRepository userRepository = new UserRepository(persister);
        UserReporter userReporter = new UserReporter();

        userReporter.report(user);
        userRepository.saveUser(user);
    }

    public static void run() {
        new AppRunner();
    }
}