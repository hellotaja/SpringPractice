package kr.smhrd.mapper;
// 게시판 1개의 구조 설계 (Modeling)

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // 디폴트 생성자 생성
@AllArgsConstructor // 전체 생성자 생성
public class BoardVO { // @Data 어노테이션을 통해 자동으로 세터와 게터가 구축됨
	// property(프로퍼티)
	
	// 멤버 변수 생성
	private int idx; //번호
	private String title; //제목
	private String contents; //내용
	private int count; //조회수
	private String writer; //작성자
	private String indate; //작성일
	
	// Spring은 getter 과 setter 를 생성할 필요없음. 자동으로 완성됨!
	
	

}
