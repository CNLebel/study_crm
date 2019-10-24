package com.gyf.crm.service;


import java.util.List;

import com.gyf.crm.domain.Customer;


// 客户服务接口 
public interface CustomerService {

	//通过手机号查找客户信息
	public Customer findCustomerByTel(String tel);


	// 未关联定区客户
	public List<Customer> findnoassociationCustomers();

	// 查询已经关联指定定区的客户
	public List<Customer> findhasassociationCustomers(String decidedZoneId);

	// 将未关联定区客户关联到定区上
	public void assignCustomersToDecidedZone(Integer[] customerIds, String decidedZoneId);
}
