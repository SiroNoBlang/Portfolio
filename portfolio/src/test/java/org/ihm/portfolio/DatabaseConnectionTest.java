package org.ihm.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "file:src/main/webapp/WEB-INF/spring/db-context.xml"
})
public class DatabaseConnectionTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testDatabaseConnection() {
        // 간단한 쿼리로 데이터베이스 연결을 확인
        String query = "SELECT 1";
        Integer result = jdbcTemplate.queryForObject(query, Integer.class);

        // 결과가 1이면 성공
        Assert.assertEquals(Integer.valueOf(1), result);
    }
    
    /*
     * @RunWith(SpringJUnit4ClassRunner.class): SpringJUnit4ClassRunner 를 사용하여 테스트 클래스가 Spring 컨텍스트 내에서 실행되도록 설정합니다. 
     * @ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}): root-context.xml 설정 파일을 로드하여, 이 설정에 따라 Spring 이 데이터베이스 연결을 설정하도록 합니다. 
     * @Autowired JdbcTemplate: JdbcTemplate 이 정상적으로 주입되었는지 확인하고, 이를 통해 간단한 SQL 쿼리를 실행합니다. 
     * queryForObject: SQL 쿼리 "SELECT 1" 을 실행하여, 결과가 1 인지를 확인합니다. 만약 데이터베이스 연결이 올바르지 않다면, 이 테스트는 실패하게 됩니다.
     * */
    
}
