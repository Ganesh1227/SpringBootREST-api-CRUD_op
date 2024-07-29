package com._welcome.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._welcome.demo.entity.Demo_Entity;
import com._welcome.demo.repo.Demo_repo;

@Service
public class Demo_services {
	
	@Autowired
	Demo_repo demo_repo;
	
	public Demo_Entity create(Demo_Entity St)
	{
		return demo_repo.save(St);
	}
	
	public List< Demo_Entity> Read()
	{
		return demo_repo.findAll();
	}
	
	public  String delete(int id )
	{
		 demo_repo.deleteById(id);
		 return "deleted...";
	}

	 public Demo_Entity update( int id, Demo_Entity St)
	 {
		 Demo_Entity demo=demo_repo.findById(id).get();
		 
		 if (demo!=null)
		 {
			 demo.setId(St.getId());
			 demo.setName(St.getName());
			 demo.setDiv(St.getDiv());
		 }
		 //return "upadeted.." ;
		 return demo_repo.save(demo);
		 
	 }
}
