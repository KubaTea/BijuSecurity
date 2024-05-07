package com.biju.securitybiju.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Accounts {
    @Column(name = "artist_id")
    private int artistId;

    @Id
    @Column(name="account_number")
    private long accountNumber;

    @Column(name="account_type")
    private String accountType;

    @Column(name = "branch_address")
    private String branchAddress;

    @Column(name = "create_dt")
    private String createDt;


    public int getArtistId() {
        return artistId;
    }
    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getBranchAddress() {
        return branchAddress;
    }
    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }
    public String getCreateDt() {
        return createDt;
    }
    public void setCreateDt(String createDt) {
        this.createDt = createDt;
    }
}
