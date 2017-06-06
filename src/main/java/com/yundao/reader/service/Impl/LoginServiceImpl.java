package com.yundao.reader.service.Impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundao.reader.mapper.LoginMapper;
import com.yundao.reader.model.Reader;
import com.yundao.reader.service.LoginService;


@Service
public class LoginServiceImpl  implements LoginService{
	@Resource
	private LoginMapper loginMapper;
	
	public Reader toLogin(String barcode){
		Reader r=loginMapper.findByBarcodeaAndSchoolId(barcode);
		
		System.out.println(r);
		return r;
	}
}
