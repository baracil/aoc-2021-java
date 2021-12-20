package fpc.aoc.day19;

import com.google.common.collect.ImmutableList;
import fpc.aoc.day19.struct.Report;
import lombok.NonNull;
import fpc.aoc.api.AOCProblem;
import fpc.aoc.common.NotSolvedYet;

import java.util.stream.Stream;

public class Day19Part2Solver extends Day19Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day19Part2Solver().createProblem().skipped();
    }

    @Override
    public @NonNull Integer solve(@NonNull ImmutableList<Report> input) {
        throw new NotSolvedYet();
    }
}
