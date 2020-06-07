package com.nubes.cj.day9;

import java.util.Arrays;

public class SearchArrayElements {

		public static void main(String[] args) {
//			String[] CS = {"GLN","ALN"};
//			String[] IS = {"GLN","ALN","GVR","GMR"};
//			String[] EC = {"RVR","MVR","KVR","PVR"};
//
//			String[] arr = new String[CS.length + IS.length + EC.length];
//			
//			int i = 0;
//			for(String name:CS) {
//				arr[i++] = name;
//			}
//	
//			for(String name:IS) {
//				arr[i++] = name;
//			}
//			for(String name:EC) {
//				arr[i++] = name;
//			}
//			System.out.println(Arrays.toString(arr));
			
			
			String[] CS = {"GLN","ALN","PVR","GVR"};
			String[] IS = {"GLN","ALN","GVR","GMR"};
			String[] EC = {"RVR","MVR","KVR","PVR"};

			String[][] arr = new String[][] {CS,IS,EC};
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			
		}
}
