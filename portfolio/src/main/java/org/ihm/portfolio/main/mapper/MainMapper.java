package org.ihm.portfolio.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.ihm.portfolio.main.vo.ProjectVO;

@Mapper
public interface MainMapper {
	
	List<ProjectVO> selectProjectList();
	int insertProject();
	
}
