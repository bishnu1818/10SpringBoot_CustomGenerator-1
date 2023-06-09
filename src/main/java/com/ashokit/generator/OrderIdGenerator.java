package com.ashokit.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prifix = "OD";
		Integer suffix = null;
		try {
			Connection connection = session.connection();
			Statement createStatement = connection.createStatement();
			String sql = "select order_id_seq.nextval from dual";
			ResultSet rs = createStatement.executeQuery(sql);
			if (rs.next()) {
				suffix = rs.getInt(1);
				// suffix=String.valueOf(seqval);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return prifix + suffix;
	}
}
