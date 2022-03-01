package com.liam.springbootconfig.models;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration // Tells Spring to create DbSettings as a Bean - @Bean
@ConfigurationProperties("db")
public class DbSettings { // New { INSTANCE } of DbSettings Class is created with db."value"s injected automatically
	
	// db.connection is actually a map, but just gonna create it as a String for now
	private String connection;
	
	// db.host
	private String host;
	
	// db.port
	private int port;

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

}
