/* HackerLand University has the following grading policy:
 *
 *     1. Every student receives a grade in the inclusive range from 0 to 100.
 *     2. Any grade less than 40 is a failing grade.
 *
 * Sam is a professor at the university and likes to round each student's grade according to these rules:
 *
 *     1. If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
 *     2. If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
 *   
 * For example, grade = 84 will be rounded to 85 but grade = 29 will not be rounded because the rounding would result in a number that 
 * is less than 40.
 *
 * Given the initial value of grade for each of Sam's  students, write code to automate the rounding process.
 */
 
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        ArrayList<Integer> results = new ArrayList<Integer>();

        for (int grade : grades) {
            if (grade < 38) results.add(grade);
            else {
                int remainder = grade % 5;
                if (remainder >= 3) grade += (5 - remainder);
                results.add(grade);
            }
        }
        return results;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
