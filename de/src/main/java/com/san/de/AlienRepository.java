package com.san.de;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
	 List<Alien> aliens;
	 
	 public AlienRepository(){
		 aliens = new ArrayList<>();
		 
		 Alien a1 = new Alien();
		 
		 a1.setID(100);
			
		a1.setName("SAM");
		a1.setPoints(10);
			
		Alien a2 = new Alien();
		a2.setName("Bella");
		a2.setPoints(12);
		a2.setID(101);
		
		
		aliens.add(a1);
		aliens.add(a2);
	 }
	 
	 public List<Alien> getAliens(){
		 return aliens;
	 }
	 
	 public Alien getAlien(int id) {
		 for(Alien a:aliens) {
			 if (a.getId()==id) {
				 return a;
			 }
		 }
		 return null;
	 }

	public void create(Alien a1) {
		aliens.add(a1);
		// TODO Auto-generated method stub
		
	}
	
	public void updateName(Alien a1,String name) {
		for(Alien a:aliens) {
			if(a.compareTo(a1)==0) {
				a.setName(name);
			}
		}
	}
	
	public void updateID(Alien a1,String ID) {
		for(Alien a:aliens) {
			if(a.compareTo(a1)==0) {
				a.setName(ID);
			}
		}
	}
	
	public void updatePoints(Alien a1,String points) {
		for(Alien a:aliens) {
			if(a.compareTo(a1)==0) {
				a.setName(points);
			}
		}
	}
	



}
