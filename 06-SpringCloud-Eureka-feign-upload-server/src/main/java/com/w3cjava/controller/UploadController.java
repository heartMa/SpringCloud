package com.w3cjava.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
/**
 * 
 * @class  UploadController
 * @version 1.0.0
 * @author cos
 * @desc   3、服务提供方（接收文件）
 *
 */
@RestController
public class UploadController {

	@PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String handleFileUpload(@RequestPart(value = "file") MultipartFile file) {
		System.out.println(file.getName());
		return file.getName();
	}

}
