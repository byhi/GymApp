package hu.byhi.example.gym.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/info")
public abstract class GymInfoOperations {

    @GetMapping
    public abstract ResponseEntity<String> getInfo();
}
