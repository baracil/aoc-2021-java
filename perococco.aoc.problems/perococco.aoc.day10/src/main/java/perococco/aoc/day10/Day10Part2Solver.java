package perococco.aoc.day10;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.day10.structures.LinearCounter;
import perococco.aoc.day10.structures.Part2Counter;
import perococco.aoc.day10.structures.RecursiveCounter;

import java.util.stream.Stream;

@RequiredArgsConstructor
public class Day10Part2Solver extends Day10Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day10Part2Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}




