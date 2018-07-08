package com.epam.lab.hw3.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Task5 {
	@SuppressWarnings("rawtypes")
	private List lstFruits = new ArrayList<>();

	@SuppressWarnings("unchecked")
	public void add(String fruit) {
		lstFruits.add(fruit);
	}

	public void remove(String fruit) {
		if (!lstFruits.contains(fruit)) {
			throw new NoSuchElementException();
		}
		lstFruits.remove(fruit);
	}

	public int size() {
		return lstFruits.size();
	}

	public void removeAll() {
		lstFruits.clear();
	}
}
