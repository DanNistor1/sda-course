package com.sda.spring.mvc.hibernate.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@EnableJpaRepositories(basePackages = PersistenceJpaConfig.REPOSITORY_PACKAGE)
@EnableTransactionManagement
@ComponentScan({PersistenceJpaConfig.COMPONENT_PACKAGE})
@PropertySource({"file:C:\\Users\\bcs\\IdeaProjects\\sda-course\\spring-mvc-hibernate\\src\\main\\resources\\persistence-h2.properties"})
@Configuration
public class PersistenceJpaConfig {

    public static final String MODEL_PACKAGE = "com.sda.spring.mvc.hibernate.model";
    public static final String COMPONENT_PACKAGE = "com.sda.spring.mvc.hibernate";
    public static final String REPOSITORY_PACKAGE = "com.sda.spring.mvc.hibernate.dao";

    @Autowired
    public Environment env;

    // data source
    @Bean
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // get properties from resources
        dataSource.setDriverClassName("jdbc.driverClassName");
        dataSource.setUrl("jdbc.url");
        dataSource.setUsername("jdbc.user");
        dataSource.setPassword("jdbc.pass");

        return dataSource;
    }

    // entity manager
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
        final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan(MODEL_PACKAGE);

        final JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(additionalProperties());

        return em;
    }

    // additional properties
    public Properties additionalProperties() {
        final Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        hibernateProperties.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
        hibernateProperties.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));

        return hibernateProperties;
    }

    // transaction manager
    @Bean
    public PlatformTransactionManager transactionManager(final EntityManagerFactory emf) {
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);

        return transactionManager;
    }

    // exception translator
    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
        return new PersistenceExceptionTranslationPostProcessor();
    }
}
