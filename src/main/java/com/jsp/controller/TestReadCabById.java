package com.jsp.controller;

import com.jsp.dto.Cab;
import com.jsp.service.CabService;

public class TestReadCabById {
	public static void main(String[] args) {
		int id = 1;
		CabService cabService = new CabService();
		Cab cab = cabService.readById(id);

		System.out.println(cab.getId());
		System.out.println(cab.getName());
		System.out.println(cab.getType());

	}

}
