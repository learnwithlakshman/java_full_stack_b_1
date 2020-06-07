package com.nubes.cj.day28;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
class Appointment {
	private String docId;
	private String patId;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private String location;

}

public class BuilderExample {
	public static void main(String[] args) {
		Appointment appointment = Appointment.builder().docId("1001").patId("2001").startTime(LocalDateTime.now())
				.endTime(LocalDateTime.now()).location("Bangalore").build();
		
		
	}
}
