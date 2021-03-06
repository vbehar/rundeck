/*
 * Copyright 2010 DTO Labs, Inc. (http://dtolabs.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 
/*
 * ReportFilter.java
 * 
 * User: greg
 * Created: Jan 19, 2010 11:26:05 AM
 * $Id$
 */

class ReportFilter {

    String name

//    String sortBy
//    String sortOrder

    Date startafterFilter
    Date startbeforeFilter
    Date endafterFilter
    Date endbeforeFilter
    boolean dostartafterFilter
    boolean dostartbeforeFilter
    boolean doendafterFilter
    boolean doendbeforeFilter
    String recentFilter

    String jobFilter
    String jobIdFilter
    String nodeFilter
    String titleFilter
    String projFilter
    String cmdFilter
    String objFilter
    String maprefUriFilter
    String typeFilter
    String userFilter
    String messageFilter
    String statFilter
    String reportIdFilter
    String tagsFilter

    static belongsTo = [user:User]
    static constraints={
        name(blank:false,unique:true)
//        sortOrder(inList:["ascending","descending"])
        jobFilter(nullable:true)
        jobIdFilter(nullable:true)
        nodeFilter(nullable:true)
    }

    public ReportQuery createQuery(){
        ReportQuery query = new ReportQuery(this.properties.findAll{it.key=~/.*Filter$/})
        return query
    }
}