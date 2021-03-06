package net.zhuoweizhang.mcpelauncher;

public final class MinecraftConstants {

	public static final int LIB_LOAD_OFFSET_BEGIN = 0x1bf410;

	public static final int LIB_LOAD_OFFSET = 0x1000;

	public static final byte[] GUI_BLOCKS_PATCH = {
  (byte) 0xff, 0x50, 0x54, 0x50, 0x00, 0x02, 0x00, 0x00, 0x00, 0x1c, 0x00, 0x00,
  0x00, 0x26, 0x4d, 0x61, 0x64, 0x65, 0x20, 0x62, 0x79, 0x20, 0x35, 0x30,
  0x30, 0x49, 0x53, 0x45, 0x00, 0x10, 0x65, (byte) 0xb0, 0x4f, (byte) 0xf0, (byte) 0xff, 0x30,
  0x70, 0x47, 0x00, 0x10, 0x70, 0x6a, 0x00, (byte) 0xbf, 0x00, (byte) 0xbf
	};

}
