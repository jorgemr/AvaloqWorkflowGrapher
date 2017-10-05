package com.jorgemr.projects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trans {
	Integer nodeId;
	Integer id;
	String statement;

	public Integer getNodeId() {
		return nodeId;
	}

	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String trans() {
		Pattern pattern = Pattern.compile("trans\\((.*?)\\)");
		Matcher matcher = pattern.matcher(getStatement());
		if (matcher.find())
		{
		    return matcher.group(1);
		}
		return "";
	}
	
	@Override
	public String toString() {
		return "Trans [nodeId=" + nodeId + ", id=" + id + ", statement=" + statement +  " ,trans="+ trans() +"]";
	}

}
