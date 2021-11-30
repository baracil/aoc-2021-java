package perococco.aoc.day14.structures;

public class MemoryPart1 extends AbstractMemory {

    public void setValue(int address, long value) {
        final var effectiveValue = getActiveMask().computeEffectiveValues(value);
        putValueInMemory(address,effectiveValue);
    }

}
