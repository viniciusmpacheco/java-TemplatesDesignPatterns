package patterns.structural.bridge.services;

import patterns.structural.bridge.dao.UserDao;
import patterns.structural.bridge.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
