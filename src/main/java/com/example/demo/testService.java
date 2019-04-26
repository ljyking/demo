package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testService {
	@Autowired
	private Person p;
	
	public void getPerson() {
		System.out.println(p.getName());
	}
}
