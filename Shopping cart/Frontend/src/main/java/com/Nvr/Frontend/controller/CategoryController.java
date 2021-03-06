package com.Nvr.Frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Nvr.Backend.dao.CategoryDAO;
import com.Nvr.Backend.model.Category;

@Controller
public class CategoryController 
{
	@Autowired
	CategoryDAO categoryDao;
	
	@RequestMapping(value="/Category")
	public ModelAndView showForm(Model m)
	{

        m.addAttribute("category",new Category());
		
		return new ModelAndView("categoryform");	//return "categoryform";
	}
	
	@ModelAttribute
	public void addList(Model m)
	{
		List<Category> list=(List<Category>)categoryDao.showCategory();
		m.addAttribute("categorys", list);
	}
	
	@RequestMapping(value="/addCategory",method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("category") Category category,Model m)
	{
		categoryDao.insertCategory(category);
	   
	    m.addAttribute("category", new Category());
		return new ModelAndView("categoryform");
	}
	
	@RequestMapping(value="/deleteCategory/{cid}",method = RequestMethod.GET)
	public String delete(@PathVariable("cid") int id,Model m)
	{
		categoryDao.deleteCategory(id);
		
		 
		 m.addAttribute("category", new Category());
	     return "redirect:/Category";
		
	}
	
	@RequestMapping(value="updateCategory/{cid}",method = RequestMethod.GET)
	public String update(@PathVariable("cid") int id,Model m)
	{
		Category category=categoryDao.getCategory(id);
		m.addAttribute("category", category);
				return "updateForm";
	}
	@RequestMapping(value="/UpdateCategory",method = RequestMethod.POST)
	public String updateForm(@ModelAttribute("category") Category category)
	{
		categoryDao.updateCategory(category);
		return "redirect:/Category";
	}
	
	@RequestMapping("/*")
	public String home()
	{
		return "index";
	}

}
