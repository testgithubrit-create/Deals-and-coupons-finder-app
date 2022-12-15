package com.Payment.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="payment")
public class OrderResponse 
{
	String secretKey;
	String razorpayOrderId;
	String AmountPaid;
	String secretId;
	String pgName;
	String txId;

	public String getTxId() {
		return txId;
	}

	public void setTxId(String txId) {
		this.txId = txId;
	}

	public String getPgName() {
		return pgName;
	}

	public void setPgName(String pgName) {
		this.pgName = pgName;
	}

	public String getSecretId() {
		return secretId;
	}

	public void setSecretId(String secretId) {
		this.secretId = secretId;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getRazorpayOrderId() {
		return razorpayOrderId;
	}

	public void setRazorpayOrderId(String razorpayOrderId) {
		this.razorpayOrderId = razorpayOrderId;
	}

	public String getApplicationFee() {
		return AmountPaid;
	}

	public void setApplicationFee(String applicationFee) {
		this.AmountPaid = applicationFee;
	}

}
