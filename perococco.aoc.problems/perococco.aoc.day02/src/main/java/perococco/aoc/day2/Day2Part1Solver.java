package perococco.aoc.day2;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;

import java.util.stream.Stream;

public class Day2Part1Solver extends Day2Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day2Part1Solver().createProblem().skipped();
    }


    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }

}
