package com.kedu.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

	int insUser(UserVO p);

	UserVO selUser(UserVO p);

}
