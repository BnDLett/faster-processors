package org.lettsn.fasterProcessors;

import arc.util.CommandHandler;
import mindustry.content.Blocks;
import mindustry.gen.Player;
import mindustry.ui.Menus;
import mindustry.world.blocks.logic.LogicBlock;

import static org.lettsn.fasterProcessors.Utilities.setSpeedAll;

public class Commands {
    public static void load(CommandHandler handler) {
        handler.<Player>register("set-speed", "<speed>", "Sets the speed of all processors.", (args, _) -> {
            int speed = Integer.parseInt(args[0]);
            if (speed < 0) {
                Menus.infoMessage("[scarlet]Cannot set speed below zero.");
                return;
            }

            setSpeedAll(speed);
            Menus.announce(String.format("Set speed to %d", speed));
        });

        handler.<Player>register("reset", "Resets all processors back to their default.", (args, _) -> {
            ((LogicBlock) Blocks.microProcessor).instructionsPerTick = 2;
            ((LogicBlock) Blocks.logicProcessor).instructionsPerTick = 8;
            ((LogicBlock) Blocks.hyperProcessor).instructionsPerTick = 25;

            Menus.announce("Speeds are reset back to default values.");
        });
    }
}
