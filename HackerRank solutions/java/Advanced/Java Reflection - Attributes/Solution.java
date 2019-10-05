/* In this problem, you will be given a class Solution in the editor. You have to fill in the incompleted lines so that it prints all the 
 * methods of another class called Student in alphabetical order. We will append your code with the Student class before running it.
 */

public class Solution {

        public static void main(String[] args){
            Class student = Student.class;
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method method : methods){
                methodList.add(method.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }
