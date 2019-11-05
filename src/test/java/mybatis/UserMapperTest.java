package mybatis;

import mybatis.dao.SysUserMapper;
import mybatis.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UserMapperTest extends BaseMapperTest {
    @Test
    public void testUpdateByMap(){
        SqlSession sqlSession =  getSqlSession();
        try{
            SysUserMapper userMapper = sqlSession .getMapper(SysUserMapper.class);
           SysUser sysUser = userMapper.selectUserAndRoleById(1001L);

            System.out.println(sysUser.getUserName()+sysUser.getUserEmail());


        }
        finally {

            sqlSession.close();
        }
    }
}
