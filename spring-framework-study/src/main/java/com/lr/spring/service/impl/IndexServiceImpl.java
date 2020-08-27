package com.lr.spring.service.impl;

import com.lr.spring.service.IndexService;

/**
 * @author liurui
 * @date 2020/8/27 22:31
 */
public class IndexServiceImpl implements IndexService {

	@Override
	public String print(String str) {
		System.out.println("print 方法执行了");
		return str;
	}
}
