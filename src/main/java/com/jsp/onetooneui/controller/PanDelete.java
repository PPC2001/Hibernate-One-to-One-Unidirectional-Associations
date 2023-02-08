package com.jsp.onetooneui.controller;

import com.jsp.onetooneui.service.PanService;

public class PanDelete {
	public static void main(String[] args) {
		
		PanService panService  = new PanService();
		panService.deletePanById(4);
	}
}
