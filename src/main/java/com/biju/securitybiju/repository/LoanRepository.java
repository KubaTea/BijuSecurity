package com.biju.securitybiju.repository;

import com.biju.securitybiju.model.Loans;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoanRepository extends CrudRepository<Loans, Long> {
    List<Loans> findByArtistIdOrderByStartDtDesc(int artistId);
}
