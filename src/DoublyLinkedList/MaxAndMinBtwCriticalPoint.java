package DoublyLinkedList;

public class MaxAndMinBtwCriticalPoint {
    public int[] nodesBetweenCriticalPoints(DNode head) {

        // Less than 3 nodes means no critical point
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        DNode prev = head;
        DNode curr = head.next;

        int idx = 1;

        int first = -1;
        int last = -1;

        int minDist = Integer.MAX_VALUE;

        while (curr.next != null) {

            // Check if current node is a critical point
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                    (curr.val < prev.val && curr.val < curr.next.val)) {

                // First critical point
                if (first == -1) {
                    first = idx;
                    last = idx;
                }
                else {

                    // Update minimum distance
                    minDist = Math.min(minDist, idx - last);

                    // Update last critical point
                    last = idx;
                }
            }

            prev = curr;
            curr = curr.next;
            idx++;
        }

        // Less than two critical points
        if (first == last) {
            return new int[]{-1, -1};
        }

        int maxDist = last - first;

        return new int[]{minDist, maxDist};
    }

}
