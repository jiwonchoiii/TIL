package org.zerock.myapp.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@RequestMapping("/fileupload/") // Base URI
@Controller
public class FileUploadController {

	// servlet-context.xml 참고
	@GetMapping("page")
	public void page() {
		log.debug("page() invoked.");

	} // page

	@PostMapping("doit")
	public void doit(
			// 파일 여러개 업로드할때 필요한 매개변수
			@RequestParam("files") List<MultipartFile> files) {

		log.debug("doit() invoked.");

		String uploadDir = "C:/temp/file_upload/"; // 타겟폴더.  servlet-context.xml에 지정한 폴더는 임시폴더

		files.forEach(f -> {
			log.info("\t+ contentType: " + f.getContentType());
			log.info("\t+ filename: " + f.getOriginalFilename());
			log.info("\t+ filesize: " + f.getSize());
			log.info("==========================================");

			if (f.getSize() > 0) {

				try {

					byte[] fileData = f.getBytes();

					FileOutputStream fos = new FileOutputStream(uploadDir + f.getOriginalFilename());
					BufferedOutputStream bos = new BufferedOutputStream(fos);

					bos.write(fileData);

					bos.flush();
					bos.close();

					fos.close();

				} catch (IOException e) {
					e.printStackTrace();
//					throw e; // 람다식은 익명구현객체를 생성하고, 객체안에서 예외를 던질 수 없다
				} // try-catch
				
			} // if

		}); // forEach
		
	} // doit

}// end class
