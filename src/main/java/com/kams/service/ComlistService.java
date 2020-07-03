package com.kams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kams.bean.Organization;
import com.kams.dao.OrganizationMapper;

@Service
public class ComlistService {

	@Autowired
	private OrganizationMapper organizationMapper;
	
	public List<Organization> getComlist(){
		
		List<Organization> map=organizationMapper.getAllCom();
		return map;
		
	}
}
