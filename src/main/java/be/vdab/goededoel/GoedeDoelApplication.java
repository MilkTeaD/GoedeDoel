package be.vdab.goededoel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.math.BigDecimal;

@SpringBootApplication
public class GoedeDoelApplication extends SpringBootServletInitializer {
	private BigDecimal opbrengst = BigDecimal.ZERO;
	public static void main(String[] args) {
		SpringApplication.run(GoedeDoelApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GoedeDoelApplication.class);
	}
}
