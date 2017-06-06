package com.yundao.reader.mapper;




import org.apache.ibatis.annotations.Mapper;

import com.yundao.reader.model.Reader;

@Mapper
public interface LoginMapper {
	Reader findByBarcodeaAndSchoolId(String barcode);
}
