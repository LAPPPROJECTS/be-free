package com.LAMPP.befree;

import com.LAMPP.befree.model.Profile;
import com.LAMPP.befree.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    ProfileService service;

    @Autowired
public ProfileController(ProfileService service){
        this.service=service;
    }

    public ProfileController(){}

    @GetMapping
    public List<Profile> getProfileList() {
        return service.getAll();
    }

    @GetMapping ("/{idProfile}")
    public Profile getById(@PathVariable long idProfile) {
        return service.getById(idProfile);
    }

    @PostMapping
    public void addProfile(@RequestBody Profile profile){
        service.addProfile(profile);
    }
}
