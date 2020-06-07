package com.nubes.cj.cbook.domain;

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
public class Contact {
	
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private Address address;
}
