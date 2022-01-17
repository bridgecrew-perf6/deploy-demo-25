package com.wildlfy.deploy;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/deploy")
public class DeployController {

	@GetMapping
    public ResponseEntity<String> deploy() {
        return ResponseEntity.ok("Application is deployed.");
    }
}
