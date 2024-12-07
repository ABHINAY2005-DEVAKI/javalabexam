package com.klef.jfsd.exam.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class Order 
{
	@Id
	private int o_id;
	private String p_name;
	private String p_qua;
	private String o_date;
	private String c_name;
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_qua() {
		return p_qua;
	}
	public void setP_qua(String p_qua) {
		this.p_qua = p_qua;
	}
	public String getO_date() {
		return o_date;
	}
	public void setO_date(String o_date) {
		this.o_date = o_date;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	@Override
	public String toString() {
		return "Order [o_id=" + o_id + ", p_name=" + p_name + ", p_qua=" + p_qua + ", o_date=" + o_date + ", c_name="
				+ c_name + "]";
	}
}
