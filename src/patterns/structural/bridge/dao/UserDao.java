package patterns.structural.bridge.dao;

import patterns.structural.bridge.model.User;

public interface UserDao {
	void save(User user);
}
