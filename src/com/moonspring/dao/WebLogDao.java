package com.moonspring.dao;

import com.moonspring.db.mongodb;

public class WebLogDao {
	public int addLog(){
		int r = -1;
		mongodb mym = null;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
			r = -1;
		} finally {
			if(mym != null){
				mym.close();
			}
		}
		return r;
	}
}
