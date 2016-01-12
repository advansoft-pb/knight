package com.borel.knight;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

    private PrintStream out;

    public SlayDragonQuest(PrintStream out) {
        this.out = out;
    }

    public void embark() {
        out.println("Embarking on quest to slay the dragon!");
    }
}
