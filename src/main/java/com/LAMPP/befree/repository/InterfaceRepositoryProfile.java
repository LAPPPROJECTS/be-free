package com.LAMPP.befree.repository;

import com.LAMPP.befree.model.Profile;

import java.util.List;

public interface InterfaceRepositoryProfile {



    public List<Profile> getAll();

    public Profile getById(long IdProfile);

    public Profile getByLogin(String login);

    public void addProfile(Profile profile);

}
