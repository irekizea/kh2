package home.board.servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import home.beans.BoardDao;
import home.beans.BoardDto;
import home.beans.FilesDao;
import home.beans.FilesDto;

@WebServlet(urlPatterns = "/board/write.do")
public class BoardWriteServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			MultipartRequest mRequest= new MultipartRequest(
					req, "D:/upload/home", 10*1024*1024, "UTF-8",
					new DefaultFileRenamePolicy());
					
			
		
		
	
		BoardDao dao = new BoardDao();
		BoardDto dto = new BoardDto();
		
		if(mRequest.getParameter("superno")!=null) {
			int superno = Integer.parseInt(mRequest.getParameter("superno"));
			BoardDto target =dao.get(superno);
			dto.setSuperno(target.getNo());
			dto.setGroupno(target.getGroupno());
			dto.setDepth(target.getDepth());
		}
		
		
		
		dto.setContent(mRequest.getParameter("content"));
		dto.setHead(mRequest.getParameter("head"));
		dto.setTitle(mRequest.getParameter("title"));
		String id = (String)req.getSession().getAttribute("id");
		dto.setWriter(id);
			int no = dao.getSequence();
			dto.setNo(no);
			dao.BoardWrite(dto);
			
			
			///////////////////////////////////////////
			// 게시글 등록 마친 후 파일 등록 진행
			/////////////////////////////////////////////
			
			File file = mRequest.getFile("file");
			if(file != null) {
			FilesDto fdto = new FilesDto();
			fdto.setOrigin(no);
			fdto.setUploadname(mRequest.getOriginalFileName("file"));
			fdto.setSavename(mRequest.getFilesystemName("file"));
			fdto.setFiletype(mRequest.getContentType("file"));
			fdto.setFilesize(file.length());
			
			FilesDao fdao = new FilesDao();
			fdao.insert(fdto);
			}
			
			
			
			resp.sendRedirect("board/list.jsp");
			
		} catch (Exception e) {
			resp.sendError(500);
			e.printStackTrace();
		}
		
		
	}

}
