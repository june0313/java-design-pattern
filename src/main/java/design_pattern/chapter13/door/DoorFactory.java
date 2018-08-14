package design_pattern.chapter13.door;

import design_pattern.chapter13.VendorId;

public class DoorFactory {
	public static Door createDoor(VendorId vendorId) {
		switch (vendorId) {
			case LG:
				return new LGDoor();
			case HYUNDAI:
				return new HyundaiDoor();
			default:
				return null;
		}
	}
}
