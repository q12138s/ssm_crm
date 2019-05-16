package com.service;



import com.pojo.Customer;
import com.pojo.QueryVo;
import com.utils.Page;
public interface CustomerService {
	//������
	public Page<Customer> selectPageByQueryVo(QueryVo vo);
	//����
	public Customer selectCustomerById(Integer id);
	//����
	public void updateCustomerById(Customer customer);
	//ɾ��
	public void deleteCustomerById(Integer id);
}
