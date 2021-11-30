package perococco.aoc.day15;

import lombok.NonNull;
import perococco.aoc.input.Converter;
import perococco.aoc.input.SmartSolver;

import java.util.Arrays;
import java.util.stream.Stream;

public abstract class Day15Solver extends SmartSolver<Stream<String>,String> {

    @Override
    protected @NonNull Converter<Stream<String>> getConverter() {
        return Converter.IDENTITY;
    }
}
