package com.LAMPP.befree.repository;

import com.LAMPP.befree.model.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProfileRepository {
    private List<Profile> profileList = new ArrayList<>();

    public ProfileRepository() {
        profileList.add(new Profile("Janusz", "Kowalski", "kowalski@gmail.com", "kowal", "password", 10000001));
        profileList.add(new Profile("Janusz2", "Kowalski2", "2kowalski@gmail.com", "kowal2", "password2", 10000002));
        profileList.add(new Profile("Janusz3", "Kowalski3", "3kowalski@gmail.com", "kowal3", "password3", 10000003));
        profileList.add(new Profile("Janusz4", "Kowalski4", "4kowalski@gmail.com", "kowal4", "password4", 10000004));
    }
    public List<Profile>getAll() { return profileList;}

    public Profile getById(@PathVariable long IdProfile) {
        return profileList.stream()
                .filter(profile -> profile.getIdProfile()==IdProfile)
                .findFirst()
                .orElse(null);
    }

    public void addProfile(Profile profile)
    { profileList.add(profile);}

}
