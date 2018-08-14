package kr.co.thirdparty.common.domain;

import java.util.Date;


import lombok.Data;


@Data
public class Users {
	
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 계정
	 */
	private String platformId;
	
	/**
	 * name
	 */
	private String name;
	
	/**
	 * create
	 */
	private Date createdAt;
	
	/**
	 * update
	 */
	private Date updatedAt;
	
	
}
