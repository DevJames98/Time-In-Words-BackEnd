package com.revature.time.time.controllers;

import java.util.List;

import com.revature.time.time.models.Event;
import com.revature.time.time.services.EventService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("event")
public class EventController {

  private EventService es;

  @Autowired
  public EventController(EventService es) {
    this.es = es;
  }

  // Get all events
  @GetMapping
  public ResponseEntity<List<Event>> getAllEvents() {
    return new ResponseEntity(es.getAllEvents(), HttpStatus.OK);
  }

  // Create new event
  @PostMapping
  public ResponseEntity<Event> saveNewEvent(@RequestBody Event e) {
    if (e.getEvent_id() != 0) {
      return new ResponseEntity("Id must be 0", HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity(es.saveNewEvent(e), HttpStatus.OK);
  }

  // Get time in words

}