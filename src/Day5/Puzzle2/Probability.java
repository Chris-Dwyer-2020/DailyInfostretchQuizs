package Day5.Puzzle2;

import java.util.ArrayList;
import java.util.Vector;

public class Probability {

    public static float findProbability(ArrayList<Pairs>[] markovChain, int numStates,
                                        char finishState, char startState, int time){

        float[][] P = new float[numStates + 1][time + 1];
        P[startState][0] = (float) 1.0;

        for ( int i = 1; i <= time; ++i)
            for ( int j = 1; j <= time; ++j)
                for (Pairs k : markovChain[j])
                    P[j][i] += k.getSecondState() * P[k.getFirstState()][i - 1];

        return P[finishState][time];
    }
}
