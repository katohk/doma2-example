package com.github.katohk.sample.doma2;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.katohk.sample.doma2.db001.Transactional001;
import com.github.katohk.sample.doma2.db001.dao.UserMstDao;
import com.github.katohk.sample.doma2.db001.dao.UserMstEntity;
import com.github.katohk.sample.doma2.db002.Transactional002;
import com.github.katohk.sample.doma2.db002.dao.GroupMstDao;
import com.github.katohk.sample.doma2.db002.dao.GroupMstEntity;

@Service
public class DBService {
	
	private UserMstDao userMstDao;
	private GroupMstDao groupMstDao;
	
	/**
	 * DB service sample
	 * 
	 * @param userMstDao constructor injection
	 * @param groupMstDao constructor injection
	 * 
	 */
	public DBService(UserMstDao userMstDao, GroupMstDao groupMstDao) {
		this.userMstDao = userMstDao;
		this.groupMstDao = groupMstDao;
	}
	
	@Transactional001
	public void dbaccess001() {
		List<UserMstEntity> users = userMstDao.selectUserMst();
		System.out.print("users: ");
		for (UserMstEntity user: users) {
			System.out.print(user.getUsrName() + ",");
		}
		System.out.print("\n");
	}

	@Transactional002
	public void dbaccess002() {
		List<GroupMstEntity> groups = groupMstDao.selectGroupMst();
		System.out.print("groups: ");
		for (GroupMstEntity group: groups) {
			System.out.print(group.getGroupCode() + ",");
		}
		System.out.print("\n");
	}

}
