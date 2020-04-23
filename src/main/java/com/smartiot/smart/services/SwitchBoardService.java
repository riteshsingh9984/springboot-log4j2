package com.smartiot.smart.services;

import org.springframework.stereotype.Service;

import com.smartiot.smart.cache.SwitchBoardCache;
import com.smartiot.smart.models.SwitchBoard;

@Service("switchBoardService")
public class SwitchBoardService {

	public Boolean setStatus(int status) {
		
		SwitchBoardCache.STATUS = status;
		return true;
	}
	
	public SwitchBoard getStatus() {
		
		SwitchBoard status = new SwitchBoard();
		status.setStatus(SwitchBoardCache.STATUS);
		return status;
	}
}
