package kr.co.thirdparty.common.service;

import kr.co.thirdparty.common.domain.Users;

public interface UserService {
	public Users getUser(Users user);
	public Users insertUser(Users user);
}
