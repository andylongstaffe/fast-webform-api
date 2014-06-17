package com.hollywood.webform.api.service;

import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hollywood.webform.api.model.IPOOrder;
import com.hollywood.webform.api.model.OrderResponse;

@Path("/")
public class OrderManagerImpl implements OrderManager {

	private final static Logger log = LoggerFactory.getLogger(OrderManagerImpl.class);
	
	@Override
	public OrderResponse createOrder(IPOOrder order) {
		log.debug("Order received " + order);
		OrderResponse response = new OrderResponse();
		try {
			// do stuff
			response.setSuccess(true);
		} catch (Exception e) {
			response.setSuccess(false);
			response.setErrorMessage(e.getClass() + ": " + e.getMessage());
		}

		return response;
	}

}
