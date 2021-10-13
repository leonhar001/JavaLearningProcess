package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		/*Os métodos Match disponíveis em Stream podem ser usadas para
		 * verificação de listas. 
		 * São compostas por 3 funções terminadoras:
		 * allMatch()
		 * anyMatch()
		 * noneMatch()
		 * */
		
		Student s1 = new Student("Leo", 9.6);
		Student s2 = new Student("Carlo", 6.6);
		Student s3 = new Student("Joao", 5.2);
		Student s4 = new Student("Kathy", 9.3);
		Student s5 = new Student("Peter", 10);
		Student s6 = new Student("Greg", 7.6);

		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6);
	  
		Predicate<Student> approved = s -> s.grade >=7;
		
		/*Verificar se todos os estudantes da lista respeitam
		 * a relação do predicado approved
		 * Todos foram aprovados?*/
		System.out.println(students.stream().allMatch(approved));
		
		/*Verificar se pelo menos um estudante da lista respeitam
		 * a relação do predicado approved
		 * Alguém foi aprovado?*/
		System.out.println(students.stream().anyMatch(approved));
		
		/*Verificar se nenhum estudante da lista respeitam
		 * a relação do predicado approved
		 * Ninguém foi aprovado?*/
		System.out.println(students.stream().noneMatch(approved));

	}

}
