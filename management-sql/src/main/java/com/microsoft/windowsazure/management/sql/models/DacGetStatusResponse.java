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

package com.microsoft.windowsazure.management.sql.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
* The response structure for the DAC GetStatus operation.
*/
public class DacGetStatusResponse extends OperationResponse implements Iterable<StatusInfo> {
    private ArrayList<StatusInfo> statusInfoList;
    
    /**
    * Optional. Gets or sets the list of statuses relevant to this
    * import/export request.
    * @return The StatusInfoList value.
    */
    public ArrayList<StatusInfo> getStatusInfoList() {
        return this.statusInfoList;
    }
    
    /**
    * Optional. Gets or sets the list of statuses relevant to this
    * import/export request.
    * @param statusInfoListValue The StatusInfoList value.
    */
    public void setStatusInfoList(final ArrayList<StatusInfo> statusInfoListValue) {
        this.statusInfoList = statusInfoListValue;
    }
    
    /**
    * Initializes a new instance of the DacGetStatusResponse class.
    *
    */
    public DacGetStatusResponse() {
        super();
        this.statusInfoList = new ArrayList<StatusInfo>();
    }
    
    /**
    * Gets the sequence of StatusInfoList.
    *
    */
    public Iterator<StatusInfo> iterator() {
        return this.getStatusInfoList().iterator();
    }
}
