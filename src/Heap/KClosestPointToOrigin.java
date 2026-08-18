package Heap;

import java.util.PriorityQueue;

class point  implements Comparable<point>{
    int x;
    int y;
    int dist;
    point(int x, int y, int dist){
        this.x = x;
        this.y = y;
        this.dist = x*x + y*y;
    }
    public int compareTo(point p){  // This method tells PriorityQueue
        return this.dist - p.dist; //point with smaller dist
    }
}

public class KClosestPointToOrigin {
    public static void main(String[] args) {
        int [][] points = {{1,3} , {-2,2} , {5,8} , {0,1} };
        int k = 2;  //we need 2 closest points

        PriorityQueue<point> pq = new PriorityQueue<point>();

        for(int[] point : points){ // Add all points to PriorityQueue
            pq.add(new point(point[0], point[1], k)); // point[0] = x point[1] = y
        }
        for(int i = 0 ; i < k ; i++){
            point p = pq.remove(); //when k = 2 then remove with the smallest dist

            System.out.println("(" + p.x + ", " + p.y+ ")");
        }
    }
}
