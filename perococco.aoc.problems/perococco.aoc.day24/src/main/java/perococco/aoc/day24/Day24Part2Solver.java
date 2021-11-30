package perococco.aoc.day24;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.CellState;
import perococco.aoc.common.GameOfLife;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.day24.structures.Path;

import java.util.stream.Stream;

public class Day24Part2Solver extends Day24Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day24Part2Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }

}
