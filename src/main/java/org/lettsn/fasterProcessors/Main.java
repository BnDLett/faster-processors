package org.lettsn.fasterProcessors;

import arc.util.CommandHandler;
import mindustry.mod.Mod;

public class Main extends Mod {
    @Override
    public void init() {
        EventHooks.load();
    }
}
