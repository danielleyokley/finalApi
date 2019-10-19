package com.promineotech.finalProjectApi.util;

public enum SustainabilityProceeds {

	DONATIONFIVEPERCENT(.05),
	DONATIONTENPERCENT(.10),
	DONATIONFIFTEENPERCENT(.15),
	DONATIONTWENTYPERCENT(.20);
	
	private double proceed;
	
	SustainabilityProceeds(double proceed) {
		this.proceed = proceed;
	}
	
	public double getProceed() {
		return proceed;
	}
	
	
}