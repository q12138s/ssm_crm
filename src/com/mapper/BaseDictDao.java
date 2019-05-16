package com.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pojo.BaseDict;
@Repository
public interface BaseDictDao {
		public List<BaseDict> selectBaseDictListByCode(String code);
}
