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
import org.apache.camel.component.neo4j.Neo4jComponent;

/**
 * Perform operations on the Neo4j Graph Database
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Neo4jComponentBuilderFactory {

    /**
     * Neo4j (camel-neo4j)
     * Perform operations on the Neo4j Graph Database
     * 
     * Category: database,ai
     * Since: 4.10
     * Maven coordinates: org.apache.camel:camel-neo4j
     * 
     * @return the dsl builder
     */
    static Neo4jComponentBuilder neo4j() {
        return new Neo4jComponentBuilderImpl();
    }

    /**
     * Builder for the Neo4j component.
     */
    interface Neo4jComponentBuilder extends ComponentBuilder<Neo4jComponent> {
    
        /**
         * Node alias.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param alias the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder alias(java.lang.String alias) {
            doSetProperty("alias", alias);
            return this;
        }
    
        /**
         * Kerberos Authentication encoded base64 ticket.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param base64 the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder base64(java.lang.String base64) {
            doSetProperty("base64", base64);
            return this;
        }
    
        /**
         * The configuration;.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.neo4j.Neo4jConfiguration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder configuration(org.apache.camel.component.neo4j.Neo4jConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
    
        /**
         * Basic authentication database password.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param dbPassword the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder dbPassword(java.lang.String dbPassword) {
            doSetProperty("dbPassword", dbPassword);
            return this;
        }
    
        /**
         * URI of the Neo4j server - used for Authentication.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param dbUri the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder dbUri(java.lang.String dbUri) {
            doSetProperty("dbUri", dbUri);
            return this;
        }
    
        /**
         * Basic authentication database user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param dbUser the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder dbUser(java.lang.String dbUser) {
            doSetProperty("dbUser", dbUser);
            return this;
        }
    
        
        /**
         * Detach a relationship - set true if want to delete a node and detach
         * its relationships to other nodes at same time.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param detachRelationship the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder detachRelationship(boolean detachRelationship) {
            doSetProperty("detachRelationship", detachRelationship);
            return this;
        }
    
        /**
         * Dimension of Vector Index.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param dimension the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder dimension(java.lang.Integer dimension) {
            doSetProperty("dimension", dimension);
            return this;
        }
    
        /**
         * Node Label.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param label the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder label(java.lang.String label) {
            doSetProperty("label", label);
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
        default Neo4jComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    
        
        /**
         * Maximum results for Vector Similarity search.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 3
         * Group: producer
         * 
         * @param maxResults the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder maxResults(int maxResults) {
            doSetProperty("maxResults", maxResults);
            return this;
        }
    
        /**
         * Minimum score for Vector Similarity search.
         * 
         * The option is a: &lt;code&gt;double&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param minScore the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder minScore(double minScore) {
            doSetProperty("minScore", minScore);
            return this;
        }
    
        /**
         * Cypher Query.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder query(java.lang.String query) {
            doSetProperty("query", query);
            return this;
        }
    
        /**
         * Basic authentication database realm.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param realm the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder realm(java.lang.String realm) {
            doSetProperty("realm", realm);
            return this;
        }
    
        
        /**
         * Similarity Function of Vector Index.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.neo4j.Neo4jSimilarityFunction&lt;/code&gt; type.
         * 
         * Default: cosine
         * Group: producer
         * 
         * @param similarityFunction the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder similarityFunction(org.apache.camel.component.neo4j.Neo4jSimilarityFunction similarityFunction) {
            doSetProperty("similarityFunction", similarityFunction);
            return this;
        }
    
        /**
         * Bearer authentication database realm.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param token the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder token(java.lang.String token) {
            doSetProperty("token", token);
            return this;
        }
    
        /**
         * Vector Index Name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param vectorIndexName the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder vectorIndexName(java.lang.String vectorIndexName) {
            doSetProperty("vectorIndexName", vectorIndexName);
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
        default Neo4jComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    
        /**
         * Advanced - Driver.
         * 
         * The option is a: &lt;code&gt;org.neo4j.driver.Driver&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param driver the value to set
         * @return the dsl builder
         */
        default Neo4jComponentBuilder driver(org.neo4j.driver.Driver driver) {
            doSetProperty("driver", driver);
            return this;
        }
    }

    class Neo4jComponentBuilderImpl
            extends AbstractComponentBuilder<Neo4jComponent>
            implements Neo4jComponentBuilder {
        @Override
        protected Neo4jComponent buildConcreteComponent() {
            return new Neo4jComponent();
        }
        private org.apache.camel.component.neo4j.Neo4jConfiguration getOrCreateConfiguration(Neo4jComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.neo4j.Neo4jConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "alias": getOrCreateConfiguration((Neo4jComponent) component).setAlias((java.lang.String) value); return true;
            case "base64": getOrCreateConfiguration((Neo4jComponent) component).setBase64((java.lang.String) value); return true;
            case "configuration": ((Neo4jComponent) component).setConfiguration((org.apache.camel.component.neo4j.Neo4jConfiguration) value); return true;
            case "dbPassword": getOrCreateConfiguration((Neo4jComponent) component).setDbPassword((java.lang.String) value); return true;
            case "dbUri": getOrCreateConfiguration((Neo4jComponent) component).setDbUri((java.lang.String) value); return true;
            case "dbUser": getOrCreateConfiguration((Neo4jComponent) component).setDbUser((java.lang.String) value); return true;
            case "detachRelationship": getOrCreateConfiguration((Neo4jComponent) component).setDetachRelationship((boolean) value); return true;
            case "dimension": getOrCreateConfiguration((Neo4jComponent) component).setDimension((java.lang.Integer) value); return true;
            case "label": getOrCreateConfiguration((Neo4jComponent) component).setLabel((java.lang.String) value); return true;
            case "lazyStartProducer": ((Neo4jComponent) component).setLazyStartProducer((boolean) value); return true;
            case "maxResults": getOrCreateConfiguration((Neo4jComponent) component).setMaxResults((int) value); return true;
            case "minScore": getOrCreateConfiguration((Neo4jComponent) component).setMinScore((double) value); return true;
            case "query": getOrCreateConfiguration((Neo4jComponent) component).setQuery((java.lang.String) value); return true;
            case "realm": getOrCreateConfiguration((Neo4jComponent) component).setRealm((java.lang.String) value); return true;
            case "similarityFunction": getOrCreateConfiguration((Neo4jComponent) component).setSimilarityFunction((org.apache.camel.component.neo4j.Neo4jSimilarityFunction) value); return true;
            case "token": getOrCreateConfiguration((Neo4jComponent) component).setToken((java.lang.String) value); return true;
            case "vectorIndexName": getOrCreateConfiguration((Neo4jComponent) component).setVectorIndexName((java.lang.String) value); return true;
            case "autowiredEnabled": ((Neo4jComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "driver": getOrCreateConfiguration((Neo4jComponent) component).setDriver((org.neo4j.driver.Driver) value); return true;
            default: return false;
            }
        }
    }
}