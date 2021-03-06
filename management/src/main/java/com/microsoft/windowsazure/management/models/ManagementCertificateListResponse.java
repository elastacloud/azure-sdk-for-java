/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
* The List Management Certificates operation response.
*/
public class ManagementCertificateListResponse extends OperationResponse implements Iterable<ManagementCertificateListResponse.SubscriptionCertificate> {
    private ArrayList<ManagementCertificateListResponse.SubscriptionCertificate> subscriptionCertificates;
    
    /**
    * Optional. The management certificates that are valid for your
    * subscription.
    * @return The SubscriptionCertificates value.
    */
    public ArrayList<ManagementCertificateListResponse.SubscriptionCertificate> getSubscriptionCertificates() {
        return this.subscriptionCertificates;
    }
    
    /**
    * Optional. The management certificates that are valid for your
    * subscription.
    * @param subscriptionCertificatesValue The SubscriptionCertificates value.
    */
    public void setSubscriptionCertificates(final ArrayList<ManagementCertificateListResponse.SubscriptionCertificate> subscriptionCertificatesValue) {
        this.subscriptionCertificates = subscriptionCertificatesValue;
    }
    
    /**
    * Initializes a new instance of the ManagementCertificateListResponse class.
    *
    */
    public ManagementCertificateListResponse() {
        super();
        this.subscriptionCertificates = new ArrayList<ManagementCertificateListResponse.SubscriptionCertificate>();
    }
    
    /**
    * Gets the sequence of SubscriptionCertificates.
    *
    */
    public Iterator<ManagementCertificateListResponse.SubscriptionCertificate> iterator() {
        return this.getSubscriptionCertificates().iterator();
    }
    
    /**
    * A management certificate that is valid for your subscription.
    */
    public static class SubscriptionCertificate {
        private Calendar created;
        
        /**
        * Optional. The time that the management certificate was created, in
        * UTC.
        * @return The Created value.
        */
        public Calendar getCreated() {
            return this.created;
        }
        
        /**
        * Optional. The time that the management certificate was created, in
        * UTC.
        * @param createdValue The Created value.
        */
        public void setCreated(final Calendar createdValue) {
            this.created = createdValue;
        }
        
        private byte[] data;
        
        /**
        * Optional. A base-64 representation of the data contained in the
        * management certificate, in cer format.
        * @return The Data value.
        */
        public byte[] getData() {
            return this.data;
        }
        
        /**
        * Optional. A base-64 representation of the data contained in the
        * management certificate, in cer format.
        * @param dataValue The Data value.
        */
        public void setData(final byte[] dataValue) {
            this.data = dataValue;
        }
        
        private byte[] publicKey;
        
        /**
        * Optional. A base-64 representation of the management certificate
        * public key.
        * @return The PublicKey value.
        */
        public byte[] getPublicKey() {
            return this.publicKey;
        }
        
        /**
        * Optional. A base-64 representation of the management certificate
        * public key.
        * @param publicKeyValue The PublicKey value.
        */
        public void setPublicKey(final byte[] publicKeyValue) {
            this.publicKey = publicKeyValue;
        }
        
        private String thumbprint;
        
        /**
        * Optional. The X509 certificate thumbprint property of the management
        * certificate. This thumbprint uniquely identifies the certificate.
        * @return The Thumbprint value.
        */
        public String getThumbprint() {
            return this.thumbprint;
        }
        
        /**
        * Optional. The X509 certificate thumbprint property of the management
        * certificate. This thumbprint uniquely identifies the certificate.
        * @param thumbprintValue The Thumbprint value.
        */
        public void setThumbprint(final String thumbprintValue) {
            this.thumbprint = thumbprintValue;
        }
    }
}
