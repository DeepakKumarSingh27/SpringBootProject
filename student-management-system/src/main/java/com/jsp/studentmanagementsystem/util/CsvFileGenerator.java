package com.jsp.studentmanagementsystem.util;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.stereotype.Component;

import com.jsp.studentmanagementsystem.entity.Student;

@Component
public class CsvFileGenerator {
	public void writeStudentsToCsv(List<Student> students, Writer writer) {
		try {

			CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
			for (Student student : students) {
				printer.printRecord(student.getStudentId(),student.getStudentName(),student.getStudentEmail()
						,student.getStudentPhNo());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}