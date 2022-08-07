package dev.credit.creditsystem.util;


import dev.credit.creditsystem.model.User;
import dev.credit.creditsystem.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class initializerRunner {
    private static final Logger logger = LoggerFactory.getLogger(initializerRunner.class);
    private final UserRepository userRepository;

    public initializerRunner(UserRepository userRepository) {
        this.userRepository = userRepository;
    }




    public void run(String... args) throws Exception {
        if(userRepository.findAll().isEmpty()) {
            userRepository.save(User.builder().fullName("muhammed").identityNumber(99854771212L).phoneNumber(5844851214L).salary(7800).build());
            userRepository.save(User.builder().fullName("Emir").identityNumber(99889121514L).phoneNumber(6596587874L).salary(4860).build());
            userRepository.save(User.builder().fullName("Zeynep").identityNumber(88928978412L).phoneNumber(9214544847L).salary(5902).build());
            userRepository.save(User.builder().fullName("Yaren").identityNumber(15465121126L).phoneNumber(7587545412L).salary(3600).build());
            userRepository.findAll().forEach(user -> logger.info("{}", user));
        }

    }
}
