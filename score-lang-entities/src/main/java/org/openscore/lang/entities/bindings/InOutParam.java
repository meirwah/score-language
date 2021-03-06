/*******************************************************************************
* (c) Copyright 2014 Hewlett-Packard Development Company, L.P.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Apache License v2.0 which accompany this distribution.
*
* The Apache License is available at
* http://www.apache.org/licenses/LICENSE-2.0
*
*******************************************************************************/
package org.openscore.lang.entities.bindings;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @author moradi
 * @since 13/11/204
 * @version $Id$
 */
public abstract class InOutParam implements Serializable {

	private static final long serialVersionUID = -7712676295781864973L;

	private final String name;
	private final String expression;

	public InOutParam(String name, String expression) {
		this.name = name;
		this.expression = expression;
	}

	public String getName() {
		return name;
	}

	public String getExpression() {
		return expression;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
