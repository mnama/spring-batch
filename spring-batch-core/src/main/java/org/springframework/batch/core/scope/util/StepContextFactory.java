/*
 * Copyright 2006-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.batch.core.scope.util;

import org.springframework.batch.core.scope.context.StepContext;
import org.springframework.batch.core.scope.context.StepSynchronizationManager;

/**
 * Implementation of {@link ContextFactory} that provides the current
 * {@link StepContext} as a context object.
 *
 * @author Dave Syer
 *
 */
public class StepContextFactory implements ContextFactory {

	@Override
	public Object getContext() {
		return StepSynchronizationManager.getContext();
	}

	@Override
	public String getContextId() {
		StepContext context = StepSynchronizationManager.getContext();
		return context!=null ? (String) context.getId() : "sysinit";
	}

}
