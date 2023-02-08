package com.jsp.onetooneui.controller;

import com.jsp.onetooneui.service.PanService;

public class PanUpdate {
	public static void main(String[] args) {

		PanService panService = new PanService();
		panService.updatePanById(1, "dhanraj", 111111);
	}
}
