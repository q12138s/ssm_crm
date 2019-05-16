package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.BaseDict;
import com.pojo.Customer;
import com.pojo.QueryVo;
import com.service.BaseDictService;
import com.service.CustomerService;
import com.utils.Page;

@Controller
public class CustomerController {
		@Autowired
		private BaseDictService baseDictService;
		@Autowired
		private CustomerService customerService;
		 
		@RequestMapping(value="customer/list")
		public String list(QueryVo vo,Model model){
			List<BaseDict> fromType = baseDictService.selectBaseDictListByCode("002");
			List<BaseDict> industryType = baseDictService.selectBaseDictListByCode("001");
			List<BaseDict> levelType = baseDictService.selectBaseDictListByCode("006");
			model.addAttribute("fromType",fromType);
			model.addAttribute("industryType",industryType);
			model.addAttribute("levelType",levelType);
			
			//通过四个条件  查询分页对象
			Page<Customer> page = customerService.selectPageByQueryVo(vo);
			model.addAttribute("page", page);
			model.addAttribute("custName", vo.getCustName());
			model.addAttribute("custSource", vo.getCustSource());
			model.addAttribute("custIndustry", vo.getCustIndustry());
			model.addAttribute("custLevel", vo.getCustLevel());
			
			return "customer";
		}
		//修改回显数据
		@RequestMapping(value="/customer/edit")
		public @ResponseBody
		Customer edit(Integer id){
			return customerService.selectCustomerById(id);
			
		}
		//更新数据
		@RequestMapping(value="/customer/update")
		public @ResponseBody
		String update(Customer customer){
			 customerService.updateCustomerById(customer);
			 return "OK";
			
		}
		//删除
		@RequestMapping(value="/customer/delete")
		public @ResponseBody
		String delet(Integer id){
			customerService.deleteCustomerById(id);
			return "OK";
			
		}
}
