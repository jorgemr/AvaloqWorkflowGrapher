package com.jorgemr.projects;

public class Node {
Integer id;
	String intl;

	@Override
	public String toString() {
		return "Node [id=" + id + ", intl=" + intl + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIntl() {
		return intl;
	}

	public void setIntl(String intl) {
		this.intl = intl;
	}

}
