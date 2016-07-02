package greedyalgo;

import java.util.*;

public class CoveringSegments {

    private static int[] optimalPoints(Segment[] segments) {
        //write your code here
        //return points;
        Segment minRight = getMinRight(segments);
        int[] points = new int[segments.length];
        points[0] = minRight.end;
        int i = 0;
        for(Segment s : segments) {
        	if((s.start <= minRight.end) && (s.end >= minRight.end)) {
        		System.out.println(minRight.end + " is present on " + s.toString());
        		continue;        		
        	} else {
        		points[i+1] = s.end;
        		minRight = s;
        	}
        	
        }
        
        
        return points;
    }

    private static Integer[] intersect(Segment min, int[] points) {
    	List<Integer> l = new ArrayList<Integer>();
    	for(int i=0; i< points.length; ) {
    		if(points[i] <= min.end) {
    		    points[i] = -1;
    		    points[i+1] = -1;
    		}
    		i = (i+2);
    	}
    	
    	
    	return l.toArray(new Integer[] {});
    }
    
    
    private static Segment getMinRight(Segment[] segments) {
    	Segment s = segments[0];
    	for(Segment ss : segments) {
    		if(ss.end < s.end) {
    			s = ss;
    		}
    	}
    	return s;
	}

	private static class Segment {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
        
        @Override
        public String toString() {
        	return "["+start+","+end+"]";
        }
        
    }
    public static void main(String[] args) {
    	System.out.println("Enter number of lines");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        System.out.println("Enter segment points");
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        int[] points = optimalPoints(segments);
        //System.out.println(points.length);
        for (int point : points) {
        	if(0!=point)
            System.out.print(point + " ");
        }
    }
}
 
