package com.winter.app.aop;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Transfer {
		
	
	/** point-cut **/
	public void userBus(String Bus) {
		log.info(" 버트 타기");
	}
	/** point-cut **/
	public void userSubway(String Subway) {
		log.info("   지하철  타기   ");
	}
}
