package aoc;

import aoc.days.Day01;

public class AdventOfCode2022Solutions {
    public static void main(String[] args) {
        try {
            AdventOfCode2022Solutions.solveAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    private static void solveAll() throws Exception {
        System.out.println("Advent of Code 2022 solutions:");

        System.out.println(" > Solution 1 to day 01: " + Day01.solvePart1());
        System.out.println(" > Solution 2 to day 01: " + Day01.solvePart2());
    }
}
