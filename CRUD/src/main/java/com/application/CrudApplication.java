package com.application;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.application.model.Categories;
import com.application.repository.CategoriesRopository;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(CrudApplication.class, args);
		CategoriesRopository categoriesRopository = context.getBean(CategoriesRopository.class);

		System.out.println("Hello i am spring boot application");
		
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the Page number");
		  int pageNo = sc.nextInt();
		  int pageSize = 2;
		  
		  PageRequest page = PageRequest.of(pageNo - 1, pageSize); Page<Categories>
		  findAll = categoriesRopository.findAll(page);
		  List<Categories> list = findAll.getContent();
		  list.forEach(System.out::println);
		 
		 List<Categories> all =
		  categoriesRopository.findAll(Sort.by("name").ascending());
		  all.forEach(System.out::println);
		 
	}

}
