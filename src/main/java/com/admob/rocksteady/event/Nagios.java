package com.admob.rocksteady.event;

// import com.admob.rocksteady.router.cep.ComplexEventManager;
import org.codehaus.jackson.map.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.box.rocksteady.event.GenericAlert;

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
				// ComplexEventManager.getInstance().sendEvent(obj);
	}
}