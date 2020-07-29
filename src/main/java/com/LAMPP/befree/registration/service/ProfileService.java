package com.LAMPP.befree.registration.service;

import com.LAMPP.befree.registration.dto.CreateProfileDTO;
import com.LAMPP.befree.registration.dto.GetProfileDTO;
import com.LAMPP.befree.registration.mapper.GetProfileToDTOMapper;
import com.LAMPP.befree.registration.model.Profile;
import com.LAMPP.befree.registration.repository.InterfaceRepositoryProfile;
import com.LAMPP.befree.registration.repository.InterfaceRepositoryProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProfileService {

    InterfaceRepositoryProfile profileRepository;
    GetProfileToDTOMapper getProfileToDTOMapper;

    @Autowired
    public ProfileService(InterfaceRepositoryProfile profileRepository, GetProfileToDTOMapper getProfileToDTOMapper) {
        this.profileRepository = profileRepository;
        this.getProfileToDTOMapper = getProfileToDTOMapper;
    }

    public List<GetProfileDTO> getAll() {
        List<Profile> profiles = profileRepository.findAll();
        return profiles.stream().map(profile -> getProfileToDTOMapper.getProfileDto(Optional.of(profile)).get()).collect(Collectors.toList());
    }

    public Optional<GetProfileDTO> getById(UUID idProfile) {
        Optional<Profile> profile = profileRepository.findById(idProfile);
        return getProfileToDTOMapper.getProfileDto(profile);
    }


    public void addProfile(CreateProfileDTO createProfileDTO) {
        Profile profile = new Profile(createProfileDTO.name, createProfileDTO.surname, createProfileDTO.email, createProfileDTO.login, createProfileDTO.password,
                createProfileDTO.phoneNumber, createProfileDTO.age);
        profileRepository.save(profile);
    }


}
