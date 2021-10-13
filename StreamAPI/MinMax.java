package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
public class MinMax {

	public static void main(String[] args) {

		Student s1 = new Student("Leo", 9.6);
		Student s2 = new Student("Carlo", 6.6);
		Student s3 = new Student("Joao", 5.2);
		Student s4 = new Student("Kathy", 9.3);
		Student s5 = new Student("Peter", 9);
		Student s6 = new Student("Greg", 7.6);

		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6);
	    
		/*Comparator é utilizado para...(PASMEM!) comparar
	     * dois objetos.*/
		Comparator<Student> bestGrades = (sx, sy) -> {
			if(sx.grade > sy.grade) return 1;
			if(sx.grade < sy.grade) return -1;
			return 0;
		};
		
		/*Melhor nota? Usa-se o método max*/
		System.out.println(students.stream().max(bestGrades));
		
		/*Pior nota? Usa-se o método min*/
		System.out.println(students.stream().min(bestGrades));
		
		/*Nota-se que, após criado o critério de avaliação
		 * do melhor aluno não é necessário definir 
		 * novanente para se descobrir o pior*/
		
	}

}
