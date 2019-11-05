package other;

import mybatis.BaseMapperTest;
import mybatis.dao.SysUserMapper;
import mybatis.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class h1Test extends BaseMapperTest { //一定要extends BaseMapper 才能用getSqlSession
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

