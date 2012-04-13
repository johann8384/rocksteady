package com.box.rocksteady.event;

// import com.admob.rocksteady.router.cep.ComplexEventManager;
import org.codehaus.jackson.map.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.admob.rocksteady.router.cep.ComplexEventManager;

/**
 * POJO class to take on metrics
 * 
 */
public class Nagios {
	private static final Logger logger = LoggerFactory.getLogger(Nagios.class);

	// HOST "$NOTIFICATIONTYPE$" "$HOSTNAME$" "$HOSTSTATE$" "$HOSTADDRESS$" "$HOSTOUTPUT$" "$NOTIFICATIONCOMMENT$" "$LONGDATETIME$"
	// SERVICE "$NOTIFICATIONTYPE$" "$HOSTNAME$" "$SERVICEDESC$" "$SERVICESTATE$" "$HOSTADDRESS$" "$SERVICEOUTPUT$" "$NOTIFICATIONCOMMENT$" "$LONGDATETIME$"

	// Instantiate metric object with a piece of graphite metric
	public Nagios(String data) {

		ObjectMapper mapper = new ObjectMapper();
		GenericAlert obj = new GenericAlert();

		try {
			obj = mapper.readValue(data, GenericAlert.class);
			logger.debug("metric processed: " + data);
		} catch (java.io.IOException e) {
			// Print out the exception that occurred
			logger.warn("metric not recognized: " + data);
			// System.out.printf("IO Exception %s\n", e.getMessage());
		}

		ComplexEventManager.getInstance().sendEvent(obj);
	}
}