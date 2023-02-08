package com.jsp.onetooneui.controller;

import com.jsp.onetooneui.service.AadharService;

public class AadharRead {
	public static void main(String[] args) {

		AadharService aadharService = new AadharService();

		aadharService.getAadharById(1);
	}
}
