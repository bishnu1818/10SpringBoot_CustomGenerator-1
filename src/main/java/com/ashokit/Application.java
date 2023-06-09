package com.ashokit;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.OrderDetailsEntity;
import com.ashokit.repository.OrderDetailsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		OrderDetailsRepository bean=context.getBean(OrderDetailsRepository.class);
		OrderDetailsEntity entity=new OrderDetailsEntity();
		
		entity.setOrderBy("Ram");
		
		entity.setOrderPlaceDate(LocalDate.now());
		entity.setHelplinenumber(7978165848l);
	
		OrderDetailsEntity savedEntity=bean.save(entity);
		System.out.println(entity+"\n"+savedEntity);
		
		//context.close();
		
	}

}
