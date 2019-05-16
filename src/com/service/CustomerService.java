package com.service;



import com.pojo.Customer;
import com.pojo.QueryVo;
import com.utils.Page;
public interface CustomerService {
	//总条数
	public Page<Customer> selectPageByQueryVo(QueryVo vo);
	//回显
	public Customer selectCustomerById(Integer id);
	//更新
	public void updateCustomerById(Customer customer);
	//删除
	public void deleteCustomerById(Integer id);
}
