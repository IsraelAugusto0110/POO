package com.fatec.testeSpring;

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfiguration {
	
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/pessoas");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres");
		return dataSource;
	}
	
	public JpaVendorAdapter jpaVendoradapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.POSTGRESQL);
		adapter.setDatabasePlatform("org.hibernate.dialect.PostgreSQLDialect");
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setPrepareConnection(true);
		return adapter;
	}
}
