package com.jorgemr.projects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rule {
	String name;
	String statement;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Rule [name=" + name + ", statement=" + statement + " ,trans="+ trans() +"]";
	}

}
