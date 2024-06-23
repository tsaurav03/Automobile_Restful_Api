package com.automobile.dtos;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ApiResponse {
	
	private String mesg;
	
	private LocalDateTime ts;

	public ApiResponse(String mesg) {
		super();
		this.mesg = mesg;
		this.ts = LocalDateTime.now();
	}
	

}
