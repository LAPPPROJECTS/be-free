package com.LAMPP.befree.registration.repository;

import com.LAMPP.befree.registration.model.Profile;

import java.util.List;
import java.util.UUID;

public interface InterfaceRepositoryProfile {



    public List<Profile> getAll();

    public Profile getById(UUID IdProfile);

    public Profile getByLogin(String login);

    public void addProfile(Profile profile);;


}
