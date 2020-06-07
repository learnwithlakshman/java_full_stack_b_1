package com.lwl.ipl;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lwl.ipl.domain.Team;
import com.lwl.ipl.service.IplStatService;
import com.lwl.ipl.web.IplStatController;
import static org.hamcrest.Matchers.hasSize;
@WebMvcTest(IplStatController.class)
public class IplMockTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	ObjectMapper mapper;
	
	@MockBean
	IplStatService iplStatService;
	
	@Test
	public void getLabels() throws Exception {
		List<String> list = Arrays.asList("CSK","KKR");
		Mockito.when(iplStatService.allTeamsLables()).thenReturn(list);
		mockMvc.perform(MockMvcRequestBuilders.get("/api/ipl2020/alllabels").contentType(MediaType.APPLICATION_JSON))
			   .andExpect(status().isOk()).andExpect(jsonPath("$", hasSize(2)));
	}
	
	@Test
	public void addTeamTest() {
		Team team = new Team();
		team.setLabel("KL");
		team.setName("Kerala Lions");
		team.setCity("Kochi");
		team.setHome("Kochi");
		
		
		
	}
}
