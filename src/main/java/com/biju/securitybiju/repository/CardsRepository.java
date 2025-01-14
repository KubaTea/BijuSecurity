package com.biju.securitybiju.repository;

import com.biju.securitybiju.model.Cards;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardsRepository extends CrudRepository<Cards, Long> {
    List<Cards> findByArtistId(int artistId);
}
