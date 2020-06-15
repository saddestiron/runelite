package net.runelite.client.plugins.inferno;


import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import lombok.AccessLevel;
import lombok.Setter;
import static net.runelite.client.plugins.inferno.InfernoWaveMappings.addWaveComponent;

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.plugins.inferno.displaymodes.InfernoWaveDisplayMode;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

@Slf4j
@Singleton
public class InfernoSetTimerOverlay extends Overlay
{
    private final InfernoPlugin plugin;
    private final PanelComponent panelComponent;


    @Setter(AccessLevel.PACKAGE)
    private Color waveHeaderColor =  Color.BLACK;

    @Setter(AccessLevel.PACKAGE)
    private Color waveTextColor =  Color.WHITE;

    @Setter(AccessLevel.PACKAGE)
    private InfernoWaveDisplayMode displayMode;

    @Inject
    InfernoSetTimerOverlay(final InfernoPlugin plugin)
    {
        this.panelComponent = new PanelComponent();
        this.setPosition(OverlayPosition.TOP_RIGHT);
        this.setPriority(OverlayPriority.HIGH);
        this.plugin = plugin;

        panelComponent.setPreferredSize(new Dimension(80, 0));
    }

    public Dimension render(final Graphics2D graphics)
    {
        panelComponent.getChildren().clear();


        panelComponent.getChildren()
                .add(TitleComponent.builder()
                        .text("Set Timer")
                        .color(waveTextColor)
                        .build()
                );

        TitleComponent.TitleComponentBuilder builder = TitleComponent.builder();
        builder.text("Time left: "+ plugin.infernoTimer.getDisplayTime());
        Color waveTextColor =  Color.WHITE;
        if(plugin.infernoTimer.getDisplayTime() < 10) {
            waveTextColor = Color.ORANGE;
        }
        if(plugin.infernoTimer.getDisplayTime() == 0) {
            waveTextColor = Color.RED;
        }

        builder.color(waveTextColor);

        panelComponent.getChildren().add(builder.build());
        return panelComponent.render(graphics);
    }
}
