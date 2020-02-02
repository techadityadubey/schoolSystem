package com.springboot.web.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="DTDWisePerformance")
public class DTDWisePerformance {

	@Id
	@Column(name="DTDWisePerformanceId")
	private BigInteger dtdWisePerformanceId;
	
	@Column(name="DTD")
	private String dtd;
	
	@Column(name="TAT")
	private String tat ;
	
	@Column(name="QUALITY")
	private String  quality;
	
	@Column(name="PROCESSING")
	private String  processing;
	
	@Column(name="ACCURACY")
	private String accuracy;

	public BigInteger getDtdWisePerformanceId() {
		return dtdWisePerformanceId;
	}

	public void setDtdWisePerformanceId(BigInteger dtdWisePerformanceId) {
		this.dtdWisePerformanceId = dtdWisePerformanceId;
	}

	public String getDtd() {
		return dtd;
	}

	public void setDtd(String dtd) {
		this.dtd = dtd;
	}

	public String getTat() {
		return tat;
	}

	public void setTat(String tat) {
		this.tat = tat;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	public String getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	
	

}