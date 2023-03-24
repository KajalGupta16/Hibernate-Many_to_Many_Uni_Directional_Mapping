package com.jsp.controller;

import com.jsp.service.CabService;

public class TestDeleteCab {
	public static void main(String[] args) {
		int id = 3;
	CabService cabService=new CabService();
	cabService.delete(id);
	
	}
}
