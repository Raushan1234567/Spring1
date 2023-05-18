package com.raushan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		geberateobj vari=Product::new;
		Product s1,s2,s3,s4,s5;
	    s1=vari.createobj(3, "Raushan2", 40000, 43);
		s2=vari.createobj(36, "Raushan4", 50000, 3);
		s3=vari.createobj(33, "Raushan6", 60000, 23);
		s4=vari.createobj(31, "Raushan8", 70000, 13);
		s5=vari.createobj(32, "Raushan", 20000, 26);
		
List<Product> mainstore=Arrays.asList(s1,s2,s3,s4,s5);
System.out.println("Original Product list");
mainstore.stream().forEach(System.out::println);

System.out.println("Filtered list");
List<Product> anotherList = mainstore.stream().filter(s -> s.getQuant() >10).collect(Collectors.toList());
anotherList .stream().forEach(System.out::println);


System.out.println("Sorted List");
anotherList = anotherList.stream().sorted((d1, d2) -> d1.getPrice() < d2.getPrice() ? -1 :1).toList();
anotherList .stream().forEach(System.out::println);
	}

}
