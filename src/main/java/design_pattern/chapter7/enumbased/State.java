package design_pattern.chapter7.enumbased;

public enum State {
	ON {
		@Override
		public void onButtonPushed(Light light) {
			System.out.println("취침등 상태");
			light.setState(SLEEPING);
		}

		@Override
		public void offButtonPushed(Light light) {
			System.out.println("Light Off");
			light.setState(OFF);
		}
	},
	OFF {
		@Override
		public void onButtonPushed(Light light) {
			System.out.println("Light On");
			light.setState(ON);
		}

		@Override
		public void offButtonPushed(Light light) {
			System.out.println("noAction");
		}
	},
	SLEEPING {
		@Override
		public void onButtonPushed(Light light) {
			System.out.println("Light On");
			light.setState(ON);
		}

		@Override
		public void offButtonPushed(Light light) {
			System.out.println("Light Off");
			light.setState(OFF);
		}
	};

	public abstract void onButtonPushed(Light light);
	public abstract void offButtonPushed(Light light);
}
