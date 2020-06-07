package com.lwl.ipl;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lwl.ipl.dto.IRoleCountDTO;
import com.lwl.ipl.dto.ITeamAmountDTO;
import com.lwl.ipl.dto.PlayerDTO;
import com.lwl.ipl.repo.CommonRepo;
import com.lwl.ipl.service.IplStatService;

@SpringBootTest
class Ipl2020ApplicationTests {

		@Autowired
		private IplStatService iplStatService;
		
		@Autowired
		private CommonRepo repo;

//		@Test
//		public void getTeamLabelsTest() {
//			List<String> list = iplStatService.allTeamsLables();
//			list.stream().forEach(e->{
//				System.out.println(e);
//			});
//			Assertions.assertEquals(list.size(), 8);
//		}
//		
//		@Test
//		public void getRoleCountDTOTest() {
//			
//				List<IRoleCountDTO> roleCountList = repo.getPlayersCountByRole();
//				roleCountList.stream().forEach(e->{
//					System.out.println(e.getPlayerRole() +" "+e.getCount());
//				});
//		}
//		@Test
//		public void getRoleAmountDTOTest() {
//			
//				 List<ITeamAmountDTO> roleCountList = repo.getAmountByRoleByTeam("CSK");
//				roleCountList.stream().forEach(e->{
//					System.out.println(e.getRole() +" "+e.getAmount());
//				});
//		}
		
		@Test
		public void playersByTeamAndRoleTest() {
				List<PlayerDTO> list = iplStatService.getByRole("CSK", "BATSMAN");
				list.stream().forEach(p->{
					System.out.println(p.getName());
				});
		}
}
