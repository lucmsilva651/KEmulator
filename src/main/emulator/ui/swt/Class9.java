package emulator.ui.swt;

import java.util.Comparator;

final class Class9 implements Comparator {
	private final int a;
	private final MemoryView mv;

	Class9(final MemoryView aClass110_566, final int anInt565) {
		super();
		this.mv = aClass110_566;
		this.a = anInt565;
	}

	public final int compare(final Object var1, final Object var2) {
		int var10000;
		int var3;
		label20:
		{
			var3 = 0;
			int var10001;
			switch (this.a) {
				case 0:
					var10000 = ((String) var1).compareTo((String) var2);
					break label20;
				case 1:
					var10000 = this.mv.memoryMgr.method866(var1);
					var10001 = this.mv.memoryMgr.method866(var2);
					break;
				case 2:
					var10000 = this.mv.memoryMgr.method867(var1);
					var10001 = this.mv.memoryMgr.method867(var2);
					break;
				default:
					return mv.getTheTable().getSortDirection() == 128 ? var3 : -var3;
			}

			var10000 -= var10001;
		}

		var3 = var10000;
		return mv.getTheTable().getSortDirection() == 128 ? var3 : -var3;

	}
}
