package com.box.rocksteady.event;

public class GenericAlert {

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

	public GenericAlert() {

	}
}
