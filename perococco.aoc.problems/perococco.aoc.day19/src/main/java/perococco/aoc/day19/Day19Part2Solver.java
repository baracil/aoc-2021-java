package perococco.aoc.day19;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.day19.structures.Day19Input;
import perococco.aoc.day19.structures.Or;

import java.util.Map;
import java.util.stream.Stream;

import static perococco.aoc.day19.structures.Concatenation.concatenation;
import static perococco.aoc.day19.structures.Or.or;

public class Day19Part2Solver extends Day19Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day19Part2Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }

}
