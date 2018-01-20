package com.matete.agentmanage.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRecordRecharge<M extends BaseRecordRecharge<M>> extends Model<M> implements IBean {

	public M setID(java.lang.Integer ID) {
		set("ID", ID);
		return (M)this;
	}

	public java.lang.Integer getID() {
		return get("ID");
	}

	public M setRechargeIP(java.lang.String RechargeIP) {
		set("RechargeIP", RechargeIP);
		return (M)this;
	}

	public java.lang.String getRechargeIP() {
		return get("RechargeIP");
	}

	public M setRechargeCount(java.lang.Integer RechargeCount) {
		set("RechargeCount", RechargeCount);
		return (M)this;
	}

	public java.lang.Integer getRechargeCount() {
		return get("RechargeCount");
	}

	public M setAgentId(java.lang.Integer AgentId) {
		set("AgentId", AgentId);
		return (M)this;
	}

	public java.lang.Integer getAgentId() {
		return get("AgentId");
	}

	public M setRechargeObject(java.lang.Integer RechargeObject) {
		set("RechargeObject", RechargeObject);
		return (M)this;
	}

	public java.lang.Integer getRechargeObject() {
		return get("RechargeObject");
	}

	public M setToId(java.lang.Integer ToId) {
		set("ToId", ToId);
		return (M)this;
	}

	public java.lang.Integer getToId() {
		return get("ToId");
	}

	public M setType(java.lang.Integer Type) {
		set("Type", Type);
		return (M)this;
	}

	public java.lang.Integer getType() {
		return get("Type");
	}

	public M setCreateTime(java.util.Date CreateTime) {
		set("CreateTime", CreateTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("CreateTime");
	}

}