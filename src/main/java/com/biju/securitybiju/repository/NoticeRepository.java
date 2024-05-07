package com.biju.securitybiju.repository;

import com.biju.securitybiju.model.Notice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {

    @Query(value = "from Notice n where current date BETWEEN n.noticBegDt AND n.noticEndDt")
    List<Notice> findAllActiveNotices();
}
