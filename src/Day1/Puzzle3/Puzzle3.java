package Day1.Puzzle3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Puzzle3 {
    public static int meetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing((int[] itv) -> itv[0]));
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int count = 0;
        for (int[] itv : intervals) {
            if (heap.isEmpty()) {
                count++;
                heap.offer(itv[1]);
            } else {
                if (itv[0] >= heap.peek()) {
                    heap.poll();
                } else {
                    count++;
                }
                heap.offer(itv[1]);
            }
        }
        return count;
    }
}


