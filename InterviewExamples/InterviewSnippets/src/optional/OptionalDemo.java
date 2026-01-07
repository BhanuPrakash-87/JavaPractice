package optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Optional<Customer> Optionalcustomer = findCustomerByName("Bhanu");
		System.out.println(Optionalcustomer.get().getEmail());
		
		/*
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
		
		/*
		System.out.println(emailOptional2.orElseThrow(() -> new IllegalArgumentException("email not present")));
		
		System.out.println(emailOptional2.map(String::toUpperCase));
		*/
	}
	
	private static Optional<Customer> findCustomerByName(String name) {
		
		Customer customer = new Customer(101, name, "abc");
		//return Optional.ofNullable(customer);
		return Optional.empty();
	}
}
