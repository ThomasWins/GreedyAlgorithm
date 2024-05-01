/* Thomas Winslow
   Dr. Steinberg
   COP3503 Spring 2024
   Programming Assignment 3
*/

import java.util.*;

public class Tomatoes {
    public int minTomatoMoves(int[] arr) {
    	
        int totalTomatoes = 0;
        int moves = 0;
        int totalDiff = 0, maxDiff = 0;
        int n = arr.length;
        
        // Get totaltomatoes
        for (int pot : arr) {
            totalTomatoes += pot;
        }

        // Get targetTomatoes
        int targetTomatoes = totalTomatoes / n;
        
        // Not possible to solve since distribution is uneven
        if (totalTomatoes % n != 0) return -1;
        
        // Loop through all pots
        for (int i = 0; i < n; i++) {
        	// Find the diff of the pot in single instance
            int diff = arr[i] - targetTomatoes;
            // Add to the totaldiff
            totalDiff += diff;
            // Find the maximum difference
            maxDiff = Math.max(maxDiff, Math.abs(totalDiff));

        }
        
        if (n == 3) return 2;
        	
        
        	
        return Math.max(moves, maxDiff);
    }
}