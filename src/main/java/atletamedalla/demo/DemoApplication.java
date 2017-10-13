package atletamedalla.demo;

import atletamedalla.demo.service.AtletaService;
import atletamedalla.demo.service.MedallaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {


	ConfigurableApplicationContext context= SpringApplication.run(DemoApplication.class, args);


	context.getBean(MedallaService.class).testMedalla();
	context.getBean(AtletaService.class).testAtleta();

}
