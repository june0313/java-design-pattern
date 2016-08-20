package design_pattern.chapter6.static_class;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wayne on 2016. 6. 14..
 */
public class Main {
	private static final int THREAD_NUM = 5;
	public static void main(String[] args) {
		List<UserThread> userThreads = new ArrayList<>();

		for (int i = 0; i < THREAD_NUM; i++) {
			userThreads.add(new UserThread(i + 1 + "-thread"));
			userThreads.get(i).start();
		}
	}
}
