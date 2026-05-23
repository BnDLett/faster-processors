package org.lettsn.fasterProcessors.ui;

import arc.scene.ui.Label;
import arc.scene.ui.Slider;
import arc.scene.ui.layout.Table;
import mindustry.Vars;
import mindustry.gen.Tex;

import static org.lettsn.fasterProcessors.Utilities.setSpeedAll;

public class SpeedControl {
    public static void load() {
        Table speedTable = new Table();

        Label speedLabel = new Label("16 ipt");

        Slider speedSlider = new Slider(1, 8, 1, false);
        speedSlider.moved(value -> {
            int speed = (int) Math.pow(2, value);
            setSpeedAll(speed);
            speedLabel.setText(speed + " ipt");
        });
        speedSlider.setValue(4);

        speedTable.table(Tex.buttonEdge3, t -> {
            t.add(speedSlider).minWidth(400);
            t.add(speedLabel).padLeft(50);
        });

        speedTable.bottom().left();
        speedTable.visible = true;

        Vars.ui.hudGroup.addChild(speedTable);
    }
}
