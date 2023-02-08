package com.jsp.onetooneui.service;

import java.util.List;

import javax.persistence.Query;

import com.jsp.onetooneui.dao.PanDao;
import com.jsp.onetooneui.dto.Pan;

public class PanService {
	PanDao panDao = new PanDao();

	public Pan createPan(Pan pan) {
		return panDao.createPan(pan);
	}

	public Pan deletePanById(int id) {

		return panDao.deletePanById(id);
	}

	public Pan updatePanById(int id, String name, int pan_no) {

		return panDao.updatePanById(id, name, pan_no);
	}

	public Pan getPanById(int id) {

		return panDao.getPanById(id);
	}

	public List<Pan> getAllPans() {

		return panDao.getAllPans();
	}
}
