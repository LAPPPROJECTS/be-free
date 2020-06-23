package com.LAMPP.befree.repository;

import com.LAMPP.befree.model.Profile;
import com.LAMPP.befree.model.ProfileType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class ProfileRepository implements InterfaceRepositoryProfile {

    public List<Profile> profileList = new ArrayList<>();


    public ProfileRepository() {
        /*profileList.add(new Profile("903424c4-b4b6-11ea-b3de-0242ac130004", "Janusz", "Kowalski", "kowalski@gmail.com", "kowal", "password", 12555446, 33, ProfileType.USER));
        profileList.add(new Profile("6d597fa6-b4bd-11ea-b3de-0242ac130004", "Janusz2", "Kowalski2", "2kowalski@gmail.com", "kowal2", "password2", 5485494, 55, ProfileType.USER));
        profileList.add(new Profile("6d598320-b4bd-11ea-b3de-0242ac130004", "Janusz3", "Kowalski3", "3kowalski@gmail.com", "kowal3", "password3", 55448, 66, ProfileType.USER));
    */
    }

    @Override
    public List<Profile> getAll() {
        return profileList;
    }

    @Override
    public Profile getById(UUID idProfile) {
        return profileList.stream()
                .filter(profile -> profile.getIdProfile().equals(idProfile))
                .findFirst()
                .orElse(null);

    }

    @Override
    public Profile getByLogin(String login) {
        return profileList.stream()
                .filter(profile -> profile.getLogin().equals(login))
                .findFirst()
                .orElse(null);
    }


    @Override
    public int addProfile(UUID idProfile, Profile profile) {
        profileList.add(new Profile(idProfile, profile.getName(), profile.getSurname(), profile.getEmail(),
                profile.getLogin(), profile.getPassword(), profile.getPhoneNumber(), profile.getAge(), ProfileType.USER));
        return 0;
    }
}