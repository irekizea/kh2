package home.board.servlet;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;

import home.beans.FilesDao;
import home.beans.FilesDto;

@WebServlet(urlPatterns = "/board/download.do")
public class BoardDownloadServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
//		파라미터를 받는다
		int no = Integer.parseInt(req.getParameter("no"));
		System.out.println(no);
//		no 에 대한 파일 정보를 불러와야 한다(단일조회)
		FilesDao fdao = new FilesDao();
		FilesDto fdto = fdao.get(no);
//		실제 파일을 읽어들인다
		File target = new File("D:/upload/home", fdto.getSavename());
		System.out.println(fdto.getSavename());
		byte[] data = FileUtils.readFileToByteArray(target);
//		읽어들인 내용 사용자에게 전송
//		image/png, image/jpg, image/gif 와 같이 할 경우 미지란 듰
//		applicaiton/octet-stream으로 설정할 경우 다운로드 받으란 뜻
//		resp.setContentType("application/octet-stream: charset=UTF-8");
		
		
		
		resp.setHeader("Content-Type", "application/octet-stream; charset=UTF-8");
		resp.setHeader("Content-Disposition", "attachment; filename=\""+URLEncoder.encode(fdto.getUploadname(), "UTF-8")+"\"");
		resp.setHeader("Content-Length", String.valueOf(fdto.getFilesize()));
		
//		resp에 존재하는 outputstream 으로 불러온 파일 전송(파일 byte 입출력과 유사)
		
		resp.getOutputStream().write(data);
		
		
	}catch(Exception e){
		e.printStackTrace();
		resp.sendError(500);
		
	}
		
	}
}
