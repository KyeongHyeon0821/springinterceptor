<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>Home</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<div class="container">
<h1>
	Hello world!  
</h1>
<P>  The time on the server is ${serverTime}. </P>
<hr/>
<pre>
  * 프로젝트 인터셉터 설계 *
  1. 모든사용자가 사용할수 있는 경로? login/join/idCheck/nackName/joinOk/guestList/guestInput/guestUpdate/guestDelete
  2. 준회원 : memberMain/memberUpdate/memberDelete/boardList
  3. 정회원 : memberList/memberSearch/schedule/study/boardInput/boardUpdate/boardDelete/pdsList/photoList
  4. 우수회원 : pdsInput/pdsUpdate/pdsDelete
  5. 관리자 : admin~~에 관계된 모든작업...
  
  * 회원등급 :  0.관리자, 1.우수회원, 2.정회원, 3.준회원, 99.비회원, 999.탈퇴회원
  
  * 메세지 처리파일경로? logout / joinOk / memberUpdateOk.... 등등
</pre>
<hr/>
<p>
  <a href="${ctp}/guest/guestList" class="btn btn-success">방명록 리스트</a>
  <a href="${ctp}/guest/guestInput" class="btn btn-success">방명록 글쓰기</a>
  <a href="${ctp}/guest/guestUpdate" class="btn btn-success">방명록 수정하기</a>
  <a href="${ctp}/guest/guestDelete" class="btn btn-success">방명록 삭제하기</a>
</p>
<p>
  <a href="${ctp}/member/memberLogin" class="btn btn-warning">로그인</a>
  <a href="${ctp}/member/memberLogout" class="btn btn-warning">로그아웃</a>
  <a href="${ctp}/member/memberJoin" class="btn btn-warning">회원가입</a>
  <a href="${ctp}/member/memberIdCheck" class="btn btn-warning">아이디체크</a>
  <a href="${ctp}/member/memberJoinOk" class="btn btn-warning">회원가입Ok</a>
</p>
<p>
  <a href="${ctp}/member/memberMain" class="btn btn-secondary">회원 메인방</a>
  <a href="${ctp}/member/memberUpdate" class="btn btn-secondary">회원 정보수정</a>
  <a href="${ctp}/member/memberDelete" class="btn btn-secondary">회원 탈퇴</a>
  <a href="${ctp}/member/memberList" class="btn btn-secondary">회원 List</a>
  <a href="${ctp}/member/memberSearch" class="btn btn-secondary">회원 Search</a>
</p>
<p>
  <a href="${ctp}/board/boardList" class="btn btn-primary">게시판 리스트</a>
  <a href="${ctp}/board/boardInput" class="btn btn-primary">게시판 글쓰기</a>
  <a href="${ctp}/board/boardUpdate" class="btn btn-primary">게시판 수정하기</a>
  <a href="${ctp}/board/boardDelete" class="btn btn-primary">게시판 삭제하기</a>
  <a href="${ctp}/board/boardContent" class="btn btn-primary">게시판 내용보기</a> <!-- 내용보기는 준회원까지 허용 -->
</p>
<p>
  <a href="${ctp}/pds/pdsList" class="btn btn-info">자료실 리스트</a>
  <a href="${ctp}/pds/pdsInput" class="btn btn-info">자료실 글쓰기</a>
  <a href="${ctp}/pds/pdsUpdate" class="btn btn-info">자료실 수정하기</a>
  <a href="${ctp}/pds/pdsDelete" class="btn btn-info">자료실 삭제하기</a>
  <a href="${ctp}/pds/pdsContent" class="btn btn-info">자료실 내용보기</a>
  <a href="${ctp}/pds/pdsDownload" class="btn btn-info">자료실 내용받기</a>
</p>
<p>
  <a href="${ctp}/admin/adminMain" class="btn btn-danger">관리자 메인화면</a>
  <a href="${ctp}/admin/adminLeft" class="btn btn-danger">관리자 왼쪽메뉴</a>
  <a href="${ctp}/admin/adminRight" class="btn btn-danger">관리자 오른쪽내용</a>
</p>
</div>
</body>
</html>
