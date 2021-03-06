package org.cg.labbook2.lab1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class SBUBean {
	
	@Value("${sbuId}")
	int sbuId;
	
	@Value("${sbuName}")
	String sbuName;
	
	@Value("${sbuHead}")
	String sbuHead;
	
	
	public int getSbuId() {
		return sbuId;
	}
	
	public String getSbuName() {
		return sbuName;
	}
	
	public String getSbuHead() {
		return sbuHead;
	}
	

}
