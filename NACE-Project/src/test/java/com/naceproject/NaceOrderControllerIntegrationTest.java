package com.naceproject;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.naceproject.model.Nace;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class NaceOrderControllerIntegrationTest {
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	private String getRootUrl() {
		return "http://localhost:" + port + "/api/v1";
	}

	@Test
	public void contextLoads() {

	}

	@Test
	public void testGetAllOrders() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/allOrders",
				HttpMethod.GET, entity, String.class);

		assertNotNull(response.getBody());
	}

	@Test
	public void testGetOrdersById() {
		Nace nace = restTemplate.getForObject(getRootUrl() + "/orders/398481", Nace.class);
		System.out.println(nace.getOrder());
		assertNotNull(nace);
	}

	@Test
	public void testCreateOrder() {
		Nace nace = new Nace();
		nace.setCode("A");
		nace.setDescription("AGRICULTURE, FORESTRY AND FISHING");
		nace.setThisItemIncludes("This section includes the exploitation of vegetal and animal natural resources, comprising the activities of growing of crops, raising and breeding of animals, harvesting of timber " +
                "and other plants, animals or animal products from a farm or their natural habitats.");
        nace.setThisItemAlsoIncludes("Test");
        nace.setLevel("1");
        nace.setOrder(398481);
        nace.setRef("A");
		ResponseEntity<Nace> postResponse = restTemplate.postForEntity(getRootUrl() + "/saveOrders", nace, Nace.class);
		assertNotNull(postResponse);
		assertNotNull(postResponse.getBody());
	}

}
