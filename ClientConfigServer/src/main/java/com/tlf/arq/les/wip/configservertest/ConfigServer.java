/**
 * 
 */
package com.tlf.arq.les.wip.configservertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author cg00046
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ConfigServer.class, args);
	}

}
