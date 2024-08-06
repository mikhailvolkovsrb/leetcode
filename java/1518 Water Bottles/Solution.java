//https://leetcode.com/problems/water-bottles/description/

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int gl = 0;
        int os = 0;
        int sum = numBottles;
        
        while (numBottles >= numExchange) {
            gl = numBottles / numExchange;
            os = numBottles % numExchange;
            numBottles = gl + os;
            sum = sum + gl;
        } 

        return sum;
    }
}