package com.alti.mani;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class BalancedParanthesis {
	Stack<Character> s;
	Map<Character, Character> closingElement;
	Set set;

	public BalancedParanthesis(){
		s = new Stack<>();
		closingElement = new HashMap<>();
		closingElement.put('}','{');
		closingElement.put(']','[');
		closingElement.put(')','(');
		set = closingElement.keySet();
	}

	public static void main(String[] args) throws Exception {
		BalancedParanthesis b = new BalancedParanthesis();
		b.insert('{');
		b.insert('(');
		b.insert(')');
		b.insert('[');
		b.insert('}');

	}

	public void insert(Character c) throws Exception {
		if (!set.contains(c)) {
			s.push(c);
		} else if (closingElement.get(c).equals(s.peek())) {
			s.pop();
		} else {
			System.out.println("UnBlanced");
			throw new Exception("UnBlanced.....");
		}
	}
}
