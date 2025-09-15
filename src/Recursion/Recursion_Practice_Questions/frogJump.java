package Recursion.Recursion_Practice_Questions;

public class frogJump {
    static int minimumCost(int[] cost, int idx) {
        if (idx == cost.length - 1)
            return 0;

        int way1 = Math.abs(cost[idx] - cost[idx + 1]) + minimumCost(cost, idx + 1);

        if (idx == cost.length - 2) // because at this stone there is only one option
            return way1;

        int way2 = Math.abs(cost[idx] - cost[idx + 2]) + minimumCost(cost, idx + 2);
        return Math.min(way1, way2);
    }

    public static void main(String[] args) {
        int[] cost = { 10, 30, 40, 20 };
        System.out.println("Minimum Cost: " + minimumCost(cost, 0));
    }
}
