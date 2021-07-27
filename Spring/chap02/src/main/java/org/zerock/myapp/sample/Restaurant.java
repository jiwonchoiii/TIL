package org.zerock.myapp.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

//@Data
@Log4j

@Component("restaurant")
public class Restaurant {
//	annotation을 통해 beans container에 주입시그널을 보낸다
//	@Setter(onMethod_= {@Autowired})
//	@Setter(onMethod_= {@Inject})
//	@Setter(onMethod_= {@Resource})
//	@Setter(onMethod_= {@Resource(type=Chef.class)})
//	
//	@Setter(onMethod_= @Autowired)
//	@Setter(onMethod_= @Inject)
//	@Setter(onMethod_= @Resource)
//	@Setter(onMethod_= @Resource(type=Chef.class))
//	
//	@Autowired
//	@Inject
//	@Resource	
//	@Resource(type=Chef.class)
	private Chef chef;

	//생성자를 통한 의존성 객체의 주입 테스트 
	//Spring v4.3이후로는, 주입할 필드가 1개이고 ,생성자의 매개변수 역시 주입시킬 타입의 필드를
	//매개변수로 가진다면.. 굳이 주입시그널을 보내지 않아도, 자동으로 의존성객체를 주입
//	@Autowired
	public Restaurant(Chef chef) {
		log.debug(String.format("Restaurant(%s) invoked.", chef));
		
		this.chef=chef;
	} // default constructor

//	@Autowired // 여기에 어노테이션을 붙여야 로그가 찍힘!
	public void setChef(Chef chef) {
		log.debug(
				String.format("setChef(%s) invoked.",chef));
		
		this.chef = chef;
	} // setChef

	public Chef getChef() {
		log.debug("getChef() invoked.");
		
		return chef;
	}
	
	
} // end class
