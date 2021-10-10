package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	/*Diferentemente do map, o filter não
	 * gera uma lista do mesmo tamanho */
	public static void main(String[] args) {

		Student s1 = new Student("Leo", 9.6);
		Student s2 = new Student("Carlo", 6.6);
		Student s3 = new Student("Joao", 6.2);
		Student s4 = new Student("Kathy", 9.3);
		Student s5 = new Student("Peter", 10);
		Student s6 = new Student("Greg", 7.6);

		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6);
		
		/*Formas de fazer*/
		Predicate<Student> approved = 
				s -> s.grade >= 7;
		Function<Student, String> msg =
				s -> s.name + " was approved!";
		
		/*
		students.stream()
			.filter(s -> s.grade >=7)
			.map(a -> a.name + " was approved!")
			.forEach(System.out::println);
		 */
		
		students.stream()
			.filter(approved)
			.map(msg)
			.forEach(System.out::println);
	}
}
