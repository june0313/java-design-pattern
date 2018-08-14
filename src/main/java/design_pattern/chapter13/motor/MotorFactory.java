package design_pattern.chapter13.motor;

import design_pattern.chapter13.VendorId;

public class MotorFactory {
	public static Motor createMotor(VendorId vendorId) {
		switch (vendorId) {
			case LG:
				return new LGMotor();
			case HYUNDAI:
				return new HyundaiMotor();
			default:
				return null;
		}
	}
}
