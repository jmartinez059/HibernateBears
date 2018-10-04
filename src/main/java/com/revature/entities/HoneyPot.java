package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HONEYPOT")
public class HoneyPot {
	
	@Override
	public String toString() {
		return "HoneyPot [honeypotId=" + honeypotId + ", amount=" + amount + ", volume=" + volume + "]";
	}
	public synchronized int getHoneypotId() {
		return honeypotId;
	}
	public synchronized void setHoneypotId(Integer honeypotId) {
		this.honeypotId = honeypotId;
	}
	public synchronized double getAmount() {
		return amount;
	}
	public synchronized void setAmount(Double amount) {
		this.amount = amount;
	}
	public synchronized double getVolume() {
		return volume;
	}
	public synchronized void setVolume(Double volume) {
		this.volume = volume;
	}
	public HoneyPot(int honeypotId, double amount, double volume) {
		this.honeypotId = honeypotId;
		this.amount = amount;
		this.volume = volume;
	}
	public HoneyPot() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name="HONEYPOT_ID")
	@SequenceGenerator(name="HONEYPOTID_SEQ", sequenceName="HONEYPOT_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HONEYPOTID_SEQ")
	Integer honeypotId;
	
	@Column(name="HONEYPOT_AMOUNT")
	Double amount;
	
	@Column(name="VOLUME")
	Double volume;
	
}
