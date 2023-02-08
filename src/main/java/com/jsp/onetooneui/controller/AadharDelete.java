package com.jsp.onetooneui.controller;

import com.jsp.onetooneui.service.AadharService;

public class AadharDelete {
	public static void main(String[] args) {
		
		AadharService aadharService = new AadharService();
				
		aadharService.deleteAadharById(3);
		
	}
}
