package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Others {

	public static void main(String[] args) {

		Student s1 = new Student("Leo", 9.6);
		Student s2 = new Student("Carlo", 6.6);
		Student s3 = new Student("Joao", 5.2);
		Student s4 = new Student("Kathy", 9.3);
		Student s5 = new Student("Peter", 9);
		Student s6 = new Student("Greg", 7.6);
		Student s7 = new Student("Raila", 8.5);
		Student s8 = new Student("Joao", 5.2);
		Student s9 = new Student("Kathy", 9.3);
		
		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9);
		
		/*Distinct: ignora elementos repetidos. Para sua aplicação
		 * é necessário implementar equals e hashcod na classe 
		 * desejada...*/
		System.out.println("\nDISTINCT:");
		students.stream()
			.distinct()
			.forEach(System.out::println);
		
		/*Skip:  pula n elementos*/
		System.out.println("\nSKIP:");
		students.stream()
			.distinct()
			.skip(2)
			.forEach(System.out::println);
		
		/*Limit: tem como saída somente até os n primeiros elementos*/
		System.out.println("\nLIMIT:");
		students.stream()
			.distinct()
			.skip(2)
			.limit(1)
			.forEach(System.out::println);
		
		/*TakeWhile: Da sequencia na stream enquanto determinada
		 * condição é satisfeita*/
		System.out.println("\nTAKEWHILE:");
		students.stream()
			.distinct()
			.takeWhile( s -> s.grade>=6)
			.forEach(System.out::println);
		
		
	}

}
