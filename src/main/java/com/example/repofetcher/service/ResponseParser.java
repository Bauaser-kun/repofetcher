package com.example.repofetcher.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.repofetcher.DTO.RepoDTO;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseParser {
    public List<RepoDTO> parseResponse(String response) {
        List<RepoDTO> repoInfo = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();

        try {
            JsonNode root = mapper.readTree(response);

            for (JsonNode repoNode : root) {
                String owner = repoNode.get("owner").get("login").asText();
                String repoName = repoNode.get("name").asText();

                JsonNode branches = repoNode.get("branches");
                for (JsonNode branch : branches) {
                    String branchName = branch.get("name").asText();
                    String lastSha = branch.get("commit").get("sha").asText();

                    RepoDTO dto = new RepoDTO(owner, repoName, branchName, lastSha);
                    repoInfo.add(dto);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }

        return repoInfo;
    }
}
