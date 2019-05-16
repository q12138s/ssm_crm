package com.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pojo.Customer;
import com.pojo.QueryVo;
@Repository
public interface CustomerDao {
	//������
	public Integer customerCountByQueryVo(QueryVo vo);
	//�����
	public List<Customer> selectCustomerListByQueryVo(QueryVo vo);
	//��ѯ����
	public Customer selectCustoemrById(Integer id);
	//����ID���
	public void updateCustomerById(Customer customer);
	//ɾ��
	public void deleteCustomerById(Integer id);
}	
