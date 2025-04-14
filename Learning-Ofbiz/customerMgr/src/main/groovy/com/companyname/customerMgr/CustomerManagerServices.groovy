package com.companyname.customerMgr


import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode
import org.apache.commons.net.ntp.TimeStamp
import org.apache.ofbiz.base.util.GeneralException
import org.apache.ofbiz.base.util.UtilDateTime
import org.apache.ofbiz.base.util.UtilMisc
import org.apache.ofbiz.entity.Delegator
import org.apache.ofbiz.entity.condition.EntityCondition
import org.apache.ofbiz.entity.condition.EntityOperator
import org.apache.ofbiz.entity.finder.EntityFinderUtil
import org.apache.ofbiz.entity.finder.ListFinder
import org.apache.ofbiz.entity.util.EntityListIterator
import org.apache.ofbiz.entity.util.EntityQuery
import org.apache.ofbiz.service.LocalDispatcher
import org.apache.ofbiz.service.ServiceUtil
import org.apache.ofbiz.entity.DelegatorFactory
import org.apache.ofbiz.entity.GenericValue
import org.apache.ofbiz.service.DispatchContext
import org.springframework.cglib.proxy.Dispatcher

import java.sql.Time
import java.sql.Timestamp;
import java.lang.Object


import java.sql.Timestamp

    Map<String,Object> result = ServiceUtil.returnSuccess()
    String firstName = (String) parameters.firstName
    String lastName = (String) parameters.lastName
    String email = (String) parameters.email


    GenericValue CustomerEmail = EntityQuery.use(delegator).from("FindCustomer").where("email", email, "purpose", "PRIMARY_EMAIL").queryFirst()

    if (CustomerEmail){
        return ServiceUtil.returnError("This email already exists")
    }

    GenericValue party = delegator.makeValue("Party")
    party.setNextSeqId()
    String partyId = party.getString("partyId")
    Map<String,Object> partyMap = [
            partyId : partyId,
            partyTypeId : "PERSON",
            statusId: "PARTY_ENABLED"
    ]

    println("++++++++++++++++++++++++partyMap+++++++"+ partyMap)

    delegator.create("Party",partyMap)

    GenericValue person = delegator.makeValue("Person")
    Map<String,Object> personMap = [
            partyId : partyId,
            firstName : (String) parameters.get("firstName"),
            lastName : (String) parameters.get("lastName"),
            middleName : "CreatedByService"
    ]

    println("-----------------------------person----------------" + personMap)
    delegator.create("Person", personMap)

    GenericValue contactMech = delegator.makeValue("ContactMech")
    contactMech.setNextSeqId()
    String contactMechId = contactMech.getString("contactMechId")
    Map<String,Object> contactMechMap = [
            contactMechId : contactMechId,
            infoString : email,
            contactMechTypeId : "EMAIL_ADDRESS"
    ]

    delegator.create("ContactMech", contactMechMap)

    println("------------------------contactMech--------------" + contactMechMap)

    GenericValue partyRole = delegator.makeValue("PartyRole")
    Map<String,Object> partyRoleMap = [
            partyId : partyId,
            roleTypeId : "CUSTOMER"
    ]

    delegator.create("PartyRole", partyRoleMap)

    println("------------------partyRole---------------" + partyRoleMap)

    GenericValue partyContactMech = delegator.makeValue("PartyContactMech")
    Map<String,Object> partyContactMechMap = [
            partyId : partyId,
            contactMechId: contactMechId,
            roleTypeId: "CUSTOMER",
            fromDate : Timestamp.valueOf("2024-05-13 12:00:00.0")
    ]
    delegator.create("PartyContactMech", partyContactMechMap)

    println("------------------PartyContactMech-------------" + partyContactMechMap)

    GenericValue partyContactMechPurpose = delegator.makeValue("PartyContactMechPurpose")
    Map<String,Object> partyContactMechPurposeMap = [
            partyId : partyId,
            contactMechId: contactMechId,
            contactMechPurposeTypeId : "PRIMARY_EMAIL",
            fromDate : Timestamp.valueOf("2024-05-13 12:00:00.0")
    ]

    delegator.create("PartyContactMechPurpose", partyContactMechPurposeMap)

    println("-------------------PartyContactMechPurpose------------" + partyContactMechPurposeMap)

    result.put("partyId",partyId)


    println("--------------------result------------------" + result)

//        conditionList.add(EntityCondition.makeCondition("ContactMechPurposeTypeId", EntityOperator.EQUALS, "PRIMARY_EMAIL"))

    return result
