package fpc.aoc.day12.struct;

import lombok.NonNull;

public interface RecursiveMode {
    void onEntering(@NonNull Node position);
    boolean canVisit(@NonNull Node connection);
    void onLeaving(@NonNull Node position);
}
