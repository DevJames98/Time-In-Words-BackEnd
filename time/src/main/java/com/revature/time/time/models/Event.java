package com.revature.time.time.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Event {

  @Id
  @Column(name = "event_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int event_id;

  @Column(name = "name")
  private String event_name;

  @Column(name = "location")
  private String event_location;

  @Column(name = "date")
  private String event_date;

  @Column(name = "time")
  private String event_time;

  public int getEvent_id() {
    return event_id;
  }

  public void setEvent_id(int event_id) {
    this.event_id = event_id;
  }

  public String getEvent_name() {
    return event_name;
  }

  public void setEvent_name(String event_name) {
    this.event_name = event_name;
  }

  public String getEvent_location() {
    return event_location;
  }

  public void setEvent_location(String event_location) {
    this.event_location = event_location;
  }

  public String getEvent_date() {
    return event_date;
  }

  public void setEvent_date(String event_date) {
    this.event_date = event_date;
  }

  public String getEvent_time() {
    return event_time;
  }

  public void setEvent_time(String event_time) {
    this.event_time = event_time;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((event_date == null) ? 0 : event_date.hashCode());
    result = prime * result + event_id;
    result = prime * result + ((event_location == null) ? 0 : event_location.hashCode());
    result = prime * result + ((event_name == null) ? 0 : event_name.hashCode());
    result = prime * result + ((event_time == null) ? 0 : event_time.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Event other = (Event) obj;
    if (event_date == null) {
      if (other.event_date != null)
        return false;
    } else if (!event_date.equals(other.event_date))
      return false;
    if (event_id != other.event_id)
      return false;
    if (event_location == null) {
      if (other.event_location != null)
        return false;
    } else if (!event_location.equals(other.event_location))
      return false;
    if (event_name == null) {
      if (other.event_name != null)
        return false;
    } else if (!event_name.equals(other.event_name))
      return false;
    if (event_time == null) {
      if (other.event_time != null)
        return false;
    } else if (!event_time.equals(other.event_time))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Event [event_date=" + event_date + ", event_id=" + event_id + ", event_location=" + event_location
        + ", event_name=" + event_name + ", event_time=" + event_time + "]";
  }

  public Event() {
  }

  public Event(int event_id, String event_name, String event_location, String event_date, String event_time) {
    this.event_id = event_id;
    this.event_name = event_name;
    this.event_location = event_location;
    this.event_date = event_date;
    this.event_time = event_time;
  }

}