package com.baomidou.mybatisplus.samples.crud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value="PRODUCTION.PRODUCT_CATEGORY")
public class ProductCategory {
	
	@TableId(value="PRODUCT_CATEGORYID",type = IdType.AUTO)
	private Long productCategoryId;
	@TableField(value="NAME")
	private String name;
	public Long getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public ProductCategory() {
		super();
	}
}
