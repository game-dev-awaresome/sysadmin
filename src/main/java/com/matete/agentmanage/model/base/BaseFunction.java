package com.matete.agentmanage.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseFunction<M extends BaseFunction<M>> extends Model<M> implements IBean {

	public M setID(java.lang.Integer ID) {
		set("ID", ID);
		return (M)this;
	}

	public java.lang.Integer getID() {
		return get("ID");
	}

	public M setMenuName(java.lang.String MenuName) {
		set("MenuName", MenuName);
		return (M)this;
	}

	public java.lang.String getMenuName() {
		return get("MenuName");
	}

	public M setAccessoryPath(java.lang.String AccessoryPath) {
		set("AccessoryPath", AccessoryPath);
		return (M)this;
	}

	public java.lang.String getAccessoryPath() {
		return get("AccessoryPath");
	}

	public M setClassForm(java.lang.String ClassForm) {
		set("ClassForm", ClassForm);
		return (M)this;
	}

	public java.lang.String getClassForm() {
		return get("ClassForm");
	}

	public M setPriority(java.lang.Integer Priority) {
		set("Priority", Priority);
		return (M)this;
	}

	public java.lang.Integer getPriority() {
		return get("Priority");
	}

	public M setPID(java.lang.Integer PID) {
		set("PID", PID);
		return (M)this;
	}

	public java.lang.Integer getPID() {
		return get("PID");
	}

}
