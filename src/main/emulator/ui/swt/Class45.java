package emulator.ui.swt;

import emulator.Emulator;
import emulator.Settings;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

final class Class45 extends SelectionAdapter {
	private final int anInt782;

	Class45(final EmulatorScreen class93, final int anInt782) {
		super();
		this.anInt782 = anInt782;
	}

	public final void widgetSelected(final SelectionEvent selectionEvent) {
		Settings.recordedKeysFile = null;
		Emulator.loadGame(Settings.recentJars[this.anInt782], false);
	}
}
