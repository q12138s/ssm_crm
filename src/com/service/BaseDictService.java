package com.service;

import java.util.List;


import com.pojo.BaseDict;


public interface BaseDictService {
	
		public List<BaseDict> selectBaseDictListByCode(String code);
}
