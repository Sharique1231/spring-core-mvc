package com.entities;

import java.util.*;

public class Todo {
private String TodoTitle;
private String tododContentString;
private Date TodoDate;
public Todo(String todoTitle, String tododContentString, Date todoDate) {
	super();
	TodoTitle = todoTitle;
	this.tododContentString = tododContentString;
	TodoDate = todoDate;
}
public String getTodoTitle() {
	return TodoTitle;
}
public void setTodoTitle(String todoTitle) {
	TodoTitle = todoTitle;
}
public String getTododContentString() {
	return tododContentString;
}
public void setTododContentString(String tododContentString) {
	this.tododContentString = tododContentString;
}
public Date getTodoDate() {
	return TodoDate;
}
public void setTodoDate(Date todoDate) {
	TodoDate = todoDate;
}
@Override
public String toString() {
	return "Todo [TodoTitle=" + TodoTitle + ", tododContentString=" + tododContentString + ", TodoDate=" + TodoDate
			+ "]";
}
public Todo() {
	super();
	// TODO Auto-generated constructor stub
}

 
}
