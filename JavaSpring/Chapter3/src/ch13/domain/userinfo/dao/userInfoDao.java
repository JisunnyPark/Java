package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

public interface userInfoDao {

	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
