package fi.arcada.codechallenge;

import java.util.ArrayList;

public class Statistic {


    public double calcMean(ArrayList<Double> values){

        double sum = 0;

        for (double value : values){
            sum += value;
        }

        return sum/values.size();
    }
}
