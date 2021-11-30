package perococco.aoc.day17;

import lombok.NonNull;
import perococco.aoc.common.ArrayOfChar;
import perococco.aoc.common.GameOfLife;
import perococco.aoc.input.Converter;
import perococco.aoc.input.SmartSolver;

import java.util.stream.Stream;

public abstract class Day17Solver extends SmartSolver<Stream<String>,String> {

    @Override
    protected @NonNull Converter<Stream<String>> getConverter() {
        return Converter.IDENTITY;
    }
}
