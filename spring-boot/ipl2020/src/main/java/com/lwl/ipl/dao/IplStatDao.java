package com.lwl.ipl.dao;

import java.util.List;

import com.lwl.ipl.domain.Player;
import com.lwl.ipl.domain.Team;
import com.lwl.ipl.dto.IRoleAmountDTO;
import com.lwl.ipl.dto.IRoleCountDTO;
import com.lwl.ipl.dto.MaxAmountDTO;
import com.lwl.ipl.dto.PlayerDTO;
import com.lwl.ipl.service.exception.TeamAlreadyExistsException;

public interface IplStatDao {
	public List<String> allTeamsLables();

	public List<PlayerDTO> getPlayersByTeam(String teamLabel);

	public List<IRoleCountDTO> getCountByRole(String teamLabel);

	public List<IRoleAmountDTO> getAmountByRole(String teamLabel);

	public List<PlayerDTO> getByRole(String teamLabel, String role);
	
	public MaxAmountDTO getMaxAmountByRole();

	public Team addNewTeam(Team team) throws TeamAlreadyExistsException;

	public Team updateTeam(Team team);

	public boolean deleteTeam(String label);

	public List<Team> getAllTeams();

	public Player addNewPlayer(String label, Player player);

	public Player updatePlayer(Player player);

	public boolean deletePlayer(String label);

	public List<Player> getAllPlayers();
}
