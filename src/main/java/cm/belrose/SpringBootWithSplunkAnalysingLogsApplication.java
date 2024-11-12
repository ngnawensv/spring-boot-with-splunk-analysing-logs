package cm.belrose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootWithSplunkAnalysingLogsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithSplunkAnalysingLogsApplication.class, args);
	}
	@Bean
	public WebServerFactoryCustomizer<TomcatServletWebServerFactory> tomcatCustomizer() {
		return tomcat -> {
			// Disable the native library
			tomcat.setDisableMBeanRegistry(false);
			// Add more customizations if needed
		};
	}
}
