package com.wisely.highlight_spring4.ch2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Service
@Scope("prototype")  //String value() default "singleton";
public class DemoPrototypeService {

}
