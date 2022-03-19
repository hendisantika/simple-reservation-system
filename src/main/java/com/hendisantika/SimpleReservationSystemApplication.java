package com.hendisantika;

import com.hendisantika.model.AmenityType;
import com.hendisantika.model.Capacity;
import com.hendisantika.model.User;
import com.hendisantika.repository.CapacityRepository;
import com.hendisantika.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SimpleReservationSystemApplication {
    private final Map<AmenityType, Integer> initialCapacities =
            new HashMap<>() {
                {
                    put(AmenityType.GYM, 20);
                    put(AmenityType.POOL, 4);
                    put(AmenityType.SAUNA, 1);
                }
            };

    public static void main(String[] args) {
        SpringApplication.run(SimpleReservationSystemApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(
            UserRepository userRepository,
            CapacityRepository capacityRepository) {
        return (args) -> {
            userRepository.save(
                    new User("Uzumaki Naruto", "naruto", bCryptPasswordEncoder().encode("naruto2022")));

            for (AmenityType amenityType : initialCapacities.keySet()) {
                capacityRepository.save(new Capacity(amenityType, initialCapacities.get(amenityType)));
            }
        };
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
