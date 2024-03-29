package com.restjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloud-vendor-info")
public class CloudVendor {
	
	@Id
	public String cloudVendorId;
	public String cloudVendorName;
	public String cloudVendorPhone;
	public String cloudVendorAddress;
	public String getCloudVendorId() {
		return cloudVendorId;
	}
	public void setCloudVendorId(String cloudVendorId) {
		this.cloudVendorId = cloudVendorId;
	}
	public String getCloudVendorName() {
		return cloudVendorName;
	}
	public void setCloudVendorName(String cloudVendorName) {
		this.cloudVendorName = cloudVendorName;
	}
	public String getCloudVendorPhone() {
		return cloudVendorPhone;
	}
	public void setCloudVendorPhone(String cloudVendorPhone) {
		this.cloudVendorPhone = cloudVendorPhone;
	}
	public String getCloudVendorAddress() {
		return cloudVendorAddress;
	}
	public void setCloudVendorAddress(String cloudVendorAddress) {
		this.cloudVendorAddress = cloudVendorAddress;
	}
	
	public CloudVendor(String cloudVendorId, String cloudVendorName, String cloudVendorPhone,
			String cloudVendorAddress) {
		super();
		this.cloudVendorId = cloudVendorId;
		this.cloudVendorName = cloudVendorName;
		this.cloudVendorPhone = cloudVendorPhone;
		this.cloudVendorAddress = cloudVendorAddress;
	}
	@Override
	public String toString() {
		return "CloudVendor [cloudVendorId=" + cloudVendorId + ", cloudVendorName=" + cloudVendorName
				+ ", cloudVendorPhone=" + cloudVendorPhone + ", cloudVendorAddress=" + cloudVendorAddress + "]";
	}
	public CloudVendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
