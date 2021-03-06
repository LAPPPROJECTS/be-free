package com.LAMPP.befree.registration;

import com.LAMPP.befree.registration.dto.CreateProfileDTO;
import com.LAMPP.befree.registration.dto.GetProfileDTO;
import com.LAMPP.befree.registration.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public ResponseEntity<List<GetProfileDTO>> getProfileList() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }


    @GetMapping("/{idProfile}")
    public ResponseEntity<GetProfileDTO> getById(@PathVariable UUID idProfile) {
        Optional<GetProfileDTO> profile = service.getById(idProfile);
        if (profile.isPresent()) {
            return new ResponseEntity<>(profile.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity addProfile(@RequestBody CreateProfileDTO createProfileDTO) {
        if (createProfileDTO.name.length() > 20) {
            return new ResponseEntity("To long name", HttpStatus.BAD_REQUEST);
        }
        if (createProfileDTO.surname.length() > 20) {
            return new ResponseEntity("To long name", HttpStatus.BAD_REQUEST);
        }

        Pattern patternEmail = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        Matcher matcherEmail = patternEmail.matcher(createProfileDTO.email);
        if (matcherEmail.matches() == false) {
            return new ResponseEntity("wrong email format", HttpStatus.BAD_REQUEST);
        }
        if (createProfileDTO.login.length() > 20) {
            return new ResponseEntity("To long login", HttpStatus.BAD_REQUEST);
        }

        service.addProfile(createProfileDTO);
        return new ResponseEntity(HttpStatus.OK);
    }

}
