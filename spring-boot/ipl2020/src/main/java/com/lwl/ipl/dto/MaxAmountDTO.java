package com.lwl.ipl.dto;

import java.util.List;
import java.util.Map;

import com.lwl.ipl.domain.Player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MaxAmountDTO {
	
	private Map<String,List<Player>> maxPlayersMap;
		
}
