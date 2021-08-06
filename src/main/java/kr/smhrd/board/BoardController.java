package kr.smhrd.board;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 어노테이션 (마킹하는것 / 미리 전처리 하는 것 / 객체를 메모리로 올리기 위해)
public class BoardController { // POJO 만들기 (프론트컨트롤러들의 복사본들)

	// 개시판 데이터를 MySQL -> 테이블(tbl_board)에서 가져오기
	// 요청(GET, POST) -> 메서드 : HandlerMapping
	@RequestMapping("/boardList.do") // 요청을 받을 때 사용하는 어노테이션 (겟방식 : GetMapping, 포스트방식 : PostMapping)
	//RequestMapping 은 두 방식 모두 사용가능한 메서드
	public String boardList(HttpServletRequest request){
		// DAO를 연결해서 게시판리스트를 가져오기
		List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("포도");
		// list를 View(JSP)에게 넘겨줘야한다
		request.setAttribute("list", list); 
		return "list"; // 프론트컨트롤러에서 DispatcherServlet의 ViewResolver 를 통해 list.jsp 의 전체경로를 찾음
		
	}
}
