package com.revature.time.time.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.time.time.models.Event;

@Repository
public interface EventDao extends JpaRepository<Event, Integer> {

}