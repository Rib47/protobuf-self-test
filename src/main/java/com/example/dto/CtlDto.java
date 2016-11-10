package com.example.dto;


import java.util.List;

public class CtlDto {
    private String fqn;
    private String messageDefinition;
    private Integer version;
    private List<DependencyDto> dependencies;

    public String getFqn() {
        return fqn;
    }

    public void setFqn(String fqn) {
        this.fqn = fqn;
    }

    public String getMessageDefinition() {
        return messageDefinition;
    }

    public void setMessageDefinition(String messageDefinition) {
        this.messageDefinition = messageDefinition;
    }

    public List<DependencyDto> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<DependencyDto> dependencies) {
        this.dependencies = dependencies;
    }
}
