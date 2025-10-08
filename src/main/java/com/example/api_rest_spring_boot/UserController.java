package com.example.api_rest_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    /*
    private List<User> users = new ArrayList<>();
    private Long nextId = 1L;
     */
    @Autowired
    private UserRepository repository;
    
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> listUsers() {
        System.out.println("Path /api/users");
        return repository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.cadastrarUsuario(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
