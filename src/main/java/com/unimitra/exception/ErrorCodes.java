package com.unimitra.exception;

import org.springframework.http.HttpStatus;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorCodes {

	public static final String USER_HAS_NO_ACCESS = "UM1001 " + HttpStatus.UNAUTHORIZED.value()
			+ ": User does not have access to do the mentioned change";
	public static final String INVALID_REQUEST = "UM1002 " + HttpStatus.BAD_REQUEST.value()
			+ ": Invalid Request or Request Parameters";
	public static final String USER_NOT_PRESENT = "UM1003 " + HttpStatus.BAD_REQUEST.value()
			+ ": Given user does not exist";
	public static final String INVALID_DELETE_DISCUSSION_REQUEST = "UM1004 " + HttpStatus.BAD_REQUEST.value()
			+ ": Invalid Request";
	public static final String QUESTION_NOT_PRESENT = "UM1005 " + HttpStatus.BAD_REQUEST.value()
			+ ": Given question does not exist";
	public static final String ANSWER_NOT_PRESENT = "UM1005 " + HttpStatus.BAD_REQUEST.value()
			+ ": Given answer does not exist";
	public static final String CATEGORY_NOT_PRESENT = "UM1006 " + HttpStatus.BAD_REQUEST.value()
			+ ": Given category does not exist";
	public static final String QUESTION_THREAD_INACTIVE = "UM1010 " + HttpStatus.BAD_REQUEST.value()
			+ ": The question thread is inactive so you cannot answer";
	public static final String USER_DOES_NOT_HAVE_ACCESS_TO_GROUP = "UM1011 " + HttpStatus.UNAUTHORIZED.value()
			+ ": The user has no access to group";
	public static final String INVALID_SEARCH_REQUEST = "UM1012 " + HttpStatus.UNAUTHORIZED.value()
			+ ": Invalid search discussion request";
	public static final String NO_RESULTS_FOUND = "UM1013 " + HttpStatus.NOT_FOUND.value() + ": No results found";
	public static final String GROUP_DOES_NOT_EXIST = "UM1014 " + HttpStatus.NOT_FOUND.value()
			+ ": Group does not exist";
}
