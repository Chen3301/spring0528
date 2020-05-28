package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
@Test
public void testConnection() {
	
	try {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","book_ex","book_ex");
		log.info(con);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		fail(e.getMessage());
	}
		
		
}

}
