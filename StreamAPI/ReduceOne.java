package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceOne {

  public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    BinaryOperator<Integer> sum = (ac, n) -> ac + n;

    /*Sem valor identidade e com retorno int primitivo */
    int total1 = nums.parallelStream().reduce(sum).get();
    System.out.println(total1);

    /*Com valor inicial identidade e considenrado
     * possibilidade do resultado ser Optional<Integer>
     * OBS: A existencia do valor inicial garante a o retorno
     * de um inteiro*/
    Integer total2 = nums.stream().reduce(100, sum);
    System.out.println(total2);
    
    /*Obs: no caso de um parallel stream ele aplica
     * o valor identidade em todos os elementos
     * ou seja, somaria 100 em cada iteração com 
     * os elementos*/
    Integer testeTotal2 = nums.parallelStream().reduce(100, sum);
    System.out.println(testeTotal2);
    
    /*Aplicação com filter e "ifPresent" para verificar
     * a existencia do Optional<Integer>*/
    nums.stream()
      .filter(n -> n>3)
      .reduce(sum)
      .ifPresent(System.out::println);
  }

}
