package com.jspiders.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import com.jspiders.controllers.Student;

@SpringBootApplication /*
						 * (exclude = { DataSourceAutoConfiguration.class,
						 * DataSourceTransactionManagerAutoConfiguration.class,
						 * HibernateJpaAutoConfiguration.class })
						 */
(scanBasePackages = "com.jspiders.controllers")
public class SpringBootProjectApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context	= SpringApplication.run(SpringBootProjectApplication.class, args);
	Student bean = context.getBean(Student.class);
//	System.out.println(bean);
//	Student s = context.getBean(Student.class);
//	System.out.println(s);
	}

}
