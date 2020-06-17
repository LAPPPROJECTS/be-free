package com.LAMPP.befree.repository;

import com.LAMPP.befree.model.Profile;

import java.util.List;
import java.util.UUID;

public interface InterfaceRepositoryProfile {

   public UUID insertProfile();

    public List<Profile> getAll();

    public Profile getById(UUID IdProfile);

    public void addProfile(Profile profile);

}
