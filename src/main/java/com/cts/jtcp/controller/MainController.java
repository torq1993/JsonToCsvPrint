package com.cts.jtcp.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.jtcp.controller.MainController;
import com.cts.jtcp.config.ServiceConfig;

@RestController
public class MainController {

	@Autowired
	ServiceConfig serviceConfig;
	
	Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value="/jsontocsv",method = RequestMethod.POST , headers = {"content-type=text/plain"})
	public String jsonToCsvPrint(@RequestBody String request)
	{
		logger.info("MainController jsonToCsvPrint() starts");
		logger.info("Request inside JsonToCsvPrint MS is : "+request);
		logger.info("MainController jsonToCsvPrint() ends");
		return request;
	}
	
	
//	@RequestMapping(value="/pdftransfer")
//	public String secondProcessBackMS(@RequestBody byte[] content) throws IOException
//	{
//		File file = new File(serviceConfig.pdfFinalPath+"copy.pdf");
//		FileOutputStream fos = new FileOutputStream(file);
//		fos.write(content);
//		fos.flush();
//		fos.close();
//		return "DONE";
//	}
	
}
