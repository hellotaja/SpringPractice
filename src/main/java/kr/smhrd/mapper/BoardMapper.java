package kr.smhrd.mapper;

import java.util.List;

// DAO (Data Access Object

public interface BoardMapper { //DAO -> java와 SQL을 연결해주는 Mapper 라는 이름을 쓴다
	// 리스트를 가지고 와야함 <- 그 전에 연결해야함! => root-context.xml -> DB연결
	public List<BoardVO> boardList(){ // VO(Value Object (DTO대신 씀) 게시판 하나를 하나의 객체로 본다는 뜻
		// SQL 연동 (BoardMapper.xml 파일)
		// 원래는 여기에 JDBC 로직을 짰었으나 여기서 쓰지 않음! -> 추상메서드 (클래스가 아닌 인터페이스)
	}
}
