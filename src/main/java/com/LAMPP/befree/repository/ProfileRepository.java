package com.LAMPP.befree.repository;

import com.LAMPP.befree.model.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class ProfileRepository implements InterfaceRepositoryProfile {

    private List<Profile> profileList = new ArrayList<>();


    public ProfileRepository() {
       // profileList.add(new Profile("Janusz", "Kowalski", "kowalski@gmail.com", "kowal", "password", "1ca5afb8-afee-11ea-b3de-0242ac130004", 12555446, 33, ProfileType.USER));
       // profileList.add(new Profile("Janusz2", "Kowalski2", "2kowalski@gmail.com", "kowal2", "password2", "1ca5b1b6-afee-11ea-b3de-0242ac130004", 5485494, 55, ProfileType.USER));
       // profileList.add(new Profile("Janusz3", "Kowalski3", "3kowalski@gmail.com", "kowal3", "password3", "1ca5b2ba-afee-11ea-b3de-0242ac130004", 55448, 66, ProfileType.USER));
    }

    /*@Override
    public int insertProfile(UUID idProfile, Profile profile) {
        profileList.add(new Profile(profile.getIdProfile(), profile.getName(), profile.getSurname(), profile.getEmail(), profile.getLogin(), profile.getPassword(),  profile.getPhoneNumber(), profile.getAge(), profile.getProfileType()));
        return 1;
    }*/


    @Override
    public UUID insertProfile() {
        return  UUID.randomUUID();
    }

    @Override
    public List<Profile> getAll() {
        return profileList;
    }

    @Override
    public Profile getById(UUID idProfile) {
        return profileList.stream()
                .filter(profile -> profile.getIdProfile()==idProfile)
                .findFirst()
                .orElse(null);

    }
    @Override
    public void addProfile(Profile profile) {
        profileList.add(profile);
    }

}
