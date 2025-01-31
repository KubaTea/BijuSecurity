package com.biju.securitybiju.controllers;

import com.biju.securitybiju.model.Accounts;
import com.biju.securitybiju.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private AccountsRepository accountsRepository;
    @GetMapping("/myAccount")
    public Accounts getAccountDetails(@RequestParam int id){
        Accounts accounts = accountsRepository.findByArtistId(id);
        if (accounts != null ) {
            return accounts;
        }else {
            return null;
        }
    }
}
