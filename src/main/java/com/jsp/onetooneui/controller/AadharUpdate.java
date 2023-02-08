package com.jsp.onetooneui.controller;

import com.jsp.onetooneui.service.AadharService;

public class AadharUpdate {
	public static void main(String[] args) {
		AadharService aadharService =  new AadharService();
		
		aadharService.updateAadharById(1, "samir" , 567897);
	}
}
