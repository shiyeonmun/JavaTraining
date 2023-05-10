package t20230506;

import t20230503.Day;

public class Human {
	private String name;
	private int height;
	private int weight;
	private Day birthday;
	
	public Human(String name, int height, int weight, Day birthday) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.birthday = new Day(birthday);
	}
	
	public String getName() {return name;}
	public int getHeight() {return height;}
	public int getWeight() {return weight;}
	public Day getBirthday() {return new Day(birthday);}
	
	public void gainWeight(int w) {weight += w;}
	public void reduceWeight(int w) {weight -= w;}
	
	public void putDate() {
		System.out.println("이름: " + name);
		System.out.println("신장: " + height + "cm");
		System.out.println("체중: " + weight + "kg");
	}
	
	public String toString() {
		return "{" + name + ":" + height + "cm" + weight + "kg" + birthday + "출생}";
	}
}
