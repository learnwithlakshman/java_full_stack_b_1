package com.lwl.ipl.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Team {
	
	@Id
	private String label;
	private String name;
	private String city;
	private String coach;
	private String home;

}
