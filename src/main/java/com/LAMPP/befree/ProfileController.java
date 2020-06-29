package com.LAMPP.befree;

import com.LAMPP.befree.dto.CreateProfileDTO;
import com.LAMPP.befree.dto.GetProfileDTO;
import com.LAMPP.befree.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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


    @GetMapping(path = "/{idProfile}")
    public ResponseEntity<GetProfileDTO> getById(@PathVariable ("idProfile") UUID idProfile) {
        GetProfileDTO profile = service.getById(idProfile);
        if (profile != null) {
            return new ResponseEntity<>(profile, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(path = "/log/{login}")
    public ResponseEntity<GetProfileDTO> getByLogin(@PathVariable ("login") String login) {
        GetProfileDTO profile = service.getByLogin(login);
        if (profile != null) {
            return new ResponseEntity<>(profile, HttpStatus.OK);
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
