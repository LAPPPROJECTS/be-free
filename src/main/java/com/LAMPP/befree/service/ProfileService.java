package com.LAMPP.befree.service;

import com.LAMPP.befree.model.Profile;
import com.LAMPP.befree.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Profiles;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {

    ProfileRepository profileRepository;

    @Autowired
    public ProfileService(ProfileRepository profileRepository){
        this.profileRepository= profileRepository;
    }
    public List<Profile>getAll(){
        return profileRepository.getAll();
    }

    public Profile getById(long idProfile){
        return profileRepository.getById(idProfile);
    }
    public void addProfile( Profile profile){
        profileRepository.addProfile(profile);
    }

    }
