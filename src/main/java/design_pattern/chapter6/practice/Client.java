package design_pattern.chapter6.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wayne on 2016. 6. 14..
 */
public class Client {
	private static final int THREAD_NUM = 6;

	public static void main(String[] args) {
		List<UserThread> userThreads = new ArrayList<>();

		for (int i = 0; i < THREAD_NUM; i++) {
			userThreads.add(new UserThread(i + 1 + "-thread"));
			userThreads.get(i).start();
		}
	}
}