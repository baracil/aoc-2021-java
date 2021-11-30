package perococco.aoc.day19;

import lombok.NonNull;
import perococco.aoc.day19.structures.Day19Input;
import perococco.aoc.day19.structures.Tester;
import perococco.aoc.input.Converter;
import perococco.aoc.input.SmartSolver;

import java.util.stream.Stream;

public abstract class Day19Solver extends SmartSolver<Stream<String>,String> {

    @Override
    protected @NonNull Converter<Stream<String>> getConverter() {
        return Converter.IDENTITY;
    }
}
