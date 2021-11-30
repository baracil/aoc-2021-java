package perococco.aoc.day22;

import lombok.NonNull;
import perococco.aoc.day22.structures.GameExecutor;
import perococco.aoc.day22.structures.GameRules;
import perococco.aoc.day22.structures.GameState;
import perococco.aoc.day22.structures.Score;
import perococco.aoc.input.Converter;
import perococco.aoc.input.SmartSolver;

import java.util.stream.Stream;

public abstract class Day22Solver extends SmartSolver<Stream<String>,String> {

    @Override
    protected @NonNull Converter<Stream<String>> getConverter() {
        return Converter.IDENTITY;
    }
}
