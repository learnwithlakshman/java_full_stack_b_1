package com.lwl.ipl.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.internal.util.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.lwl.ipl.dao.IplStatDao;
import com.lwl.ipl.domain.Player;
import com.lwl.ipl.domain.Team;
import com.lwl.ipl.dto.IRoleAmountDTO;
import com.lwl.ipl.dto.IRoleCountDTO;
import com.lwl.ipl.dto.MaxAmountDTO;
import com.lwl.ipl.dto.PlayerDTO;
import com.lwl.ipl.repo.TeamRepo;
import com.lwl.ipl.service.exception.TeamAlreadyExistsException;

@Service
public class IplStatServiceImpl implements IplStatService {

	private Logger log = LoggerFactory.getLogger(IplStatServiceImpl.class);

	private IplStatDao iplStatDao;

	@Autowired
	public IplStatServiceImpl(IplStatDao iplStatDao) {
		this.iplStatDao = iplStatDao;
	}

	@Override
	public List<String> allTeamsLables() {
		List<String> labels = iplStatDao.allTeamsLables();
		log.info("Total labels count is :{}", labels != null ? labels.size() : 0);
		return labels;
	}

	@Override
	public List<PlayerDTO> getPlayersByTeam(String teamLabel) {
		List<PlayerDTO> players = new ArrayList<PlayerDTO>();
		Assert.notNull(teamLabel, "Team label can't be empty or null");
		log.info("Looking players for the team label:{}", teamLabel);
		players = iplStatDao.getPlayersByTeam(teamLabel);
		if (players != null) {
			log.info("Total players found for the :{} is {}", teamLabel, players.size());
			return players;
		} else {
			log.info("Label is not found or Team with label {}  there no players", teamLabel);
		}

		return players;
	}

	@Override
	public List<IRoleCountDTO> getCountByRole(String teamLabel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IRoleAmountDTO> getAmountByRole(String teamLabel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	
	public List<PlayerDTO> getByRole(String teamLabel, String role) {
		List<PlayerDTO> playersList = new ArrayList<>();
		Assert.notNull(teamLabel, "Team label can't be empty or null");
		Assert.notNull(role, "Role can't be empty or null");
		playersList = iplStatDao.getByRole(teamLabel, role);
		log.info("Total players found for team:{}  of role:  {} is", teamLabel, role,
				playersList != null ? playersList.size() : 0);
		return playersList;
	}

	@Override
	public MaxAmountDTO getMaxAmountByRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PreAuthorize("hasRole('ADMIN')")
	public Team addNewTeam(Team team) throws TeamAlreadyExistsException {
		// TODO Auto-generated method stub
		return team;
	}

	@Override
	public Team updateTeam(Team team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteTeam(String label) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Team> getAllTeams() {
		return iplStatDao.getAllTeams();
	}

	@Override
	public Player addNewPlayer(String label, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletePlayer(String label) {
		// TODO Auto-generated method stub
		return false;
	}

}
