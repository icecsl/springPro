package base.profiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DataSourceConfigTest {


    /*java配置 dev环境 测试*/
    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = DataSourceConfig.class)
    @ActiveProfiles("dev")
    public static class DevDataSourceTest{

      @Autowired
      private DataSource dataSource;

      @Test
      public void shouldBeEmbeddedDatasource(){
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        List<String> results = jdbc.query("select id, name from Things", new RowMapper<String>() {
          @Override
          public String mapRow(ResultSet rs, int rowNum) throws SQLException {
            return rs.getLong("id") + ":" + rs.getString("name");
          }
        });

        System.out.println(results);
      }
    }


    /*xml配置 dev环境 测试*/
    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:xml/base/datasource-config.xml")
    @ActiveProfiles("dev")
    public static class DevDataSourceTest_XMLConfig {
      @Autowired
      private DataSource dataSource;

      @Test
      public void shouldBeEmbeddedDatasource() {
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        List<String> results = jdbc.query("select id, name from Things", new RowMapper<String>() {
          @Override
          public String mapRow(ResultSet rs, int rowNum) throws SQLException {
            return rs.getLong("id") + ":" + rs.getString("name");
          }
        });

        System.out.println(results);
      }
    }

}
