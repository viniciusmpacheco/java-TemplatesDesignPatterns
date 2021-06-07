package patterns.structural.bridge.dao;

import patterns.structural.bridge.model.User;

public class UserMongoDao implements UserDao{
	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Mongo Database!");
	}
}
