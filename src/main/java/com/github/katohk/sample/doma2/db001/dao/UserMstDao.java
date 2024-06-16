package com.github.katohk.sample.doma2.db001.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import com.github.katohk.sample.doma2.db001.ConfigAutowireable001;

@Dao
@ConfigAutowireable001
public interface UserMstDao {
	
	@Select
	public List<UserMstEntity> selectUserMst();

}
