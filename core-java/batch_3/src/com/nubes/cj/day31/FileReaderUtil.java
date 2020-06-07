package com.nubes.cj.day31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class FileReaderUtil {

	private static final String filePath = "empdata.txt";

	private FileReaderUtil() {

	}

	public static List<Employee> getEmployeesFromFile() {
		List<Employee> empList = null;
		try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
			List<String> dataList = lines.collect(Collectors.toList());
			empList = convertStrToListObject(dataList);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return empList;

	}

	private static List<Employee> convertStrToListObject(List<String> dataList) {
		List<Employee> empList = new ArrayList<Employee>();
		for (String data : dataList) {
			int i = 0;
			String arr[] = data.split(",");
			int empno = Integer.parseInt(arr[i++]);
			String name = arr[i++];
			float salary = Float.parseFloat(arr[i++]);
			Dept dept = Dept.valueOf(arr[i++]);
			Employee emp = Employee.builder().empno(empno).name(name).salary(salary).dept(dept).build();
			empList.add(emp);
		}
		return empList;
	}

}
