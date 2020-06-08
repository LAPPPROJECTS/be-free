package com.LAMPP.befree;

import com.LAMPP.befree.dto.ProfileDTO;
import com.LAMPP.befree.model.Profile;
import com.LAMPP.befree.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    ProfileService service;

    @Autowired
    public ProfileController(ProfileService service) {
        this.service = service;
    }

    public ProfileController() {
    }

    @GetMapping
    public ResponseEntity<List<ProfileDTO>> getProfileList() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idProfile}")
    public ResponseEntity<ProfileDTO> getById(@PathVariable long idProfile) {
        ProfileDTO profile = service.getById(idProfile);
        if (profile != null) {
            return new ResponseEntity<>(profile, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity addProfile(@RequestBody ProfileDTO profileDTO) {
        if (profileDTO.name.length() > 20) {
            return new ResponseEntity("To long name", HttpStatus.BAD_REQUEST);

        }
        service.addProfile(profileDTO);
        return new ResponseEntity(HttpStatus.OK);
    }

}
