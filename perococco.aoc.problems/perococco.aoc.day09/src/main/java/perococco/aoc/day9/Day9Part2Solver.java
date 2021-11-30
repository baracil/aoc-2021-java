package perococco.aoc.day9;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;

import java.util.stream.Stream;

@RequiredArgsConstructor
public class Day9Part2Solver extends Day9Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day9Part2Solver().createProblem().skipped();
    }


    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}
