package perococco.aoc.day25;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.input.Converter;
import perococco.aoc.input.SmartSolver;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.stream.Stream;

public class Day25Part1Solver extends Day25Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day25Part1Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }

}
