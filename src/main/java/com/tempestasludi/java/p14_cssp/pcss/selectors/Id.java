package com.tempestasludi.java.p14_cssp.pcss.selectors;

public class Id extends Selector {

	/**
	 * Class constructor.
	 *
	 * @param name
	 *            the name of the selector
	 */
	public Id(String name) {
		super(name);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return new StringBuilder().append("#").append(this.getName()).toString();
	}

}
