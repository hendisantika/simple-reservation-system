package com.hendisantika.config;

import com.hendisantika.model.AmenityType;
import com.hendisantika.model.Capacity;
import com.hendisantika.model.User;
import com.hendisantika.repository.CapacityRepository;
import com.hendisantika.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : simple-reservation-system
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/03/22
 * Time: 09.21
 * To change this template use File | Settings | File Templates.
 */
public class InitData implements CommandLineRunner {
    private final Map<AmenityType, Integer> initialCapacities =
            new HashMap<>() {
                {
                    put(AmenityType.GYM, 20);
                    put(AmenityType.POOL, 4);
                    put(AmenityType.SAUNA, 1);
                }
            };


    @Bean
    public CommandLineRunner loadData(
            UserRepository userRepository,
            CapacityRepository capacityRepository) {
        return (args) -> {
            userRepository.save(
                    new User("Uzumaki Naruto", "naruto", bCryptPasswordEncoder().encode("12345")));

            for (AmenityType amenityType : initialCapacities.keySet()) {
                capacityRepository.save(new Capacity(amenityType, initialCapacities.get(amenityType)));
            }
        };
    }
}
