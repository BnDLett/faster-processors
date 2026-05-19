package org.lettsn.fasterProcessors;

import arc.Events;
import mindustry.Vars;
import mindustry.game.EventType;
import mindustry.ui.Menus;

import static org.lettsn.fasterProcessors.Utilities.setSpeedAll;

public class EventHooks {
    public static void load() {
        Events.on(EventType.ClientLoadEvent.class, (e) -> {
            Menus.infoMessage("The Faster Processors mod is enabled. Keep in mind that this mod could potentially " +
                    "desync you from a server. Furthermore, it could cause significant performance reduction on your " +
                    "device. [scarlet]It is highly recommended that you disable it if you are not willing to risk either " +
                    "of those. [orange]And remember: faster is not always better.");
        });

        Events.on(EventType.WorldLoadEndEvent.class, (e) -> {
//            Vars.player.sendMessage("[orange]Setting all processors to 25 (same speed as hyper-processor).");
            Menus.announce("[orange]Setting all processors to 15 (faster than logic-processor, slower than hyper).");
            setSpeedAll(25);
        });
    }
}
