/*
 * Copyright (c) 1997, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.jms;

/**
 * An {@code XAQueueSession} provides a regular {@code QueueSession}, which can be used to create {@code QueueReceiver},
 * {@code QueueSender}, and {@code QueueBrowser} objects (optional).
 *
 * <p>
 * The {@code XAQueueSession} interface is optional. Jakarta Messaging providers are not required to support this interface. This
 * interface is for use by Jakarta Messaging providers to support transactional environments. Client programs are strongly encouraged
 * to use the transactional support available in their environment, rather than use these XA interfaces directly.
 *
 * @see javax.jms.XASession
 *
 * @version Jakarta Messaging 2.0
 * @since JMS 1.0
 */
public interface XAQueueSession extends XASession {

    /**
     * Gets the queue session associated with this {@code XAQueueSession}.
     *
     * @return the queue session object
     *
     * @exception JMSException if an internal error occurs.
     */
    QueueSession getQueueSession() throws JMSException;
}
