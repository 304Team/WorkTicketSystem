package com.bean;

public class User {
	private String id;
	private String name;
	private String password;
	private int add;
	private int query;
	private int ieport;
	private int delete;
	private int statistics;
	
	public User() {
		
	}
	public User(String id,String name) {
		this.id=id;
		this.name=name;
	}
	public User(String id,String name,int add,int query,int ieport,int delete,int statistics) {
		this.id=id;
		this.name=name;
		this.add=add;
		this.query=query;
		this.ieport=ieport;
		this.delete=delete;
		this.statistics=statistics;
	}
	
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
	
	public void setAdd(int add){
		this.add=add;
	}
	public int getAdd(){
		return add;
	}
	
	public void setQuery(int query){
		this.query=query;
	}
	public int getQuery(){
		return query;
	}
	
	public void setIeport(int ieport){
		this.ieport=ieport;
	}
	public int getIeport(){
		return ieport;
	}
	
	public void setDelete(int delete){
		this.delete=delete;
	}
	public int getDelete(){
		return delete;
	}
	public void setStatistics(int statistics){
		this.statistics=statistics;
	}
	public int getStatistics(){
		return statistics;
	}
}
