/**
 * 
 */
package com.tlf.arq.les.wip.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author cg00046
 *
 */

@Component
@ConfigurationProperties
public class Configuration {
	@Value("${limite.minimo}")
	private int minimo;
	@Value("${limite.maximo}")
	private int maximo;
	
	public int getMinimo() {
		return minimo;
	}
	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}
	public int getMaximo() {
		return maximo;
	}
	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}
	
}
