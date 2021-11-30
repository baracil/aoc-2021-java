package perococco.aoc.day22;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.day22.structures.GameRules;
import perococco.aoc.day22.structures.RecursiveCombatRules;

import java.util.stream.Stream;

public class Day22Part2Solver extends Day22Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day22Part2Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}
