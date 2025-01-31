package org.nicsoft.jdbc.CSV;

import java.sql.Connection;
import java.sql.Struct;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.NClob;
import java.sql.SQLXML;
import java.sql.DatabaseMetaData;
import java.sql.SQLWarning;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.Savepoint;
import java.util.concurrent.Executor;
import java.util.Properties;
import java.util.Map;

public class CSVConnection implements Connection {
	
	public void abort(Executor executor) {
		;
	}
	public void clearWarnings() {
		;
	}
	public void close() {
		;
	}
	public void commit() {
		;
	}
	public Array createArrayOf(String typeName, Object[] elements) {
		return null;
	}
	public Blob createBlob() {
		return null;
	}
	public Clob createClob() {
		return null;
	}
	public NClob createNClob() {
		return null;
	}
	public SQLXML createSQLXML() {
		return null;
	}
	public CSVStatement createStatement() {
		return new CSVStatement();
	}
	public CSVStatement createStatement(int resultSetType, int resultSetConcurrency) {
		return new CSVStatement();
	}
	public CSVStatement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) {
		return new CSVStatement();
	}
	public Struct createStruct(String typeName, Object[] attributes) {
		return null;
	}
	public boolean getAutoCommit() {
		return false;
	}
	public String getCatalog() {
		return null;
	}
	public Properties getClientInfo() {
		return null;
	}
	public String getClientInfo(String name) {
		return null;
	}
	public int getHoldability() {
		return -1;
	}
	public DatabaseMetaData getMetaData() {
		return null;
	}
	public int getNetworkTimeout() {
		return -1;
	}
	public String getSchema() {
		return null;
	}
	public int getTransactionIsolation() {
		return -1;
	}
	public Map<String,Class<?>> getTypeMap() {
		return null;
	}
	public SQLWarning getWarnings() {
		return null;
	}
	public boolean isClosed() {
		return true;
	}
	public boolean isReadOnly() {
		return true;
	}
	public boolean isValid(int timeout) {
		return true;
	}
	public boolean isWrapperFor(Class<?> iface) {
		return true;
	}
	public String nativeSQL(String sql) {
		return null;
	}
	public CallableStatement prepareCall(String sql) {
		return null;
	}
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) {
		return null;
	}
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) {
		return null;
	}
	public PreparedStatement prepareStatement(String sql) {
		return null;
	}
	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) {
		return null;
	}
	public PreparedStatement prepareStatement(String sql, int[] columnIndexes) {
		return null;
	}
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) {
		return null;
	}
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) {
		return null;
	}
	public PreparedStatement prepareStatement(String sql, String[] columnNames) {
		return null;
	}
	public void releaseSavepoint(Savepoint savepoint) {
		;
	}
	public void rollback() {
		;
	}
	public void rollback(Savepoint savepoint) {
		;
	}
	public void setAutoCommit(boolean autoCommit) {
		;
	}
	public void setCatalog(String catalog) {
		;
	}
	public void setClientInfo(Properties properties) {
		;
	}
	public void setClientInfo(String name, String value) {
		;
	}
	public void setHoldability(int holdability) {
		;
	}
	public void setNetworkTimeout(Executor executor, int milliseconds) {
		;
	}
	public void setReadOnly(boolean readOnly) {
		;
	}
	public Savepoint setSavepoint() {
		return null;
	}
	public Savepoint setSavepoint(String name) {
		return null;
	}
	public void setSchema(String schema) {
		;
	}
	public void setTransactionIsolation(int level) {
		;
	}
	public void setTypeMap(Map<String,Class<?>> map) {
		;
	}
	public <T> T unwrap(Class<T> iface) {
		return null;
	}
	
	public static void main(String args[]) {
		System.out.println("Hello");
	}
}