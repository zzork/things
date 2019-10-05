/* You are given a node that is the beginning of a linked list. This list always contains a tail and a loop.
 *
 * Your objective is to determine the length of the loop.
 */

import java.util.HashMap;

public class LoopInspector {

  public int loopSize(Node node) {
      HashMap<Node, Integer> nodes = new HashMap<>();
      Node current = node;
      int i = 0;
      while (!nodes.containsKey(current)) {
        nodes.put(current, i);
        current = current.getNext();
        i++;
      }
      return i - nodes.get(current);
  }
}
