package com.unimitra.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "events")
public class EventsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "event_id")
	private int eventId;

	@Column(name = "event_name")
	private String eventName;

	@Column(name = "event_description")
	private String eventDescription;

	@Column(name = "event_charges")
	private String eventCharges;

	@Column(name = "event_location")
	private String eventLocation;

	@Column(name = "event_creation_time")
	private Date eventCreationDate;

	@Column(name = "event_modification_time")
	private Date eventModificationDate;

	@Column(name = "event_createdby")
	private int eventCreatedbyUserId;

	@Column(name = "event_date_time")
	private Date eventDateTime;

	@Override
	public String toString() {
		return "EventsEntity [eventId=" + eventId + ", eventName=" + eventName + "]";
	}

	
	
}
