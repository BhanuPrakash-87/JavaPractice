package optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Customer customer = new Customer(101, "Bhanu", "abc");
		
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		//Optional<String> emailOptional = Optional.of(customer.getEmail());
		//System.out.println(emailOptional);
		
		Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
		/*
		if (emailOptional2.isPresent()) {
			System.out.println(emailOptional2.get());
		}
		*/
		
		//System.out.println(emailOptional2.orElse("default"));
		
		System.out.println(emailOptional2.orElseThrow(() -> new IllegalArgumentException("email not present")));
		
		System.out.println(emailOptional2.map(String::toUpperCase));
	}
}
