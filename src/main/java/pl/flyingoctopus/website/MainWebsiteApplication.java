package pl.flyingoctopus.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.flyingoctopus.website.member.model.Member;
import pl.flyingoctopus.website.member.repository.MemberRepository;

@SpringBootApplication
public class MainWebsiteApplication implements CommandLineRunner {

	@Autowired
	private MemberRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MainWebsiteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();

		repository.save(new Member("Andrzej"));
		repository.save(new Member("Michał"));

		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Member member : repository.findAll())
			System.out.println(member);
		System.out.println();

		System.out.println("Customer found with findByFirstName('Andrzej'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByName("Andrzej"));

	}

}
