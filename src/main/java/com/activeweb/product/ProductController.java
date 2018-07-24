package com.activeweb.product;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.activeweb.product.beans.Details;
import com.activeweb.product.beans.Product;

@RestController
public class ProductController {

	@RequestMapping(value = "/products/{appName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProducts(@PathVariable String appName) {

		Product product1 = new Product();

		BigDecimal bigDecimal = new BigDecimal(12.11988976);
		bigDecimal.setScale(3, RoundingMode.CEILING);

		product1.setApr(bigDecimal);
		product1.setName("Fixed");

		String tandcs = "you have to pay...";

		product1.setTandcs(tandcs);

		tandcs = "hello";

		Details details = new Details();
		details.setPaymentSchedule("Monthly");
		details.setTenure("60");

		Map<String, String> fees = new HashMap<>();
		details.setFeeMap(fees);

		fees.put("latepaymentfee", "200$");

		product1.setDetails(details);
		
		List<Product> products = new ArrayList<>();

		products.add(product1);

		return products;

	}

}
