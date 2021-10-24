package generics;

import java.util.Arrays;
import java.util.List;

public class TestListUtil {
	public static void main(String[] args) {
		
		List<String> musicNotes = 
				Arrays.asList("Dó","Ré","Mi","Fá","Sol","Lá","Si");
		List<Integer> num = 
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/*One way*/
		String lastNote1 = (String) ListUtil.getLast1(musicNotes);
		System.out.println(lastNote1);
		
		Integer lastNum1 = (Integer) ListUtil.getLast1(num);
		System.out.println(lastNum1);
		
		/*Better way*/
		String lastNote2 = ListUtil.getLast2(musicNotes);
		System.out.println(lastNote2);
		
		Integer lastNum2 = ListUtil.getLast2(num);
		System.out.println(lastNum2);
	}
}
