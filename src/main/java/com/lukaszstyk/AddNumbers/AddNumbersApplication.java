package com.lukaszstyk.AddNumbers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class AddNumbersApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddNumbersApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(AddNumbersApplication.class);

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			String url = "https://api.random.org/json-rpc/2/invoke";
			String requestJson ="{\n" +
					"    \"jsonrpc\": \"2.0\",\n" +
					"    \"method\": \"generateIntegers\",\n" +
					"    \"params\": {\n" +
					"        \"apiKey\": \"6126e388-0e8c-4be9-8079-4816fd0fc016\",\n" +
					"        \"n\": 1,\n" +
					"        \"min\": -999999999,\n" +
					"        \"max\": 1000000000,\n" +
					"        \"replacement\": true\n" +
					"    },\n" +
					"    \"id\": 42\n" +
					"}";
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<String> entity = new HttpEntity<String>(requestJson,headers);
			RandomOrgResponse randomOrgResponse = restTemplate.postForObject(url, entity, RandomOrgResponse.class);

			int appNumber = ThreadLocalRandom.current().nextInt();
			int randomOrgNumber = Integer.parseInt(randomOrgResponse.result.random.data[0]);
			int addingResult = randomOrgNumber + appNumber;

			log.info("Random.org api number: " + randomOrgNumber + ", aplication number: " + appNumber + ", adding resut equals: " + addingResult );
		};
	}
}
