package com.microservice.setting;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("db") // mention the prefix value
public class DBSetting {
	
	private String dbvalues;
	private String host;
	private int port;
	public String getDbvalues() {
		return dbvalues;
	}
	public void setDbvalues(String dbvalues) {
		this.dbvalues = dbvalues;
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
	@Override
	public String toString() {
		return "DBSetting [dbvalues=" + dbvalues + ", host=" + host + ", port=" + port + "]";
	}
	
	
	
	

}
