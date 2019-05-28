package com.gpch.login.bootstrap;


import com.gpch.login.model.Role;
import com.gpch.login.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LoginBootstrap implements CommandLineRunner {
    @Autowired
    private RoleRepository roleRepository;


    @Override
    public void run(String... args) throws Exception {
        Role roleAdmin = new Role(new Long(1), "ADMIN");
        Role roleUser = new Role(new Long(2), "USER");

        roleRepository.save(roleAdmin);
        roleRepository.save(roleUser);
    }
}
