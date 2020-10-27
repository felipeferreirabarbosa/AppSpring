package io.github.felipeferreirabarbosa;
import io.github.felipeferreirabarbosa.service.Development;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Development
public class MyConfiguration {
    @Bean
    public CommandLineRunner execute(){
        return args -> {
          System.out.println("Hello Dev!");
        };
    }

}
