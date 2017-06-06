package com.yundao.reader.service;

import com.yundao.reader.model.Reader;

public interface LoginService {
	Reader toLogin(String barcode);
}
