package com.nitin.springAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTech implements MobileProcessor {

	public void process() {
		System.out.println("2nd best");

	}

}
