package com.example.repofetcher.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repofetcher.service.GithubService;

@RestController
@RequestMapping("/api/github")
public class GithubController {
    private final GithubService service;

    public GithubController(GithubService service) {
        this.service = service;
    }

    @GetMapping("/repos/{username}")
    public ResponseEntity<Object> listRepos(@PathVariable String username) {
        return service.listUserRepos(username);
    }
}
