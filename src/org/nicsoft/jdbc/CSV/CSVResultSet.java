package org.nicsoft.jdbc.CSV;

import java.sql.ResultSet;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.RowId;
import java.sql.SQLXML;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Date;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Map;
import java.net.URL;

import java.io.File;
import java.io.FileInputStream;

public class CSVResultSet implements ResultSet {

	private int columnCount;
	private int rowIndex;
	
	private CSVResultSetMetaData CSVResultSetMetaData;
	
	public CSVResultSet(String csvFilePathe) {
		try {

			this.columnCount = 0;

			// Read first row as header
			String[] columnNames = new String[this.columnCount];

			this.rowIndex = 0;

			for(int i=0; i<this.columnCount; i++) {
				columnNames[i] = this.getRowCellValue(i);
			}

			this.CSVResultSetMetaData =
					new CSVResultSetMetaData(
							this.columnCount,
							columnNames
					);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private InputStream getFileInputStream(String filePath) throws Exception {
		
		boolean isHttpUrl = false;
		
		if(filePath.indexOf("http") == 0) {
			isHttpUrl = true;
		}
		
		if(isHttpUrl) {
			return (new URL(filePath)).openStream();
		}
		
		return new FileInputStream(new File(filePath));
	}
	
	private String getRowCellValue(int columnIndex) {
		
		if(columnIndex >= this.columnCount || columnIndex < 0) {
			return null;
		}
		
		return "";
		
	}
	
	public boolean absolute(int row) {
		return false;
	}
	public void afterLast() {
		;
	}
	public void beforeFirst() {
		this.rowIndex = 0;
	}
	public void cancelRowUpdates() {
		;
	}
	public void clearWarnings() {
		;
	}
	public void close() {
		;
	}
	public void deleteRow() {
		;
	}
	public int findColumn(String columnLabel) {
		return -1;
	}
	public boolean first() {
		this.rowIndex = 1;
		return true;
	}
	public Array getArray(int columnIndex) {
		return null;
	}
	public Array getArray(String columnLabel) {
		return null;
	}
	public InputStream getAsciiStream(int columnIndex) {
		return null;
	}
	public InputStream getAsciiStream(String columnLabel) {
		return null;
	}
	public BigDecimal getBigDecimal(int columnIndex) {
		return null;
	}
	public BigDecimal getBigDecimal(int columnIndex, int scale) {
		return null;
	}
	public BigDecimal getBigDecimal(String columnLabel) {
		return null;
	}
	public BigDecimal getBigDecimal(String columnLabel, int scale) {
		return null;
	}
	public InputStream getBinaryStream(int columnIndex) {
		return null;
	}
	public InputStream getBinaryStream(String columnLabel) {
		return null;
	}
	public Blob getBlob(int columnIndex) {
		return null;
	}
	public Blob getBlob(String columnLabel) {
		return null;
	}
	public boolean getBoolean(int columnIndex) {
		return false;
	}
	public boolean getBoolean(String columnLabel) {
		return false;
	}
	public byte getByte(int columnIndex) {
		return 0xf;
	}
	public byte getByte(String columnLabel) {
		return 0xf;
	}
	public byte[] getBytes(int columnIndex) {
		return null;
	}
	public byte[] getBytes(String columnLabel) {
		return null;
	}
	public Reader getCharacterStream(int columnIndex) {
		return null;
	}
	public Reader getCharacterStream(String columnLabel) {
		return null;
	}
	public Clob getClob(int columnIndex) {
		return null;
	}
	public Clob getClob(String columnLabel) {
		return null;
	}
	public int getConcurrency() {
		return -1;
	}
	public String getCursorName() {
		return null;
	}
	public Date getDate(int columnIndex) {
		return null;
	}
	public Date getDate(int columnIndex, Calendar cal) {
		return null;
	}
	public Date getDate(String columnLabel) {
		return null;
	}
	public Date getDate(String columnLabel, Calendar cal) {
		return null;
	}
	public double getDouble(int columnIndex) {
		return 0.0;
	}
	public double getDouble(String columnLabel) {
		return 0.0;
	}
	public int getFetchDirection() {
		return -1;
	}
	public int getFetchSize() {
		return -1;
	}
	public float getFloat(int columnIndex) {
		return 0;
	}
	public float getFloat(String columnLabel) {
		return 0;
	}
	public int getHoldability() {
		return -1;
	}
	public int getInt(int columnIndex) {
		return -1;
	}
	public int getInt(String columnLabel) {
		return -1;
	}
	public long getLong(int columnIndex) {
		return -1;
	}
	public long getLong(String columnLabel) {
		return -1;
	}
	public CSVResultSetMetaData getMetaData() {
		return this.CSVResultSetMetaData;
	}
	public Reader getNCharacterStream(int columnIndex) {
		return null;
	}
	public Reader getNCharacterStream(String columnLabel) {
		return null;
	}
	public NClob getNClob(int columnIndex) {
		return null;
	}
	public NClob getNClob(String columnLabel) {
		return null;
	}
	public String getNString(int columnIndex) {
		return null;
	}
	public String getNString(String columnLabel) {
		return null;
	}
	public Object getObject(int columnIndex) {
		return this.getString(columnIndex);
	}
	public <T> T getObject(int columnIndex, Class<T> type) {
		return null;
	}
	public Object getObject(int columnIndex, Map<String,Class<?>> map) {
		return null;
	}
	public Object getObject(String columnLabel) {
		return null;
	}
	public <T> T getObject(String columnLabel, Class<T> type) {
		return null;
	}
	public Object getObject(String columnLabel, Map<String,Class<?>> map) {
		return null;
	}
	public Ref getRef(int columnIndex) {
		return null;
	}
	public Ref getRef(String columnLabel) {
		return null;
	}
	public int getRow() {
		return -1;
	}
	public RowId getRowId(int columnIndex) {
		return null;
	}
	public RowId getRowId(String columnLabel) {
		return null;
	}
	public short getShort(int columnIndex) {
		return -1;
	}
	public short getShort(String columnLabel) {
		return -1;
	}
	public SQLXML getSQLXML(int columnIndex) {
		return null;
	}
	public SQLXML getSQLXML(String columnLabel) {
		return null;
	}
	public Statement getStatement() {
		return null;
	}
	public String getString(int columnIndex) {
		return this.getRowCellValue(columnIndex-1);
	}
	public String getString(String columnLabel) {
		return null;
	}
	public Time getTime(int columnIndex) {
		return null;
	}
	public Time getTime(int columnIndex, Calendar cal) {
		return null;
	}
	public Time getTime(String columnLabel) {
		return null;
	}
	public Time getTime(String columnLabel, Calendar cal) {
		return null;
	}
	public Timestamp getTimestamp(int columnIndex) {
		return null;
	}
	public Timestamp getTimestamp(int columnIndex, Calendar cal) {
		return null;
	}
	public Timestamp getTimestamp(String columnLabel) {
		return null;
	}
	public Timestamp getTimestamp(String columnLabel, Calendar cal) {
		return null;
	}
	public int getType() {
		return -1;
	}
	public InputStream getUnicodeStream(int columnIndex) {
		return null;
	}
	public InputStream getUnicodeStream(String columnLabel) {
		return null;
	}
	public URL getURL(int columnIndex) {
		return null;
	}
	public URL getURL(String columnLabel) {
		return null;
	}
	public SQLWarning getWarnings() {
		return null;
	}
	public void insertRow() {
		;
	}
	public boolean isAfterLast() {
		return false;
	}
	public boolean isBeforeFirst() {
		return (this.rowIndex == 0);
	}
	public boolean isClosed() {
		return false;
	}
	public boolean isFirst() {
		return false;
	}
	public boolean isLast() {
		return false;
	}
	public boolean isWrapperFor(Class<?> iface) {
		return true;
	}
	public boolean last() {
		return false;
	}
	public void moveToCurrentRow() {
		;
	}
	public void moveToInsertRow() {
		;
	}
	public boolean next() {
		
		return false;
		
	}
	public boolean previous() {
		return false;
	}
	public void refreshRow() {
		;
	}
	public boolean relative(int rows) {
		return false;
	}
	public boolean rowDeleted() {
		return false;
	}
	public boolean rowInserted() {
		return false;
	}
	public boolean rowUpdated() {
		return false;
	}
	public void setFetchDirection(int direction) {
		;
	}
	public void setFetchSize(int rows) {
		;
	}
	public <T> T unwrap(Class<T> iface) {
		return null;
	}
	public void updateArray(int columnIndex, Array x) {
		;
	}
	public void updateArray(String columnLabel, Array x) {
		;
	}
	public void updateAsciiStream(int columnIndex, InputStream x) {
		;
	}
	public void updateAsciiStream(int columnIndex, InputStream x, int length) {
		;
	}
	public void updateAsciiStream(int columnIndex, InputStream x, long length) {
		;
	}
	public void updateAsciiStream(String columnLabel, InputStream x) {
		;
	}
	public void updateAsciiStream(String columnLabel, InputStream x, int length) {
		;
	}
	public void updateAsciiStream(String columnLabel, InputStream x, long length) {
		;
	}
	public void updateBigDecimal(int columnIndex, BigDecimal x) {
		;
	}
	public void updateBigDecimal(String columnLabel, BigDecimal x) {
		;
	}
	public void updateBinaryStream(int columnIndex, InputStream x) {
		;
	}
	public void updateBinaryStream(int columnIndex, InputStream x, int length) {
		;
	}
	public void updateBinaryStream(int columnIndex, InputStream x, long length) {
		;
	}
	public void updateBinaryStream(String columnLabel, InputStream x) {
		;
	}
	public void updateBinaryStream(String columnLabel, InputStream x, int length) {
		;
	}
	public void updateBinaryStream(String columnLabel, InputStream x, long length) {
		;
	}
	public void updateBlob(int columnIndex, Blob x) {
		;
	}
	public void updateBlob(int columnIndex, InputStream inputStream) {
		;
	}
	public void updateBlob(int columnIndex, InputStream inputStream, long length) {
		;
	}
	public void updateBlob(String columnLabel, Blob x) {
		;
	}
	public void updateBlob(String columnLabel, InputStream inputStream) {
		;
	}
	public void updateBlob(String columnLabel, InputStream inputStream, long length) {
		;
	}
	public void updateBoolean(int columnIndex, boolean x) {
		;
	}
	public void updateBoolean(String columnLabel, boolean x) {
		;
	}
	public void updateByte(int columnIndex, byte x) {
		;
	}
	public void updateByte(String columnLabel, byte x) {
		;
	}
	public void updateBytes(int columnIndex, byte[] x) {
		;
	}
	public void updateBytes(String columnLabel, byte[] x) {
		;
	}
	public void updateCharacterStream(int columnIndex, Reader x) {
		;
	}
	public void updateCharacterStream(int columnIndex, Reader x, int length) {
		;
	}
	public void updateCharacterStream(int columnIndex, Reader x, long length) {
		;
	}
	public void updateCharacterStream(String columnLabel, Reader reader) {
		;
	}
	public void updateCharacterStream(String columnLabel, Reader reader, int length) {
		;
	}
	public void updateCharacterStream(String columnLabel, Reader reader, long length) {
		;
	}
	public void updateClob(int columnIndex, Clob x) {
		;
	}
	public void updateClob(int columnIndex, Reader reader) {
		;
	}
	public void updateClob(int columnIndex, Reader reader, long length) {
		;
	}
	public void updateClob(String columnLabel, Clob x) {
		;
	}
	public void updateClob(String columnLabel, Reader reader) {
		;
	}
	public void updateClob(String columnLabel, Reader reader, long length) {
		;
	}
	public void updateDate(int columnIndex, Date x) {
		;
	}
	public void updateDate(String columnLabel, Date x) {
		;
	}
	public void updateDouble(int columnIndex, double x) {
		;
	}
	public void updateDouble(String columnLabel, double x) {
		;
	}
	public void updateFloat(int columnIndex, float x) {
		;
	}
	public void updateFloat(String columnLabel, float x) {
		;
	}
	public void updateInt(int columnIndex, int x) {
		;
	}
	public void updateInt(String columnLabel, int x) {
		;
	}
	public void updateLong(int columnIndex, long x) {
		;
	}
	public void updateLong(String columnLabel, long x) {
		;
	}
	public void updateNCharacterStream(int columnIndex, Reader x) {
		;
	}
	public void updateNCharacterStream(int columnIndex, Reader x, long length) {
		;
	}
	public void updateNCharacterStream(String columnLabel, Reader reader) {
		;
	}
	public void updateNCharacterStream(String columnLabel, Reader reader, long length) {
		;
	}
	public void updateNClob(int columnIndex, NClob nClob) {
		;
	}
	public void updateNClob(int columnIndex, Reader reader) {
		;
	}
	public void updateNClob(int columnIndex, Reader reader, long length) {
		;
	}
	public void updateNClob(String columnLabel, NClob nClob) {
		;
	}
	public void updateNClob(String columnLabel, Reader reader) {
		;
	}
	public void updateNClob(String columnLabel, Reader reader, long length) {
		;
	}
	public void updateNString(int columnIndex, String nString) {
		;
	}
	public void updateNString(String columnLabel, String nString) {
		;
	}
	public void updateNull(int columnIndex) {
		;
	}
	public void updateNull(String columnLabel) {
		;
	}
	public void updateObject(int columnIndex, Object x) {
		;
	}
	public void updateObject(int columnIndex, Object x, int scaleOrLength) {
		;
	}
	public void updateObject(String columnLabel, Object x) {
		;
	}
	public void updateObject(String columnLabel, Object x, int scaleOrLength) {
		;
	}
	public void updateRef(int columnIndex, Ref x) {
		;
	}
	public void updateRef(String columnLabel, Ref x) {
		;
	}
	public void updateRow() {
		;
	}
	public void updateRowId(int columnIndex, RowId x) {
		;
	}
	public void updateRowId(String columnLabel, RowId x) {
		;
	}
	public void updateShort(int columnIndex, short x) {
		;
	}
	public void updateShort(String columnLabel, short x) {
		;
	}
	public void updateSQLXML(int columnIndex, SQLXML xmlObject) {
		;
	}
	public void updateSQLXML(String columnLabel, SQLXML xmlObject) {
		;
	}
	public void updateString(int columnIndex, String x) {
		;
	}
	public void updateString(String columnLabel, String x) {
		;
	}
	public void updateTime(int columnIndex, Time x) {
		;
	}
	public void updateTime(String columnLabel, Time x) {
		;
	}
	public void updateTimestamp(int columnIndex, Timestamp x) {
		;
	}
	public void updateTimestamp(String columnLabel, Timestamp x) {
		;
	}
	public boolean wasNull() {
		return false;
	}
	
	public static void main(String args[]) {
		System.out.println("Hello");
	}
}