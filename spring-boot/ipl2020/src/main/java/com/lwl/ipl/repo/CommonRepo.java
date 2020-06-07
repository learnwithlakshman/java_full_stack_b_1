package com.lwl.ipl.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lwl.ipl.domain.Player;
import com.lwl.ipl.dto.IRoleCountDTO;
import com.lwl.ipl.dto.ITeamAmountDTO;
import com.lwl.ipl.dto.PlayerDTO;

public interface CommonRepo extends JpaRepository<Player,String>{
	@Query("select label from Team")
	List<String> getAllTeamLabels();

	@Query("select NEW com.lwl.ipl.dto.PlayerDTO(p.name,t.name,p.playerRole,t.label,p.price) from Player p inner join p.team t where p.team.label=?1")
	List<PlayerDTO> getPlayersByTeam(String teamName); 	
	
	@Query("select count(*) as count, playerRole as playerRole from Player p group by p.playerRole")
	List<IRoleCountDTO> getPlayersCountByRole();
	
	@Query("select sum(p.price) as amount, p.playerRole as role from Player p inner join p.team t where p.team.label=?1 group by p.playerRole")
	List<ITeamAmountDTO> getAmountByRoleByTeam(String teamName);
}
