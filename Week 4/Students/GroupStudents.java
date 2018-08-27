public class GroupStudents
{
	public static void main(String[] args)
	{
		Student [] group =
		{
			new Student("John", 50),
 			new Student("Abby", 40),
			new Student("Dylan", 20),
		};

		//System.out.println("All students:");
		//allStudents(group);
		//honoursStudents(group);
		//System.out.printf("%d students passed\n", passedStudents(group));
		//System.out.printf("The best student is %s, with a mark of %d\n", bestStudent(group).getName(), bestStudent(group).getMark());
		System.out.println("The average mark of the passing students is " + averageMark(group));
	}


	public static void allStudents(Student[] students)
	{
		for (Student student: students)
		{
			System.out.printf("%s (%d)\n", student.getName(), student.getMark());
		}
	}


	public static void honoursStudents(Student[] students)
	{
		for (Student student: students)
		{
			if (student.getMark() >= 55)
			{
				System.out.printf("%s (%d)\n", student.getName(), student.getMark());
			}
		}
	}


	public static int passedStudents(Student[] students)
	{
		int count = 0;
		for (Student student: students)
		{
			if (student.getMark() >= 40)
			{
				count++;
			}
		}
		return count;
	}


	public static Student bestStudent(Student[] students)
	{
		Student bestStudent = students[0];
		for (Student student: students)
		{
			if (student.getMark() > bestStudent.getMark())
			{
				bestStudent = student;
			}
		}
		return bestStudent;
	}

	public static double averageMark(Student[] students)
	{
		double sum = 0;
		int count = 0;
		for (Student student: students)
		{
			if (student.getMark() >= 40)
			{
				sum += student.getMark();
				count++;
			}
		}
		return sum/count;
	}
}
