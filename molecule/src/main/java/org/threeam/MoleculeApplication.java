package org.threeam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class MoleculeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoleculeApplication.class, args);
    }
}
