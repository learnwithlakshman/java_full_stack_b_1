package com.lwl.ipl.dto;

import com.lwl.ipl.domain.PlayerRole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerDTO {
	
	private String name;
	private String team;
	private PlayerRole role;
	private String label;
	private double price;
	
	
	
	
	
	
}
