package com.github.katohk.sample.doma2.db002.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import com.github.katohk.sample.doma2.db002.ConfigAutowireable002;

@Dao
@ConfigAutowireable002
public interface GroupMstDao {
		
	@Select
	public List<GroupMstEntity> selectGroupMst();

}
