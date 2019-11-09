package com.dbs.equity.portfolio.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.equity.portfolio.model.SummaryModel;
import com.dbs.equity.portfolio.service.SummaryService;
import com.dbs.equity.portfolio.util.MediaTypeUtils;

@RestController
@RequestMapping("/api/v1")
public class ApplicationResource {
	@Autowired
	private ServletContext servletContext;
	
	@Autowired
	private SummaryService service;

	@GetMapping("/test/{name}")
	public ResponseEntity<String> testApplication(@PathVariable String name) {
		return new ResponseEntity<>(name, HttpStatus.OK);
	}
	
	@GetMapping("/getsummarydetails}")
	public ResponseEntity<List<SummaryModel>> getSummary() {
		return new ResponseEntity<>(service.getSummaryList(),  HttpStatus.OK);
	}


	private static final String DIRECTORY = "C:/PDF";
	private static final String DEFAULT_FILE_NAME = "dbs-portfolio-summary.pdf";

	@GetMapping("/download" )
	public ResponseEntity<InputStreamResource> downloadFile1(
			@RequestParam(defaultValue = DEFAULT_FILE_NAME) String fileName) throws IOException {

		MediaType mediaType = MediaTypeUtils.getMediaTypeForFileName(this.servletContext, fileName);
		System.out.println("fileName: " + fileName);
		System.out.println("mediaType: " + mediaType);

		File file = new File(DIRECTORY + "/" + fileName);
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + file.getName())
				.contentType(mediaType)
				.contentLength(file.length()) //
				.body(resource);
	}

}
