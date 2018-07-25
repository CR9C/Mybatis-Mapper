package io.github.cr9c.hello.mapper;

import java.util.List;

import io.github.cr9c.hello.domain.User;

public interface UserMapper {
	//语句:cn.wolfcode.mybatis.hello.mapper.UserMapper.save
	void save(User u);

	void update(User u);

	void delete(Long id);

	User get(Long id);

	List<User> listAll();
}
