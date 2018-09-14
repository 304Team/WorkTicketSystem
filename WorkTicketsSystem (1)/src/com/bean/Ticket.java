package com.bean;



import java.sql.Date;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Occurs;

public class Ticket {
	private String ipccustomer;
	private String customercode;
	private String cause;
	private String summary;
	private String componenttype;
	private String ostype;
	private String identifier;
	private String ticketstatus;
	private Date lastocccurrence;
	private String node;
	private String resolution;
	private String servername;
	private String alertgroup;
	private String component;
	private String ticketnumber;
	private Date firstoccurrence;
	private String severity;
	
	public void setIpccutomer(String ipccustomer){
		this.ipccustomer=ipccustomer;
	}
	public String getIpccustomer(){
		return ipccustomer;
	}
	
	public void setCustomercode(String customercode){
		this.customercode=customercode;
	}
	public String getCustomercode(){
		return customercode;
	}
	
	public void setCause(String cause){
		this.cause=cause;
	}
	public String getCause(){
		return cause;
	}
	
	public void setSummary(String summary){
		this.summary=summary;
	}
	public String getSummary(){
		return summary;
	}
	
	public void setComponenttype(String componenttype){
		this.componenttype=componenttype;
	}
	public String getComponenttype(){
		return componenttype;
	}
	
	public void setOstype(String ostype){
		this.ostype=ostype;
	}
	public String getOstype(){
		return ostype;
	}
	
	public void setIdentifier(String identifier){
		this.identifier=identifier;
	}
	public String getIdentifier(){
		return identifier;
	}
	
	public void setTicketstatus(String ticketstatus){
		this.ticketstatus=ticketstatus;
	}
	public String getTicketstatus(){
		return ticketstatus;
	}
	
	public void setLastoccurrence(Date lastoccurrence){
		this.lastocccurrence=lastoccurrence;
	}
	public Date getLastoccurrence(){
		return lastocccurrence;
	}
	public void setNode(String node){
		this.node=node;
	}
	public String getNode(){
		return node;
	}
	public void setResolution(String resolution){
		this.resolution=resolution;
	}
	public String getResolution(){
		return resolution;
	}
	
	public void setServername(String servername){
		this.servername=servername;
	}
	public String getServername(){
		return servername;
	}
	
	public void setAlertgroup(String alertgroup){
		this.alertgroup=alertgroup;
	}
	public String getAlertgroup(){
		return alertgroup;
	}
	
	public void setComponent(String component){
		this.component=component;
	}
	
	public String getComponent(){
		return component;
	}
	
	public void setTicketnumber(String ticketnumber){
		this.ticketnumber=ticketnumber;
	}
	public String getTicketnumber(){
		return ticketnumber;
	}
	public void setFirstoccurrence(Date firstoccurrence){
		this.firstoccurrence=firstoccurrence;
	}
	public Date getFirstoccurrence(){
		return firstoccurrence;
	}
	
	public void setSeverity(String severity){
		this.severity=severity;
	}
	public String getSeverity(){
		return severity;
	}
}
