package com.cts.jtcp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class ServiceConfig {

	@Value("${authUsername}")
	private String authUsername;
	
	@Value("${authPassword}")
	private String authPassword;
	
	@Value("${pdfFinalPath}")
	private String pdfFinalPath;

	public String getAuthUsername() {
		return authUsername;
	}

	public String getAuthPassword() {
		return authPassword;
	}

	public String getPdfFinalPath() {
		return pdfFinalPath;
	}
	
	
}
