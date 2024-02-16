package com.example.repofetcher.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.example.repofetcher.DTO.RepoDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class GithubService {
    private final RestTemplate template;

    public GithubService(RestTemplate template) {
        this.template = template;
    }
    
    public ResponseEntity<Object> listUserRepos(String username) {
        ObjectMapper mapper = new ObjectMapper();
        ResponseParser parser = new ResponseParser();
        String url = "https://api.github.com/users/" + username + "/repos";

        try {
            ResponseEntity<Object> response = template.getForEntity(url, Object.class); 
            //List<RepoDTO> repos = parser.parseResponse(response.getBody().toString());

            //return ResponseEntity.status(HttpStatus.OK).body(repos);   
            return response;         
        } catch (HttpClientErrorException.NotFound e) {
            return ResponseEntity.status(404).body("User " + username + " was not found on Gihub. Please check if provided username is correct and try again.");
        }

    }
}
