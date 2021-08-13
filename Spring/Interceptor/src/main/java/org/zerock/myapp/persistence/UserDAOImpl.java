package org.zerock.myapp.persistence;

import java.util.Objects;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.zerock.myapp.domain.LoginDTO;
import org.zerock.myapp.domain.UserVO;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@Repository("userDAO")//컴포넌트 스캔으로 빈으로 등록하고 빈의 이름을 직접 등록 Impl대신 원래의 인터페이스 이름으로!
public class UserDAOImpl 
   implements UserDAO {
   @Setter(onMethod_=@Autowired)
   private SqlSessionFactory sqlSessionFactory;

   @Override
   public UserVO selectUser(LoginDTO dto) throws Exception {
      log.debug("selectUser({}) ivnoked.",dto);
      Objects.requireNonNull(this.sqlSessionFactory);
       
      SqlSession sqlSession = this.sqlSessionFactory.openSession();
      try(sqlSession;){
         String namespace="userMapper";
         String sqlId="selectUser";
         
         String sql = namespace+"."+sqlId;
         
         log.info("\t+ sql:{}",sql);
          
         UserVO userVO = sqlSession.selectOne(sql, dto);// #{}에 값이 넘어가도록 dto
         log.info("\t+ userVO:{}", userVO);
         
         return userVO;
      }//try-with-resources
   }//selectUser

}//end class