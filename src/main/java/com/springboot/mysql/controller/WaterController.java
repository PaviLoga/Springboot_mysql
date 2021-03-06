package com.springboot.mysql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mysql.entity.UseWater;
import com.springboot.mysql.repository.waterRepository;

@RestController
@RequestMapping("/snacks")
public class WaterController {
	@Autowired
	private waterRepository waterRepository;
	@RequestMapping("/welcome")
public String welcome()
{
	return "Welcome";
}
	@RequestMapping("/welcome/free")
	public String welcomefree()
	{
		return "You win 1 ltr of free cocktail!!!";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addwater(@RequestBody UseWater usewater)
	{
		waterRepository.save(usewater);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String delete(@PathVariable Integer id) {
		waterRepository.deleteById(id);
		return "emptied water in the tank";
	}
	@RequestMapping("/getall")
	public List<UseWater> getall()
	{
		List<UseWater> allwater=new ArrayList<>();
		waterRepository.findAll().forEach(allwater::add);
		return allwater;
	}
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public void update(@RequestBody UseWater usewater,@PathVariable Integer id)
	{
		usewater.setId(id);
		waterRepository.save(usewater);
	}               
}
