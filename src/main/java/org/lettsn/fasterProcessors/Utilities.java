package org.lettsn.fasterProcessors;

import mindustry.content.Blocks;
import mindustry.world.blocks.logic.LogicBlock;

public class Utilities {
    public static void setSpeedAll(Integer speed) {
        ((LogicBlock) Blocks.microProcessor).instructionsPerTick = speed;
        ((LogicBlock) Blocks.logicProcessor).instructionsPerTick = speed;
        ((LogicBlock) Blocks.hyperProcessor).instructionsPerTick = speed;
    }
}
