package controllers;


import models.User;

public class LogInStatus {
	private User user;
	private final static String typingError = "nhập không đúng cú pháp";
	private final static String nameAgain = "tên đã tồn tại";
	private final static String seccessLogIn = "log in seccessfuly";
	private final static String seccessCreate  = "ctreate new account seccessfuly";
	private final static String error = "error connect";
	public static String getNoticeOnCreate(String name, String password) {
		if((name.length()>20)||name.length()==0||(password.length()>20)||(password.length()==0)) return typingError;
		for(char c:name.toCharArray()) {
			if((c<'0')||(c>'z')) return typingError;
		}
		for(char c:password.toCharArray()) {
			if((c<'0')||(c>'z')) return typingError;
		}
		switch(UserDao.checkUserName(name)) {
		case -1: return error;
		case 1:  return nameAgain;
		case 0: 
			switch(UserDao.addUser(new User(name,password))) {
			case -1: return error;
			case 0:  return "lỗi hệ thống";
			case 1: return seccessCreate;
			}
		}
		return null; //non
	}
	public String getNoticeOnLogIn(String name, String password) {
		if((name.length()>20)||name.length()==0||(password.length()>20)||(password.length()==0)) return typingError;
		for(char c:name.toCharArray()) {
			if((c<'0')||(c>'z')) return typingError;
		}
		for(char c:password.toCharArray()) {
			if((c<'0')||(c>'z')) return typingError;
		}
		user = UserDao.getUser(new User(name,password));
		if(user==null)return error;
		else {
			if(user.getId()==0) return "tài khoản không tồn tại";
			else return null;
		}
	}
	public User getUser() {
		return this.user;
	}
}
