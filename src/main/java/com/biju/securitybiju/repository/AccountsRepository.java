package com.biju.securitybiju.repository;

import com.biju.securitybiju.model.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {
    Accounts findByArtistId(int artistId);
}
