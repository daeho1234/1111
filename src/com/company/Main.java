package com.company;

public class Main {

    public static void main(String[] args) {

        SimulatedAnnealing sa = new SimulatedAnnealing(1, 0.99, 1000);
        sa.solve(new Problem() {
            @Override
            public double fit(double x) {
                return 0.4*x + 109.33;
            }

            @Override
            public boolean isNeighborBetter(double f0, double f1) {
                return f1 < f0;
            }
        }, 1, 12);

        System.out.println(sa.hist);
    }
}
