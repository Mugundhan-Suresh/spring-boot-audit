package com.mugundhan.spring_audit.spring_audit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends RevisionRepository<Book,Integer,Integer>, JpaRepository<Book , Integer> {

}
