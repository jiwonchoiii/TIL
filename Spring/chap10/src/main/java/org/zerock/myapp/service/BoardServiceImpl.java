package org.zerock.myapp.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.myapp.domain.BoardVO;
import org.zerock.myapp.mapper.BoardMapper;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@Service   //@Service로 자바 빈 등록
public class BoardServiceImpl 
   implements BoardService, InitializingBean, DisposableBean{
//이 클래스에서 반환되는 값들이 Model 객체의 데이터가 된다
   
   @Setter(onMethod_= @Autowired)
   private BoardMapper mapper;
   //영속성 계층의 맵퍼도 빈, 서비스 객체도 빈
   //시그널을 보내면 주입 가능
   
   //Spring v4.3 이후부터는 주입받을 필드가 한개이고
   //이 필드를 생성자의 매개변수로 가지는 생성자를 선언하면
   //의존성 주입(DI) signal을 보내지 않아도 스프링이 자동으로 주입
   
   //BoardMapper는 스프링이 빈으로 주입되어있는 객체기 때문에
   //@AllArgsConstructor하면 스프링이 자동 주입가능
//   public BoardServiceImpl(BoardMapper mapper){
//      this.mapper = mapper;
//   }//constructor
   
   
   @Override
   public void afterPropertiesSet() throws Exception {   //빈 객체 생성직후에 호출
      log.debug("afterPropertiesSet() invoked.");
      
      log.info("\t+ mapper : " + this.mapper);
   
   }//afterPropertiesSet
   
   @Override
   public void destroy() throws Exception {   //빈 객체가 파괴되기 직전에 호출
      log.debug("destroy() invoked.");
      
   }//destroy

   //================================================================
   
   
   @Override
   public List<BoardVO> getList() {
      log.debug("getList() invoked.");
      
      Objects.requireNonNull(this.mapper);
      
      return mapper.getList();
   }//getList

   @Override
   public boolean register(BoardVO board) {
      log.debug("register({}) invoked.", board);
      
      Objects.requireNonNull(this.mapper);
      
      int affectedLines = mapper.insertSelectKey(board);
      
      return (affectedLines == 1);
      }//register

   @Override
   public boolean modify(BoardVO board) {
      log.debug("modify({}) invoked.", board);
      
      Objects.requireNonNull(this.mapper);

      return (this.mapper.update(board) == 1);
   }//modify

   @Override
   public boolean remove(Integer bno) {
      log.debug("remove({}) invoked.", bno);
      
      Objects.requireNonNull(this.mapper);
      
      return (this.mapper.delete(bno) == 1);
   }//remove

   @Override
   public BoardVO get(Integer bno) {
      log.debug("get({}) invoked.", bno);
      
      Objects.requireNonNull(this.mapper);
      BoardVO boardDetail = this.mapper.select(bno);
      
      return boardDetail;

      
   }//get

}