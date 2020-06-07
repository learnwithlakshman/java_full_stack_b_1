package com.lwl.ipl.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lwl.ipl.domain.Player;
import com.lwl.ipl.domain.PlayerRole;
import com.lwl.ipl.dto.PlayerDTO;

public interface PlayerRepo extends JpaRepository<Player,Integer> {

	List<Player> findByPlayerRole(PlayerRole role);

	

}
