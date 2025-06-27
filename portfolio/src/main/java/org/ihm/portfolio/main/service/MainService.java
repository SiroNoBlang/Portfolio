package org.ihm.portfolio.main.service;

import java.util.List;

import org.ihm.portfolio.main.vo.ProjectVO;

public interface MainService {
	
	List<ProjectVO> selectProjectList();
	int insertProject();
	
}
