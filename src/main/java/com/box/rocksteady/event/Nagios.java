package com.box.rocksteady.event;

// import com.admob.rocksteady.router.cep.ComplexEventManager;
import org.codehaus.jackson.map.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.admob.rocksteady.router.cep.ComplexEventManager;

/**
 * POJO class to take on metrics
 * 
 */
public class Nagios {
	private static final Logger logger = LoggerFactory.getLogger(Nagios.class);

	// HOST "$NOTIFICATIONTYPE$" "$HOSTNAME$" "$HOSTSTATE$" "$HOSTADDRESS$"
	// "$HOSTOUTPUT$" "$NOTIFICATIONCOMMENT$" "$LONGDATETIME$"
	// SERVICE "$NOTIFICATIONTYPE$" "$HOSTNAME$" "$SERVICEDESC$"
	// "$SERVICESTATE$" "$HOSTADDRESS$" "$SERVICEOUTPUT$"
	// "$NOTIFICATIONCOMMENT$" "$LONGDATETIME$"

	public String type;
	public String hostname;
	public String hostaddress;
	public String comments;
	public String datetime;
	public Long hostservicescritical;

	public String hoststate;
	public String hostoutput;
	public Long hostsup;
	public Long hostsdown;

	public String servicedesc;
	public String servicestate;
	public String serviceoutput;
	public Long servicesok;
	public Long servicescritical;

	// Instantiate metric object with a piece of graphite metric
	public Nagios(String data) {

		ObjectMapper mapper = new ObjectMapper();
		GenericAlert obj = new GenericAlert();
		logger.debug("Data is " + data);
		try {
			obj = mapper.readValue(data, GenericAlert.class);
			logger.debug("metric processed: " + data);
		} catch (java.io.IOException e) {
			// Print out the exception that occurred
			logger.warn("metric not recognized: " + data);
			// System.out.printf("IO Exception %s\n", e.getMessage());
		}

		this.type = obj.type;
		this.hostname = obj.hostname;
		this.hostaddress = obj.hostaddress;
		this.comments = obj.comments;
		this.datetime = obj.datetime;
		this.hostservicescritical = obj.hostservicescritical;

		this.hoststate = obj.hoststate;
		this.hostoutput = obj.hostoutput;
		this.hostsup = obj.hostsup;
		this.hostsdown = obj.hostsdown;

		this.servicedesc = obj.servicedesc;
		this.servicestate = obj.servicestate;
		this.serviceoutput = obj.serviceoutput;
		this.servicesok = obj.servicesok;
		this.servicescritical = obj.servicescritical;

		// ComplexEventManager.getInstance().sendEvent(obj);
	}
}