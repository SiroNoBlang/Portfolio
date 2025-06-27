package org.ihm.portfolio.main.serviceImpl;

import java.util.List;

import org.ihm.portfolio.main.mapper.MainMapper;
import org.ihm.portfolio.main.service.MainService;
import org.ihm.portfolio.main.vo.ProjectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MainServiceImpl implements MainService {
	
	@Autowired
    private MainMapper mainMapper;
	
	@Override
	public List<ProjectVO> selectProjectList() {
		return mainMapper.selectProjectList();
	}

	@Override
	@Transactional // 트랜잭션 처리
	public int insertProject() {
		return mainMapper.insertProject();
	}
	
}
