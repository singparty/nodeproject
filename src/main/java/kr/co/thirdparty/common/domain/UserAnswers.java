package kr.co.thirdparty.common.domain;

import java.util.Date;

import lombok.Data;

@Data
public class UserAnswers {
	
	/** id */
	public Long id;
	
	/** userId */
	public Long userId;
	
	/** questionId */
	public Long questionId;
	
	/** content */
	public String content;
	
	/** createdAt */
	private Date createdAt;
	
	/** updatedAt */
	private Date updatedAt;
}
