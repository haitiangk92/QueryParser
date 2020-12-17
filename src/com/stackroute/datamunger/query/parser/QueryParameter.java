package com.stackroute.datamunger.query.parser;

import java.util.List;

/* 
 * This class will contain the elements of the parsed Query String such as 
 * - conditions
 * - logical operators
 * - aggregate functions
 * - file name
 * - fields
 * - group by fields
 * - order by fields
 */

public class QueryParameter {
	
	String fileName;
	String baseQuery;
	List<Restriction>  restrictions;
	List<String> logicalOperators;
	List<String> fields;
	List<AggregateFunction> aggregateFunctions;
	List<String> groupByFields;
	List<String> orderByFields;
	
	
	
	public QueryParameter() {
		fileName = null;
		baseQuery = null;
		restrictions = null;
		logicalOperators = null;
		fields = null;
		aggregateFunctions = null;
		groupByFields = null;
		orderByFields = null;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setBaseQuery(String baseQuery) {
		this.baseQuery = baseQuery;
	}
	public void setRestrictions(List<Restriction> restrictions) {
		this.restrictions = restrictions;
	}
	public void setLogicalOperators(List<String> logicalOperators) {
		this.logicalOperators = logicalOperators;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	}
	public void setAggregateFunctions(List<AggregateFunction> aggregateFunctions) {
		this.aggregateFunctions = aggregateFunctions;
	}
	public void setGroupByFields(List<String> groupByFields) {
		this.groupByFields = groupByFields;
	}
	public void setOrderByFields(List<String> orderByFields) {
		this.orderByFields = orderByFields;
	}
	@Override
	public String toString() {
		return "QueryParameter [fileName = " + fileName + ", baseQuery = " + baseQuery + ", restrictions = " + restrictions
				+ ", logicalOperators = " + logicalOperators + ", fields = " + fields + ", aggregateFunctions = "
				+ aggregateFunctions + ", groupByFields = " + groupByFields + ", orderByFields = " + orderByFields + "]";
	}
		
}