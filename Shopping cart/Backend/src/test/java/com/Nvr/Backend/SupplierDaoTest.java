package com.Nvr.Backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Nvr.Backend.dao.*;
import com.Nvr.Backend.model.*;

public class SupplierDaoTest 
{
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.Nvr.Backend");
		context.refresh();
		SupplierDAO sdao=(SupplierDAO) context.getBean("supplierDao");
		Supplier sup=new Supplier();
		/*sup.setSid(546);
		sup.setSname("alien");
		sup.setAddress("bang");
		sdao.insertSupplier(sup);*/
		sup=sdao.getByName("mohan");
		System.out.println(sup.getSname());
		List<Supplier> list=(List<Supplier>)sdao.showSupplier();
		for(Supplier s:list)
		{
			System.out.println(s.getSid());
		}
	}
}
