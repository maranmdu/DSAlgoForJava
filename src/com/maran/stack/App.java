package com.maran.stack;

public class App {

	public static void main(String[] args) {
		StackMaxNumber st = new StackMaxNumber();
		st.push(231);
		st.push(18);
		st.push(25);
		st.push(2700);
		st.push(247);
		st.push(2233);
		st.pop();
		st.pop();
		
		System.out.println(st.getMax());

	}

}
