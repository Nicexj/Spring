package com.spring.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
		private String name;
		private Integer age;
		
		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}
		
		
}
