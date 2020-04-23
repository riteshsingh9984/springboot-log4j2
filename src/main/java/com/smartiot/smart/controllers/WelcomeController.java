package com.smartiot.smart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartiot.smart.dto.Response;
import com.smartiot.smart.models.SwitchBoard;
import com.smartiot.smart.services.SwitchBoardService;

@RestController
@RequestMapping(value = "switch-board", produces = MediaType.APPLICATION_JSON_VALUE)
public class WelcomeController {

	@Autowired
	private SwitchBoardService switchBoardService;
	
	@GetMapping("/set-status/{status}")	  
	public ResponseEntity<Response<Boolean>> setBoardStatus(@PathVariable("status") Integer status) {
		return new ResponseEntity<>(
				new Response<>(HttpStatus.OK.value(), 
						"Update switchboard status successfully.", switchBoardService.setStatus(status)),
				HttpStatus.OK);
	}
	
	@GetMapping("/status")	  
	public ResponseEntity<Response<SwitchBoard>> getBoardStatus() {
		return new ResponseEntity<>(
				new Response<>(HttpStatus.OK.value(), 
						"SwitchBoard status fetched successfully.", switchBoardService.getStatus()),
				HttpStatus.OK);
	}

}
