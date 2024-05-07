package com.biju.securitybiju.repository;

import com.biju.securitybiju.model.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long> {
    List<Artist> findByEmail(String email);
}
