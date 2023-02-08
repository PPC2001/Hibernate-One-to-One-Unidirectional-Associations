package com.jsp.onetooneui.controller;

import com.jsp.onetooneui.dto.Aadhar;
import com.jsp.onetooneui.service.AadharService;

public class AadharAllDetails {
	public static void main(String[] args) {
		
		AadharService aadharService = new AadharService();
		
		for (Aadhar a : aadharService.getAllAadhars()) {
			System.out.println("---------------");
			System.out.println(a.getId());
			System.out.println(a.getName());
			System.out.println(a.getAadhar_no());
		}
	}
}
