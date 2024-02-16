package com.example.repofetcher.DTO;

public class RepoDTO {
    private String ownerLogin;
    private String repoName;
    private String branchName;
    private String lastCommitSha;

    public RepoDTO(String ownerLogin, String repoName, String branchName, String lastCommitSha) {
        this.ownerLogin = ownerLogin;
        this.repoName = repoName;
        this.branchName = branchName;
        this.lastCommitSha = lastCommitSha;
    }

    @Override
    public String toString() {
        return "RepositoryInfo{" +
                "ownerLogin='" + ownerLogin + '\'' +
                ", repoName='" + repoName + '\'' +
                ", branchName='" + branchName + '\'' +
                ", lastCommitSha='" + lastCommitSha + '\'' +
                '}';
    }
}
