package perococco.aoc.day20;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.common.Tools;
import perococco.aoc.day20.structures.ImageArray;
import perococco.aoc.day20.structures.ImageTile;

import java.util.stream.Stream;

public class Day20Part1Solver extends Day20Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day20Part1Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }

}
