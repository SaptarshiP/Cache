package com.psja.entity;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

@Entity
@Table(name ="ERTB_MESSAGE")
@NamedQueries( {@NamedQuery(name = "ErtbMessage.findByApplicationName", query="select o from ErtbMessage o where o.applicationName = :applicationName")} )
public class ErtbMessage {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	@Column(name="ERROR_CODE")
	private String errorCode;
	@Column(name="ERROR_MESSAGE")
	private String errorMessage;
	@Column(name="APPLICATION_NAME")
	private String applicationName;
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void setErrorCode( String errorCode ) {
		this.errorCode = errorCode;
	}
	public String getErrorCode() {
		return this.errorCode;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage() {
		return this.errorMessage;
	}
	
	public String getApplicationName() {
		return this.applicationName;
	}
	public void setApplicationName( String applicationName ) {
		this.applicationName = applicationName;
	}
}
