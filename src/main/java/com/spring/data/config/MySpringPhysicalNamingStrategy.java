package com.spring.data.config;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;

public class MySpringPhysicalNamingStrategy extends SpringPhysicalNamingStrategy {

    /**
     * 为表添加 指定前缀
     */
    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment jdbcEnvironment) {
        return super.toPhysicalTableName(new Identifier("jpa_" + name.getText(), name.isQuoted()), jdbcEnvironment);
    }

}
