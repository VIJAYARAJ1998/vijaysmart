 package com.niit.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.models.Product;
import com.niit.models.Category;
import com.niit.models.CartItem;
import com.niit.models.CustomerOrder;
import com.niit.models.User;
import com.niit.models.Customer;
import com.niit.models.Authorities;
import com.niit.models.BillingAddress;
import com.niit.models.ShippingAddress;
import com.niit.models.Supplier;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

@Configuration
@EnableTransactionManagement   //commit / rollback
public class DBConfiguration 
{
//to create beans
	
	@Bean(name="dataSource")
	public DataSource getDataSource() {
		System.out.println("Entering DataSource Bean creation method ");
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("org.h2.Driver");
	    dataSource.setUrl("jdbc:h2:tcp://localhost/~/ecommerce project");
	    dataSource.setUsername("1234");
	    dataSource.setPassword("1234");
	    System.out.println("DataSource bean " +dataSource);
	    return dataSource;
	}
	/*
	 * <bean id="sessionFactory" class="org.springframework.orm.hibernate4.LocalSessionFactoryBuilder">
	 * <property name="dataSource" ref="dataSource">
	 */
	@Bean //SessionFactory - factory of session objects
	public SessionFactory sessionFactory() {
		System.out.println("Entering sessionFactory creation method");
		LocalSessionFactoryBuilder factory=new LocalSessionFactoryBuilder(getDataSource());
		Properties hibernateProperties=new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		factory.addProperties(hibernateProperties);
		factory.addAnnotatedClass(Category.class);
		factory.addAnnotatedClass(Product.class);
		factory.addAnnotatedClass(Supplier.class);
		factory.addAnnotatedClass(Authorities.class);
		factory.addAnnotatedClass(CartItem.class);
		factory.addAnnotatedClass(User.class);
		factory.addAnnotatedClass(ShippingAddress.class);
		factory.addAnnotatedClass(Customer.class);
		factory.addAnnotatedClass(CustomerOrder.class);
		factory.addAnnotatedClass(BillingAddress.class);
		
		
		//An array of Class objects of all the entities
		//Map all entities to relational table
		Class classes[]=new Class[]{Product.class,Category.class,CartItem.class,CustomerOrder.class,User.class,Customer.class,Authorities.class,BillingAddress.class,ShippingAddress.class}; //If product class is not yet created, remove this and add it later
		//localsesionfactorybuilder -> sessionfactory -> map all entities with relation table
		System.out.println("SessionFactory bean " + factory);
	    return factory.addAnnotatedClasses(classes).buildSessionFactory();
	}
	@Bean
	public HibernateTransactionManager hibTransManagement(){
		return new HibernateTransactionManager(sessionFactory());
	}
}
