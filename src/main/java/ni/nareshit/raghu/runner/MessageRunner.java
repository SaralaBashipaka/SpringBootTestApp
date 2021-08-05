package ni.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
          System.out.println("Hello");
		System.out.println("Modified Data");
	}

}
