package com.greglturnquist.learningspringboot.chat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@Configuration
public class InitUsers {

    @Bean
    CommandLineRunner initializeUsers(MongoOperations operations) {
        return args -> {
            operations.dropCollection(User.class);

            operations.insert(
                    new User(
                            null,
                            "greg", "turnquist",
                            new String[]{"ROLE_USER", "ROLE_ADMIN"}));
            operations.insert(
                    new User(
                            null,
                            "phil", "webb",
                            new String[]{"ROLE_USER"}));

            operations.findAll(User.class).forEach(user -> {
                System.out.println("Loaded " + user);
            });
        };
    }
}
// end::code[]