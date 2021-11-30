package fpc.aoc.day10;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import fpc.aoc.api.AOCProblem;
import fpc.aoc.common.NotSolvedYet;

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




