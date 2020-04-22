package com.revature.time.time.services;

import java.util.List;

import com.revature.time.time.models.Event;

public interface EventService {
  public List<Event> getAllEvents();

  public Event saveNewEvent(Event e);
  // get time
}