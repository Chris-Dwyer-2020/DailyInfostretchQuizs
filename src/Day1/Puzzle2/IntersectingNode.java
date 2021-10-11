package Day1.Puzzle2;

import java.util.HashSet;
import java.util.Set;
public class IntersectingNode {
    public static IntegerNode findIntersectingNode(IntegerNode headIntegerNodeListA,
                                                   IntegerNode headIntegerNodeListB) {
        Set<IntegerNode> integerVisited = new HashSet<>();
        while(headIntegerNodeListA != null) {
            integerVisited.add(headIntegerNodeListA);
            headIntegerNodeListA = headIntegerNodeListA.getNext();
        }

        while(headIntegerNodeListB != null) {
            if(integerVisited.contains(headIntegerNodeListB)){
                return headIntegerNodeListB;
            }
            headIntegerNodeListB = headIntegerNodeListB.getNext();
        }
        return null;
    }
}
