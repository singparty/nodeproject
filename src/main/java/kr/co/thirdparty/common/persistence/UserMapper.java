package kr.co.thirdparty.common.persistence;

import org.apache.ibatis.annotations.Mapper;

import kr.co.thirdparty.common.domain.Users;

@Mapper
public interface UserMapper {
	public Users getUser(Users user);
	public Users insertUser(Users user);
}
