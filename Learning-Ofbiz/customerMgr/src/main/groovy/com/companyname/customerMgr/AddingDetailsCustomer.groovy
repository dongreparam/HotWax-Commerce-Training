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

import java.sql.Time
import java.sql.Timestamp;
import java.lang.Object



Map<String, Object> result = ServiceUtil.returnSuccess()
String address = (String) parameters.get("address")
String phoneNumber = (String) parameters.get("phoneNumber")
String city = (String) parameters.get("city")
String partyId = (String) parameters.get("partyId")


GenericValue contactMechA = delegator.makeValue("ContactMech")
contactMechA.setNextSeqId()
String contactMechIdA = contactMechA.getString("contactMechId")

Map<String,Object> contactMechMapA = [
        contactMechId : contactMechIdA,
        contactMechTypeId : "POSTAL_ADDRESS"
]

delegator.create("ContactMech",contactMechMapA)

println("------------------context--------------" + context)
println("------------------parameters--------------" + parameters)
println("----------------partyId----------------" + partyId)

GenericValue person = EntityQuery.use(delegator).from("Person").where("partyId",partyId).queryOne()
String firstName = (String) person.get("firstName")

GenericValue postalAddress = delegator.makeValue("PostalAddress")
Map<String, Object> postalAddressMap = [
        contactMechId: contactMechIdA,
        toName : firstName,
        address1 : address,
        city : city
]

delegator.create("PostalAddress",postalAddressMap)

println("------------------postalAddressMap---------------"+ postalAddressMap)

GenericValue contactMechT = delegator.makeValue("ContactMech")
contactMechT.setNextSeqId()
String contactMechIdT = contactMechT.getString("contactMechId")

Map<String,Object> contactMechMapT = [
        contactMechId : contactMechIdT,
        contactMechTypeId : "TELECOM_NUMBER"
]

delegator.create("ContactMech",contactMechMapT)



GenericValue telecomNumber = delegator.makeValue("TelecomNumber")
Map<String, Object> telecomNumberMap = [
        contactMechId: contactMechIdT,
        contactNumber : phoneNumber
]

delegator.create("TelecomNumber",telecomNumberMap)

println("------------------telecomNumber-------------" + telecomNumberMap)


GenericValue partyContactMechA = delegator.makeValue("PartyContactMech")
Map<String,Object> partyContactMechMapA = [
        partyId : partyId,
        contactMechId: contactMechIdA,
        roleTypeId: "CUSTOMER",
        fromDate : Timestamp.valueOf("2024-05-13 12:00:00.0")
]
delegator.create("PartyContactMech", partyContactMechMapA)

println("------------------PartyContactMech-------------" + partyContactMechMapA)



GenericValue partyContactMechT = delegator.makeValue("PartyContactMech")
Map<String,Object> partyContactMechMapT = [
        partyId : partyId,
        contactMechId: contactMechIdT,
        roleTypeId: "CUSTOMER",
        fromDate : Timestamp.valueOf("2024-05-13 12:00:00.0")
]
delegator.create("PartyContactMech", partyContactMechMapT)

println("------------------result---------------------" + result)
println(firstName)

result.put("firstName",firstName)
println("------------------result---------------------" + result)

println("------------------PartyContactMech-------------" + partyContactMechMapT)


return result