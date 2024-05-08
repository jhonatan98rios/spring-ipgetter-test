package com.ipgetter.ipgetter.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.ipgetter.ipgetter.repositories")
public class JpaConfig {}
