package fpc.aoc.day2;

import fpc.aoc.common.SubCommand;
import fpc.aoc.common.Submarine;
import lombok.NonNull;
import fpc.aoc.input.Converter;
import fpc.aoc.input.SmartSolver;
import lombok.RequiredArgsConstructor;

import java.util.function.BiFunction;
import java.util.stream.Stream;

@RequiredArgsConstructor
public abstract class Day2Solver extends SmartSolver<Stream<SubCommand>, Long> {

    private final @NonNull BiFunction<Submarine, ? super SubCommand,Submarine> commandExecutor;

    @Override
    protected @NonNull Converter<Stream<SubCommand>> getConverter() {
        return s -> s.map(SubCommand::parse);
    }

    @Override
    public @NonNull Long solve(@NonNull Stream<SubCommand> input) {
        final Submarine finalPosition = input.sequential()
                                             .reduce(
                                                     Submarine.startPosition(),

                                                     commandExecutor,
                                                     (s1, s2) -> {
                                                         throw new UnsupportedOperationException();
                                                     });

        return (long) (finalPosition.horizontal() * finalPosition.depth());

    }

}
