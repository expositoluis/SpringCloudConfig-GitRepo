/**
 * 
 */
package com.tlf.arq.les.wip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlf.arq.les.wip.config.Configuration;

/**
 * @author cg00046
 *
 */
@SpringBootApplication
@RestController
public class Application {
	
	@Autowired
	private Configuration configurationlimites;

	@Value("${other.max}")
	private int max;
	
    @RequestMapping("/")
    public String home() {
        return "Hello World! " + configurationlimites.getMinimo() + " --- " + configurationlimites.getMaximo() + " --- " + max;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}