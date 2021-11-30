package perococco.aoc.day16;

import lombok.NonNull;
import perococco.aoc.input.Converter;
import perococco.aoc.input.SmartSolver;

import java.util.stream.Stream;

public abstract class Day16Solver extends SmartSolver<Stream<String>,String> {

    @Override
    protected @NonNull Converter<Stream<String>> getConverter() {
        return Converter.IDENTITY;
    }
}
