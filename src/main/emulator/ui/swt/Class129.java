package emulator.ui.swt;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

final class Class129 extends SelectionAdapter {
	private final MemoryView aClass110_1212;

	Class129(final MemoryView aClass110_1212) {
		super();
		this.aClass110_1212 = aClass110_1212;
	}

	public final void widgetSelected(final SelectionEvent selectionEvent) {
		MemoryView.method647(this.aClass110_1212);
	}
}
