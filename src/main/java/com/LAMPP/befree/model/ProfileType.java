package com.LAMPP.befree.model;

import lombok.Getter;

@Getter
public enum ProfileType {
    ADMIN("admin"), USER("user");
    private final String description;

    ProfileType(String description) {
    this.description= description;
    }
}
