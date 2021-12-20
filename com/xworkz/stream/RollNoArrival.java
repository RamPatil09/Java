package com.xworkz.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollNoArrival {

	public static void main(String[] args) {
		Stream<Integer> rollNo = Stream.of(5,28,4,7,29,1,6,30,3,15,17,12,27,12,24,16,11,21,19,22);
		List<Integer> tempRollNo = rollNo.filter((r)->r>15).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		tempRollNo.forEach((roll)->System.out.println(roll));
	}
}