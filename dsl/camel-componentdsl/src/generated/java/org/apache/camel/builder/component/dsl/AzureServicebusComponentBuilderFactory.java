/* Generated by camel build tools - do NOT edit this file! */
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.azure.servicebus.ServiceBusComponent;

/**
 * Send and receive messages to/from Azure Service Bus.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AzureServicebusComponentBuilderFactory {

    /**
     * Azure ServiceBus (camel-azure-servicebus)
     * Send and receive messages to/from Azure Service Bus.
     * 
     * Category: cloud,messaging
     * Since: 3.12
     * Maven coordinates: org.apache.camel:camel-azure-servicebus
     * 
     * @return the dsl builder
     */
    static AzureServicebusComponentBuilder azureServicebus() {
        return new AzureServicebusComponentBuilderImpl();
    }

    /**
     * Builder for the Azure ServiceBus component.
     */
    interface AzureServicebusComponentBuilder extends ComponentBuilder<ServiceBusComponent> {
    
        /**
         * Sets the retry options for Service Bus clients. If not specified, the
         * default retry options are used.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.core.amqp.AmqpRetryOptions&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param amqpRetryOptions the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder amqpRetryOptions(com.azure.core.amqp.AmqpRetryOptions amqpRetryOptions) {
            doSetProperty("amqpRetryOptions", amqpRetryOptions);
            return this;
        }
    
        
        /**
         * Sets the transport type by which all the communication with Azure
         * Service Bus occurs. Default value is AMQP.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.core.amqp.AmqpTransportType&lt;/code&gt; type.
         * 
         * Default: AMQP
         * Group: common
         * 
         * @param amqpTransportType the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder amqpTransportType(com.azure.core.amqp.AmqpTransportType amqpTransportType) {
            doSetProperty("amqpTransportType", amqpTransportType);
            return this;
        }
    
        /**
         * Sets the ClientOptions to be sent from the client built from this
         * builder, enabling customization of certain properties, as well as
         * support the addition of custom header information.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.core.util.ClientOptions&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param clientOptions the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder clientOptions(com.azure.core.util.ClientOptions clientOptions) {
            doSetProperty("clientOptions", clientOptions);
            return this;
        }
    
        /**
         * The component configurations.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.servicebus.ServiceBusConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder configuration(org.apache.camel.component.azure.servicebus.ServiceBusConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
    
        /**
         * To use a custom HeaderFilterStrategy to filter Service Bus
         * application properties to and from Camel message headers.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.HeaderFilterStrategy&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param headerFilterStrategy the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder headerFilterStrategy(org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
    
        /**
         * Sets the proxy configuration to use for ServiceBusSenderClient. When
         * a proxy is configured, AMQP_WEB_SOCKETS must be used for the
         * transport type.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.core.amqp.ProxyOptions&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyOptions the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder proxyOptions(com.azure.core.amqp.ProxyOptions proxyOptions) {
            doSetProperty("proxyOptions", proxyOptions);
            return this;
        }
    
        
        /**
         * The service bus type of connection to execute. Queue is for typical
         * queue option and topic for subscription based model.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.servicebus.ServiceBusType&lt;/code&gt; type.
         * 
         * Default: queue
         * Group: common
         * 
         * @param serviceBusType the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder serviceBusType(org.apache.camel.component.azure.servicebus.ServiceBusType serviceBusType) {
            doSetProperty("serviceBusType", serviceBusType);
            return this;
        }
    
        
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    
        
        /**
         * Enable application level deadlettering to the subscription deadletter
         * subqueue if deadletter related headers are set.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param enableDeadLettering the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder enableDeadLettering(boolean enableDeadLettering) {
            doSetProperty("enableDeadLettering", enableDeadLettering);
            return this;
        }
    
        
        /**
         * Sets the amount of time to continue auto-renewing the lock. Setting
         * ZERO disables auto-renewal. For ServiceBus receive mode
         * (RECEIVE_AND_DELETE RECEIVE_AND_DELETE), auto-renewal is disabled.
         * 
         * The option is a: &lt;code&gt;java.time.Duration&lt;/code&gt; type.
         * 
         * Default: 5m
         * Group: consumer
         * 
         * @param maxAutoLockRenewDuration the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder maxAutoLockRenewDuration(java.time.Duration maxAutoLockRenewDuration) {
            doSetProperty("maxAutoLockRenewDuration", maxAutoLockRenewDuration);
            return this;
        }
    
        
        /**
         * Sets maximum number of concurrent calls.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param maxConcurrentCalls the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder maxConcurrentCalls(int maxConcurrentCalls) {
            doSetProperty("maxConcurrentCalls", maxConcurrentCalls);
            return this;
        }
    
        /**
         * Sets the prefetch count of the receiver. For both PEEK_LOCK PEEK_LOCK
         * and RECEIVE_AND_DELETE RECEIVE_AND_DELETE receive modes the default
         * value is 1. Prefetch speeds up the message flow by aiming to have a
         * message readily available for local retrieval when and before the
         * application asks for one using receive message. Setting a non-zero
         * value will prefetch that number of messages. Setting the value to
         * zero turns prefetch off.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param prefetchCount the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder prefetchCount(int prefetchCount) {
            doSetProperty("prefetchCount", prefetchCount);
            return this;
        }
    
        /**
         * Sets the processorClient in order to consume messages by the
         * consumer.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.messaging.servicebus.ServiceBusProcessorClient&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param processorClient the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder processorClient(com.azure.messaging.servicebus.ServiceBusProcessorClient processorClient) {
            doSetProperty("processorClient", processorClient);
            return this;
        }
    
        
        /**
         * Sets the receive mode for the receiver.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.messaging.servicebus.models.ServiceBusReceiveMode&lt;/code&gt; type.
         * 
         * Default: PEEK_LOCK
         * Group: consumer
         * 
         * @param serviceBusReceiveMode the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder serviceBusReceiveMode(com.azure.messaging.servicebus.models.ServiceBusReceiveMode serviceBusReceiveMode) {
            doSetProperty("serviceBusReceiveMode", serviceBusReceiveMode);
            return this;
        }
    
        
        /**
         * Enable session support.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param sessionEnabled the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder sessionEnabled(boolean sessionEnabled) {
            doSetProperty("sessionEnabled", sessionEnabled);
            return this;
        }
    
        /**
         * Sets the type of the SubQueue to connect to.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.messaging.servicebus.models.SubQueue&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param subQueue the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder subQueue(com.azure.messaging.servicebus.models.SubQueue subQueue) {
            doSetProperty("subQueue", subQueue);
            return this;
        }
    
        /**
         * Sets the name of the subscription in the topic to listen to.
         * topicOrQueueName and serviceBusType=topic must also be set. This
         * property is required if serviceBusType=topic and the consumer is in
         * use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param subscriptionName the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder subscriptionName(java.lang.String subscriptionName) {
            doSetProperty("subscriptionName", subscriptionName);
            return this;
        }
    
        
        /**
         * Set binary mode. If true, message body will be sent as byte. By
         * default, it is false.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param binary the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder binary(boolean binary) {
            doSetProperty("binary", binary);
            return this;
        }
    
        
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    
        
        /**
         * Sets the desired operation to be used in the producer.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.servicebus.ServiceBusProducerOperationDefinition&lt;/code&gt; type.
         * 
         * Default: sendMessages
         * Group: producer
         * 
         * @param producerOperation the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder producerOperation(org.apache.camel.component.azure.servicebus.ServiceBusProducerOperationDefinition producerOperation) {
            doSetProperty("producerOperation", producerOperation);
            return this;
        }
    
        /**
         * Sets OffsetDateTime at which the message should appear in the Service
         * Bus queue or topic.
         * 
         * The option is a: &lt;code&gt;java.time.OffsetDateTime&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param scheduledEnqueueTime the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder scheduledEnqueueTime(java.time.OffsetDateTime scheduledEnqueueTime) {
            doSetProperty("scheduledEnqueueTime", scheduledEnqueueTime);
            return this;
        }
    
        /**
         * Sets senderClient to be used in the producer.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.messaging.servicebus.ServiceBusSenderClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param senderClient the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder senderClient(com.azure.messaging.servicebus.ServiceBusSenderClient senderClient) {
            doSetProperty("senderClient", senderClient);
            return this;
        }
    
        /**
         * Represents transaction in service. This object just contains
         * transaction id.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.messaging.servicebus.ServiceBusTransactionContext&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param serviceBusTransactionContext the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder serviceBusTransactionContext(com.azure.messaging.servicebus.ServiceBusTransactionContext serviceBusTransactionContext) {
            doSetProperty("serviceBusTransactionContext", serviceBusTransactionContext);
            return this;
        }
    
        /**
         * Session ID for session-enabled queues or topics.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param sessionId the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder sessionId(java.lang.String sessionId) {
            doSetProperty("sessionId", sessionId);
            return this;
        }
    
        
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    
        /**
         * Sets the connection string for a Service Bus namespace or a specific
         * Service Bus resource.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param connectionString the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder connectionString(java.lang.String connectionString) {
            doSetProperty("connectionString", connectionString);
            return this;
        }
    
        
        /**
         * Determines the credential strategy to adopt.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.servicebus.CredentialType&lt;/code&gt; type.
         * 
         * Default: CONNECTION_STRING
         * Group: security
         * 
         * @param credentialType the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder credentialType(org.apache.camel.component.azure.servicebus.CredentialType credentialType) {
            doSetProperty("credentialType", credentialType);
            return this;
        }
    
        /**
         * Fully Qualified Namespace of the service bus.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param fullyQualifiedNamespace the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder fullyQualifiedNamespace(java.lang.String fullyQualifiedNamespace) {
            doSetProperty("fullyQualifiedNamespace", fullyQualifiedNamespace);
            return this;
        }
    
        /**
         * A TokenCredential for Azure AD authentication.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.core.credential.TokenCredential&lt;/code&gt;
         * type.
         * 
         * Group: security
         * 
         * @param tokenCredential the value to set
         * @return the dsl builder
         */
        default AzureServicebusComponentBuilder tokenCredential(com.azure.core.credential.TokenCredential tokenCredential) {
            doSetProperty("tokenCredential", tokenCredential);
            return this;
        }
    }

    class AzureServicebusComponentBuilderImpl
            extends AbstractComponentBuilder<ServiceBusComponent>
            implements AzureServicebusComponentBuilder {
        @Override
        protected ServiceBusComponent buildConcreteComponent() {
            return new ServiceBusComponent();
        }
        private org.apache.camel.component.azure.servicebus.ServiceBusConfiguration getOrCreateConfiguration(ServiceBusComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.azure.servicebus.ServiceBusConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amqpRetryOptions": getOrCreateConfiguration((ServiceBusComponent) component).setAmqpRetryOptions((com.azure.core.amqp.AmqpRetryOptions) value); return true;
            case "amqpTransportType": getOrCreateConfiguration((ServiceBusComponent) component).setAmqpTransportType((com.azure.core.amqp.AmqpTransportType) value); return true;
            case "clientOptions": getOrCreateConfiguration((ServiceBusComponent) component).setClientOptions((com.azure.core.util.ClientOptions) value); return true;
            case "configuration": ((ServiceBusComponent) component).setConfiguration((org.apache.camel.component.azure.servicebus.ServiceBusConfiguration) value); return true;
            case "headerFilterStrategy": getOrCreateConfiguration((ServiceBusComponent) component).setHeaderFilterStrategy((org.apache.camel.spi.HeaderFilterStrategy) value); return true;
            case "proxyOptions": getOrCreateConfiguration((ServiceBusComponent) component).setProxyOptions((com.azure.core.amqp.ProxyOptions) value); return true;
            case "serviceBusType": getOrCreateConfiguration((ServiceBusComponent) component).setServiceBusType((org.apache.camel.component.azure.servicebus.ServiceBusType) value); return true;
            case "bridgeErrorHandler": ((ServiceBusComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "enableDeadLettering": getOrCreateConfiguration((ServiceBusComponent) component).setEnableDeadLettering((boolean) value); return true;
            case "maxAutoLockRenewDuration": getOrCreateConfiguration((ServiceBusComponent) component).setMaxAutoLockRenewDuration((java.time.Duration) value); return true;
            case "maxConcurrentCalls": getOrCreateConfiguration((ServiceBusComponent) component).setMaxConcurrentCalls((int) value); return true;
            case "prefetchCount": getOrCreateConfiguration((ServiceBusComponent) component).setPrefetchCount((int) value); return true;
            case "processorClient": getOrCreateConfiguration((ServiceBusComponent) component).setProcessorClient((com.azure.messaging.servicebus.ServiceBusProcessorClient) value); return true;
            case "serviceBusReceiveMode": getOrCreateConfiguration((ServiceBusComponent) component).setServiceBusReceiveMode((com.azure.messaging.servicebus.models.ServiceBusReceiveMode) value); return true;
            case "sessionEnabled": getOrCreateConfiguration((ServiceBusComponent) component).setSessionEnabled((boolean) value); return true;
            case "subQueue": getOrCreateConfiguration((ServiceBusComponent) component).setSubQueue((com.azure.messaging.servicebus.models.SubQueue) value); return true;
            case "subscriptionName": getOrCreateConfiguration((ServiceBusComponent) component).setSubscriptionName((java.lang.String) value); return true;
            case "binary": getOrCreateConfiguration((ServiceBusComponent) component).setBinary((boolean) value); return true;
            case "lazyStartProducer": ((ServiceBusComponent) component).setLazyStartProducer((boolean) value); return true;
            case "producerOperation": getOrCreateConfiguration((ServiceBusComponent) component).setProducerOperation((org.apache.camel.component.azure.servicebus.ServiceBusProducerOperationDefinition) value); return true;
            case "scheduledEnqueueTime": getOrCreateConfiguration((ServiceBusComponent) component).setScheduledEnqueueTime((java.time.OffsetDateTime) value); return true;
            case "senderClient": getOrCreateConfiguration((ServiceBusComponent) component).setSenderClient((com.azure.messaging.servicebus.ServiceBusSenderClient) value); return true;
            case "serviceBusTransactionContext": getOrCreateConfiguration((ServiceBusComponent) component).setServiceBusTransactionContext((com.azure.messaging.servicebus.ServiceBusTransactionContext) value); return true;
            case "sessionId": getOrCreateConfiguration((ServiceBusComponent) component).setSessionId((java.lang.String) value); return true;
            case "autowiredEnabled": ((ServiceBusComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "connectionString": getOrCreateConfiguration((ServiceBusComponent) component).setConnectionString((java.lang.String) value); return true;
            case "credentialType": getOrCreateConfiguration((ServiceBusComponent) component).setCredentialType((org.apache.camel.component.azure.servicebus.CredentialType) value); return true;
            case "fullyQualifiedNamespace": getOrCreateConfiguration((ServiceBusComponent) component).setFullyQualifiedNamespace((java.lang.String) value); return true;
            case "tokenCredential": getOrCreateConfiguration((ServiceBusComponent) component).setTokenCredential((com.azure.core.credential.TokenCredential) value); return true;
            default: return false;
            }
        }
    }
}