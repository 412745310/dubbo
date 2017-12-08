package com.chelsea.dubboProvider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		while(list.size() < 44){
			int i = random.nextInt(44) + 1;
			if(!list.contains(i)){
				list.add(i);
			}
		}
		Collections.shuffle(list);
		System.out.println(list);
	}

}
