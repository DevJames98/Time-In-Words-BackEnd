package com.revature.time.time.services;

import java.util.List;

import com.revature.time.time.daos.EventDao;
import com.revature.time.time.models.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

@Service
public class EventServiceImpl implements EventService {

  private EventDao ed;

  @Autowired
  public EventServiceImpl(EventDao ed) {
    this.ed = ed;
  }

  @Override
  public List<Event> getAllEvents() {
    return ed.findAll();
  }

  @Override
  public Event saveNewEvent(Event e) {
    return ed.save(e);
  }

  // get time

}