package com.example.api_rest_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User cadastrarUsuario(String name, String email, String senha, String role) {
        String senhaCriptografada = passwordEncoder.encode(senha);
        User user = new User(name, email, senhaCriptografada, role);
        return userRepository.save(user);
    }

    public User cadastrarUsuario(User user) {
        String senhaCriptografada = passwordEncoder.encode(user.getPassword());
        user.setPassword(senhaCriptografada);
        return userRepository.save(user);
    }
}