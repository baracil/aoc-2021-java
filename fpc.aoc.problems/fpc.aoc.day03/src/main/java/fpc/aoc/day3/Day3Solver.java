package fpc.aoc.day3;

import lombok.NonNull;
import fpc.aoc.input.Converter;
import fpc.aoc.input.SmartSolver;

import java.util.stream.Stream;

public abstract class Day3Solver extends SmartSolver<DiagnosticReport, String> {

    @Override
    protected @NonNull Converter<DiagnosticReport> getConverter() {
        return Converter.ALL_LINES.andThen(DiagnosticReport::fromLines);
    }

}
