package org.nicsoft.jdbc.CSV;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Logger;

import java.lang.RuntimeException;

public class CSVDriver implements Driver {
	
	private static final String JDBC_URL_PREFIX = "jdbc:csv";
	
	// This static block initializes the driver when the class is loaded by the JVM.
	static {
		try {
			DriverManager.registerDriver(new CSVDriver());
		} catch (SQLException e) {
			throw new RuntimeException("Could not load CSV driver: " + e.getMessage());
		}
	}
	
	public CSVDriver() {
		;
	}
	
	public boolean acceptsURL(String url) {
		return true;
	}
	public CSVConnection connect(String url, Properties info) throws SQLException {
		
		if(url == null) {
			throw new SQLException("null is not a valid url");
		}
		
		if(url.startsWith(CSVDriver.JDBC_URL_PREFIX)) {
			return new CSVConnection();
		}
		
		throw new SQLException("Invalid url prefix. Valid prefix is \"" + CSVDriver.JDBC_URL_PREFIX + "\".");
		
	}
	public int getMajorVersion() {
		return 1;
	}
	public int getMinorVersion() {
		return 0;
	}
	public Logger getParentLogger() {
		return null;
	}
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) {
		return null;
	}
	public boolean jdbcCompliant() {
		return false;
	}
	
	public static void main(String args[]) throws Exception {
		
		CSVDriver ed = new CSVDriver();
		CSVConnection ec = ed.connect(CSVDriver.JDBC_URL_PREFIX, null);
		CSVStatement es = ec.createStatement();
		
		CSVResultSet ers =
			es.executeQuery(args[0]);
		
		int rowIndex = 0;
		
		for(int i=0; i<ers.getMetaData().getColumnCount(); i++) {
			System.out.print(
				(i>0 ? ";" : "") + ers.getMetaData().getColumnName(i+1)
			);
		}
		System.out.println();
		
		while(ers.next() && rowIndex++ < 21) {
			for(int i=0; i<ers.getMetaData().getColumnCount(); i++) {
				System.out.print(
					(i>0 ? ";" : "") + ers.getString(i+1)
				);
			}
			System.out.println();
		}
		
		System.out.println("Done");
		
		ers.beforeFirst();
		
		rowIndex = 0;
		
		while(ers.next() && rowIndex++ < 21) {
			for(int i=0; i<ers.getMetaData().getColumnCount(); i++) {
				System.out.print(
					(i>0 ? ";" : "") + ers.getString(i+1)
				);
			}
			System.out.println();
		}
		
		System.out.println("Done");
		
		ers.close();
		
	}
}