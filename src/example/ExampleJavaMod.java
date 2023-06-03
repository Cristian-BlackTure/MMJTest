package example;

import example.content.*;
import arc.Events;
import mindustry.game.EventType.FileTreeInitEvent;
import mindustry.mod.Mod;

public class ExampleJavaMod extends Mod {
	public ExampleJavaMod() {
		Events.on(FileTreeInitEvent.class, e -> Sfx.load());
	}

	@Override
	public void loadContent() {
        ACMBlocks.load();

	}
}