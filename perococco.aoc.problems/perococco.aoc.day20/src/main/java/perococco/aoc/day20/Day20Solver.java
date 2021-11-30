package perococco.aoc.day20;

import lombok.NonNull;
import perococco.aoc.day20.structures.ImageArray;
import perococco.aoc.day20.structures.ImageArrayBuilder;
import perococco.aoc.day20.structures.TileParser;
import perococco.aoc.input.Converter;
import perococco.aoc.input.SmartSolver;

import java.util.stream.Stream;

public abstract class Day20Solver extends SmartSolver<Stream<String>,String> {

    @Override
    protected @NonNull Converter<Stream<String>> getConverter() {
        return Converter.IDENTITY;
    }
}
