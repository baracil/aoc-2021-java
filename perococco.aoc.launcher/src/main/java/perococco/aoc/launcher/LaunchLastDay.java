package perococco.aoc.launcher;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import perococco.aoc.api.Day;
import perococco.aoc.launcher._private.Launcher;
import perococco.aoc.launcher._private.ProblemService;

@RequiredArgsConstructor
public class LaunchLastDay {

    public static void main(String[] args) {
        ProblemService.findLastDay()
                      .map(LaunchLastDay::new)
                      .ifPresentOrElse(LaunchLastDay::launch, () -> System.err.println("No problem found"));

    }

    private final @NonNull Day day;

    public void launch() {
        ProblemService.listProblemsOfADay(day)
                      .forEach(Launcher::launch);
    }

}

