package pl.dbtool.models;

import java.util.List;
import java.util.Map;

public class DBModel {

	private String connection;
	private String table;
	private String columnIDName;
	private Object columnIDValue;
	private Map<String, Object> fields;
	private List<DBJoinTable> joinTables;
	
	public String getColumnIDName() {
		return columnIDName;
	}
	public void setColumnIDName(String columnIDName) {
		this.columnIDName = columnIDName;
	}
	public Object getColumnIDValue() {
		return columnIDValue;
	}
	public void setColumnIDValue(Object columnIDValue) {
		this.columnIDValue = columnIDValue;
	}
	
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	public Map<String, Object> getFields() {
		return fields;
	}
	public void setFields(Map<String, Object> fields) {
		this.fields = fields;
	}
	public List<DBJoinTable> getJoinTables() {
		return joinTables;
	}
	public void setJoinTables(List<DBJoinTable> joinTables) {
		this.joinTables = joinTables;
	}
}
