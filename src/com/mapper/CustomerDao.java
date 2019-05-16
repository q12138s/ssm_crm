package com.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pojo.Customer;
import com.pojo.QueryVo;
@Repository
public interface CustomerDao {
	//总条数
	public Integer customerCountByQueryVo(QueryVo vo);
	//结果集
	public List<Customer> selectCustomerListByQueryVo(QueryVo vo);
	//查询数据
	public Customer selectCustoemrById(Integer id);
	//根据ID添加
	public void updateCustomerById(Customer customer);
	//删除
	public void deleteCustomerById(Integer id);
}	
