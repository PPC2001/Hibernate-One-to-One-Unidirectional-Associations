package com.jsp.onetooneui.controller;

import com.jsp.onetooneui.service.PanService;

public class PanRead {
	public static void main(String[] args) {

		PanService panService = new PanService();
		panService.getPanById(1);
	}
}
