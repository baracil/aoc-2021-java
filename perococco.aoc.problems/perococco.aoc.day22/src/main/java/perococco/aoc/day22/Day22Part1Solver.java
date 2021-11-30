package perococco.aoc.day22;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.day22.structures.CrabCombatRules;
import perococco.aoc.day22.structures.GameRules;

import java.util.stream.Stream;

public class Day22Part1Solver extends Day22Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day22Part1Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }

}
