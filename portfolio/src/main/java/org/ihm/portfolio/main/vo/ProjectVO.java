package org.ihm.portfolio.main.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectVO {
	
	private String projectNm;		// 프로젝트 명
	private Date projectStartDt;	// 프로젝트 시작 날
	private Date projectEndDt;		// 프로젝트 끝난 날
	
	private String createUserNm;	// 최초 작성자
	private String updateUserNm;	// 마지막 수정 작성자
	
	private Date createDt;			// 최초 작성 시간
	private Date updateDt;			// 마지막 수정 시간
	
}
