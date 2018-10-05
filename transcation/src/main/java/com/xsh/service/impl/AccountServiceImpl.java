package com.xsh.service.impl;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsh.dao.AccountDao;
import com.xsh.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDao accountDao; 

	
	public void transfer(final String out, final String in, final Double money) {
		
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("out", out);
		outMap.put("money", money);
		accountDao.outMoney(outMap);
		System.out.println("执行下一步,这里面可以进一步操作~");
		int a = 1 / 0;
		Map<String,Object> inMap = new HashMap<String,Object>();
		inMap.put("in", in);
		inMap.put("money", money);
		accountDao.inMoney(inMap);
		System.out.println("执行到了这个里面");
	}
}
