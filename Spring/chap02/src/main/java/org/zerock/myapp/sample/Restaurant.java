package org.zerock.myapp.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data

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
	@Autowired
//	@Inject
//	@Resource	
//	@Resource(type=Chef.class)
	private Chef chef;

} // end class
