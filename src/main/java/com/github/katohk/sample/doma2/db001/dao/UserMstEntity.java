package com.github.katohk.sample.doma2.db001.dao;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

@Entity
@Table(name = "usermst")
public class UserMstEntity {

    @Column(name = "usr_id")
    private String usrId;
    @Column(name = "usr_name")
    private String usrName;
	/**
	 * @return the usrId
	 */
	public String getUsrId() {
		return usrId;
	}
	/**
	 * @param usrId the usrId to set
	 */
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	/**
	 * @return the usrName
	 */
	public String getUsrName() {
		return usrName;
	}
	/**
	 * @param usrName the usrName to set
	 */
	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}
    
}