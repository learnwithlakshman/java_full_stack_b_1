package com.nubes.cj.day30;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample3 {
	public static void main(String[] args) {
		
		String CS[] = { "NVR", "KVR", "TS", "NS", "GVL", "KVL" };
		String IS[] = { "GLN", "NVR", "KVR" };
		String EC[] = { "NVR", "KVR", "ALN", "NS", "SM" };

		// Get me unique names
		Set<String> names = new HashSet<>();
		List<String> l1 = Arrays.asList(CS);
		List<String> l2 = Arrays.asList(IS);
		List<String> l3 = Arrays.asList(EC);

		names.addAll(l1);
		names.addAll(l2);
		names.addAll(l3);
		System.out.println(names);
		
		Set<String> dept_all_set = new HashSet<>();
		
		// Get me people who are working for all departments
		if (l1.size() < l2.size() && l1.size() < l3.size()) {
			for (String ele : l1) {
				if (l2.contains(ele) && l3.contains(ele)) {
					dept_all_set.add(ele);
				}
			}
		} else if (l2.size() < l3.size()) {
			for (String ele : l2) {
				if (l1.contains(ele) && l3.contains(ele)) {
					dept_all_set.add(ele);
				}
			}
		} else {
			for (String ele : l3) {
				if (l2.contains(ele) && l1.contains(ele)) {
					dept_all_set.add(ele);
				}
			}
		}
		System.out.println(dept_all_set);

	}
}
