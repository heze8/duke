package duke.bin.task;

import duke.bin.Time;

public class Deadline extends Task {
    protected Time time;

    public Deadline(String task, Time time) {
        super(task);
        this.time = time;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + time + ")";
    }
}

