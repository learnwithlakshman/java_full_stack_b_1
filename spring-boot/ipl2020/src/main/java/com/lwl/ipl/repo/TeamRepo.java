package com.lwl.ipl.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lwl.ipl.domain.Team;


public interface TeamRepo extends JpaRepository<Team,String>{

			public List<Team> findByLabelOrNameLike(String str,String name);
}
