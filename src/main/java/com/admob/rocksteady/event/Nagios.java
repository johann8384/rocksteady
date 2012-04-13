package com.admob.rocksteady.event;
/**
 * POJO class to take on metrics
 * 
 */
public class Nagios {
	
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

	public Nagios() {
	}

	@Override
	public String toString() {
		return "Nagios [type=" + type + ", hostname=" + hostname
				+ ", hostaddress=" + hostaddress + ", comments=" + comments
				+ ", datetime=" + datetime + ", hostservicescritical="
				+ hostservicescritical + ", hoststate=" + hoststate
				+ ", hostoutput=" + hostoutput + ", hostsup=" + hostsup
				+ ", hostsdown=" + hostsdown + ", servicedesc=" + servicedesc
				+ ", servicestate=" + servicestate + ", serviceoutput="
				+ serviceoutput + ", servicesok=" + servicesok
				+ ", servicescritical=" + servicescritical + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getHostaddress() {
		return hostaddress;
	}

	public void setHostaddress(String hostaddress) {
		this.hostaddress = hostaddress;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public Long getHostservicescritical() {
		return hostservicescritical;
	}

	public void setHostservicescritical(Long hostservicescritical) {
		this.hostservicescritical = hostservicescritical;
	}

	public String getHoststate() {
		return hoststate;
	}

	public void setHoststate(String hoststate) {
		this.hoststate = hoststate;
	}

	public String getHostoutput() {
		return hostoutput;
	}

	public void setHostoutput(String hostoutput) {
		this.hostoutput = hostoutput;
	}

	public Long getHostsup() {
		return hostsup;
	}

	public void setHostsup(Long hostsup) {
		this.hostsup = hostsup;
	}

	public Long getHostsdown() {
		return hostsdown;
	}

	public void setHostsdown(Long hostsdown) {
		this.hostsdown = hostsdown;
	}

	public String getServicedesc() {
		return servicedesc;
	}

	public void setServicedesc(String servicedesc) {
		this.servicedesc = servicedesc;
	}

	public String getServicestate() {
		return servicestate;
	}

	public void setServicestate(String servicestate) {
		this.servicestate = servicestate;
	}

	public String getServiceoutput() {
		return serviceoutput;
	}

	public void setServiceoutput(String serviceoutput) {
		this.serviceoutput = serviceoutput;
	}

	public Long getServicesok() {
		return servicesok;
	}

	public void setServicesok(Long servicesok) {
		this.servicesok = servicesok;
	}

	public Long getServicescritical() {
		return servicescritical;
	}

	public void setServicescritical(Long servicescritical) {
		this.servicescritical = servicescritical;
	}
	
}