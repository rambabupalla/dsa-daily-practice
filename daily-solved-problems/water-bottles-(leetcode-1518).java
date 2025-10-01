class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;

        while(empty>=numExchange){
            int refilled = empty/numExchange;
            int remain = empty%numExchange;
            total += refilled;
            empty = refilled+remain;
        }
        return total;
    }
}