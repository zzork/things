/* As input your function will receive a list of strings representing the yard as a grid, and an integer representing the minimum 
 * distance needed to prevent problems (considering the cats' current states of sleepiness). A point with no cat in it will be 
 * represented by a "-" dash. Lou, Mustache Cat, and Raoul will be represented by an upper case L, M, and R respectively. At any 
 * particular time all three cats may be in the yard, or maybe two, one, or even none.
 *
 * If the number of cats in the yard is one or none, or if the distances between all cats are at least the minimum distance, your 
 * function should return true, but if there are two or three cats, and the distance between at least two of them is smaller than the 
 * minimum distance, your function should return false.
 *
 * For full problem statement and examples see here: https://www.codewars.com/kata/cat-kata-part-1/java
 */

public class PeacefulYard {
    public static boolean peacefulYard(String[] yard, int minDistance) {
        int Lx = -1, Ly = -1, Rx = -1, Ry = -1, Mx = -1, My = -1, cats = 0;
        
        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[0].length(); j++) {
                if (yard[i].charAt(j) == 'L') {
                    Lx = i;
                    Ly = j;
                    cats++;
                }
                else if (yard[i].charAt(j) == 'M') {
                    Mx = i;
                    My = j;
                    cats++;
                }
                else if (yard[i].charAt(j) == 'R') {
                    Rx = i;
                    Ry = j;
                    cats++;
                }
            }
        }
        if (cats <= 1) {
            return true;         
        }
        if (cats == 2) {
            if (Rx == -1) return Math.hypot(Mx - Lx, My - Ly) >= minDistance;
            if (Mx == -1) return Math.hypot(Rx - Lx, Ry - Ly) >= minDistance;
            if (Lx == -1) return Math.hypot(Mx - Rx, My - Ry) >= minDistance;
        }

        return Math.hypot(Mx - Lx, My - Ly) >= minDistance && 
               Math.hypot(Rx - Lx, Ry - Ly) >= minDistance &&
               Math.hypot(Mx - Rx, My - Ry) >= minDistance;
    }
}
