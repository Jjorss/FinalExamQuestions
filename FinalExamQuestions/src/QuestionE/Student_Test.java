package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Y", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Jack", "Jorss", "H", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu3 = new Student("Jill", "God", "F", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu4 = new Student("Bob", "Santa", "F", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu5 = new Student("Berry", "G", "S", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");

		HashMap<UUID, Student> hMap = new HashMap();
		hMap.put(stu1.getPersonID(), stu1);
		hMap.put(stu2.getPersonID(), stu1);
		hMap.put(stu3.getPersonID(), stu1);
		hMap.put(stu4.getPersonID(), stu1);
		hMap.put(stu5.getPersonID(), stu1);
		
		assertTrue(hMap.size() == 5);
	}

}
