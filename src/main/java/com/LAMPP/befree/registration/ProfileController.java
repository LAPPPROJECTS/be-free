package com.LAMPP.befree.registration;

import com.LAMPP.befree.registration.dto.CreateProfileDTO;
import com.LAMPP.befree.registration.dto.GetProfileDTO;
import com.LAMPP.befree.registration.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
        return profile.map(getProfileDTO -> new ResponseEntity<>(getProfileDTO, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<CreateProfileDTO> addProfile(@Valid @RequestBody CreateProfileDTO createProfileDTO) {

        service.addProfile(createProfileDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
