package design_pattern.chapter6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wayne on 2016. 6. 11..
 */
public class Main {
	private static final int USER_NUM = 5;
	private static final int THREAD_NUM = 5;

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();

//		for (int i = 0; i < USER_NUM; i++) {
//			users.add(new User(i + 1 + "-user"));
//			users.get(i).print();
//		}

		List<UserThread> userThreads = new ArrayList<>();

		for (int i = 0; i < THREAD_NUM; i++) {
			userThreads.add(new UserThread(i + 1 + "-thread"));
			userThreads.get(i).start();
		}
	}
}
