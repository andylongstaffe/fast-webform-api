package com.hollywood.webform.api.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hollywood.webform.api.model.IPOOrder;
import com.hollywood.webform.api.model.OrderResponse;


public interface OrderManager {

	@POST
	@Path("/order/ipo")
	@Produces(MediaType.APPLICATION_JSON)
	// @Consumes(MediaType.APPLICATION_JSON)
	OrderResponse createOrder(IPOOrder order);
	
}
