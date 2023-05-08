package t20230504;

import t20230503.Day;

public class Account {
	private static int counter = 0;
	
	private String name;
	private String no;
	private long balance;
	private int id;
	
	{
		id = ++counter;
		System.out.println("은행계좌를 개설해주셔서 감사합니다.");
	}
	
	
	public Account(String name, String no, long balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public int getId() {
		return id;
	}
	
	void deposit(long k) {
		balance += k;
	}
	
	void withdraw(long k) {
		balance -= k;
	}
	
	public String toString() {
		return "{" + name + "," + no + ", " + balance + "}";
	}
}
