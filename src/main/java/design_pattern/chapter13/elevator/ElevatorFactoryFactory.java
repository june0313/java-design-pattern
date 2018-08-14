package design_pattern.chapter13.elevator;

import design_pattern.chapter13.VendorId;

public class ElevatorFactoryFactory {
	public static ElevatorFactory getFactory(VendorId vendorId) {
		switch (vendorId) {
			case LG:
				return LGElevatorFactory.getInstance();
			case HYUNDAI:
				return HyundaiElevatorFactory.getInstance();
			case SAMSUNG:
				return SamsungElevatorFactory.getInstance();
			default:
				return null;
		}
	}
}
