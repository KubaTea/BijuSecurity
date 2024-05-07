package com.biju.securitybiju.controllers;

import com.biju.securitybiju.model.Artist;
import com.biju.securitybiju.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
public class LoginController {

    private ArtistRepository artistRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public LoginController(ArtistRepository artistRepository, PasswordEncoder passwordEncoder) {
        this.artistRepository = artistRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Artist artist){
        Artist savedArtist = null;
        ResponseEntity response = null;
        try {
            String hashPwd = passwordEncoder.encode(artist.getPwd());
            artist.setPwd(hashPwd);
            savedArtist = artistRepository.save(artist);
            if (savedArtist.getId() > 0){
                response = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body("Given user details are successfully registered");
            }
        }catch (Exception ex){
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An exception occured due to " + ex.getMessage());
        }
        return response;
    }

    @RequestMapping("/user")
    public Artist getUserDetailsAfterLogin(Authentication authentication) {
        List<Artist> artists = artistRepository.findByEmail(authentication.getName());
        if (artists.size() > 0) {
            return artists.get(0);
        } else {
            return null;
        }

    }
}
