/* The challenge is to create a simple assembler interpreter.
 *
 * The full explanaton can be viewed here: https://www.codewars.com/kata/58e24788e24ddee28e000053
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class SimpleAssembler {
  public static Map<String, Integer> interpret(String[] program){
    System.out.println(Arrays.toString(program));
    HashMap<String, Integer> map = new HashMap<>();
    
    for (int i = 0; i < program.length; i++) {
      String[] command = program[i].split(" ");
      
      if (command[0].equals("mov")) {
        map.put(command[1], (Character.isDigit(command[2].charAt(0)) || command[2].charAt(0) == '-')
            ? Integer.parseInt(command[2]) : map.get(command[2]));
      }
      else if (command[0].equals("jnz")) {
        if ((map.containsKey(command[1]) && map.get(command[1]) != 0)
            || !map.containsKey(command[1]) && !command[1].equals("0")) {
          int jump = Integer.parseInt(command[2]);
          //if the jump is going backwards we need to counter i incrementing at the start of the loop
          jump--;
          i += jump;
         }
      }
      else if (command[0].equals("inc")) map.put(command[1], map.get(command[1]) + 1);
      else if (command[0].equals("dec")) map.put(command[1], map.get(command[1]) - 1);
      //System.out.println(Arrays.toString(command));
      //System.out.println(map.keySet());
      //System.out.println(map.values());
    }
    return map;
  }
}
