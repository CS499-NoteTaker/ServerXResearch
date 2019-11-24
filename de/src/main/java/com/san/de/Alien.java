package com.san.de;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien implements Comparable<Alien>{
	private String name;
	private int points;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	public String toString() {
		return getName()+" "+getPoints();
	}
	@Override
	public int compareTo(Alien o) {
		// TODO Auto-generated method stub
		if(this.name == o.getName() && this.id == o.id && this.points == o.points ) {
			return 0;
		}
		else return -1;
	}
	
	
	

}
