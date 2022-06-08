package model;

import java.io.Serializable;

public class Slime implements Serializable{
	private String name;
	private int hp;

	public Slime() {}
	public Slime(String name, int hp){
		this.name = name;
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}


}
