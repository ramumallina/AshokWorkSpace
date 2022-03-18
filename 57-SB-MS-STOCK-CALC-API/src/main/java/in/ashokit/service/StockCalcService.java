package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.bindings.StockCalcApiResponse;
import in.ashokit.bindings.StockPriceApiResponse;
import in.ashokit.client.StockPriceClient;

@Service
public class StockCalcService {

	@Autowired
	private StockPriceClient priceClient;

	public StockCalcApiResponse getStocksCost(String companyName, Integer quantity) {
		StockCalcApiResponse response = new StockCalcApiResponse();

		// access STOCK-PRICE-API with company name

		StockPriceApiResponse priceApiResponse = priceClient.invokeStockPriceApi(companyName);

		Double companyStockPrice = priceApiResponse.getCompanyStockPrice();

		// calculating total stocks cost based on price & quantity
		Double totalCost = companyStockPrice * quantity;

		response.setCompanyName(companyName);
		response.setPortNumber(priceApiResponse.getPortNumber());
		response.setQuantity(quantity);
		response.setTotalCost(totalCost);

		return response;
	}

}
