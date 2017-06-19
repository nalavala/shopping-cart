package com.Nvr.Frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Nvr.Backend.dao.SupplierDAO;
import com.Nvr.Backend.model.Supplier;

@Controller
public class SupplierController 
{
   @Autowired
   SupplierDAO supplierDao;
   
   
   @RequestMapping("supplierform")
   public String showForm(Model m)
   {
	  m.addAttribute("supplier", new Supplier());
	  List<Supplier> list=(List<Supplier>)supplierDao.showSupplier();
		m.addAttribute("suppliers", list);
	  return "supplierForm";   
   }
   
  
   @RequestMapping(value="saveSupplier")
   public String save(@ModelAttribute("supplier") Supplier supplier,Model m)
   {
	   supplierDao.insertSupplier(supplier);
	   m.addAttribute("supplier", new Supplier());
	   List<Supplier> list=(List<Supplier>)supplierDao.showSupplier();
		m.addAttribute("suppliers", list);
	   return "supplierForm";
   }
   
   @RequestMapping(value="/deleteSupplier/{sid}")
   public String delete(@PathVariable("sid") int sid,Model m)
   {
	   supplierDao.deleteSupplier(sid);
	   List<Supplier> list=(List<Supplier>)supplierDao.showSupplier();
		m.addAttribute("suppliers", list);
	   return "redirect:/supplierform";
   }
   
   @RequestMapping(value="updateSupplier/{sid}")
   public String update(@PathVariable("sid") int sid,Model m)
   {
	   Supplier sup=supplierDao.getSupplier(sid);
	   m.addAttribute("supplier",sup);
	   return "supplierUpdateForm";
   }
   
   
   @RequestMapping(value="updateSupplier")
   public String updateSupplier(@ModelAttribute("supplier") Supplier supplier,Model m)
   {
	   supplierDao.updateSupplier(supplier);
	   return "redirect:/supplierform";
   }
}
