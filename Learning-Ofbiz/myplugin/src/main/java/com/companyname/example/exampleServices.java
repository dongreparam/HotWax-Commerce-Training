package com.companyname.example;

import java.util.Map;
import org.apache.ofbiz.base.util.Debug;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.service.ServiceUtil;
import org.apache.ofbiz.entity.util.EntityUtil;
import org.apache.ofbiz.base.util.UtilMisc;
import org.apache.ofbiz.entity.condition.EntityCondition;
import org.apache.ofbiz.entity.GenericValue;


// OFBiz Base Utilities
import org.apache.ofbiz.base.util.UtilDateTime;
import org.apache.ofbiz.base.util.UtilProperties;
import org.apache.ofbiz.base.util.UtilValidate;

// OFBiz Entity Utilities
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.util.EntityQuery;

// OFBiz Service Utilities
import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ServiceUtil;


public class exampleServices {

    public static final String MODULE = exampleServices.class.getName();


    public static Map<String, Object> createExampleEntry(DispatchContext dctx, Map<String, ? extends Object> context) {
        Map<String, Object> result = ServiceUtil.returnSuccess();

        Delegator delegator = dctx.getDelegator();

        try {
            GenericValue example = delegator.makeValue("Example");
            // generate auto primary key
            example.setNextSeqId();
            // generating nonPK entries
            example.setNonPKFields(context);
            example = delegator.create(example);
            Debug.log(result + "Result Before -----------------------");
            result.put("exampleId", example.getString("exampleId"));

            Debug.log("====This is my first Java Service implementation in Apache OFBiz. " +
                    "example record created successfully with exampleId:"
                    + example.getString("exampleId"));
            Debug.log(result + "Result After -----------------------");

        } catch (GenericEntityException e) {
            Debug.logError(e, MODULE);
            return ServiceUtil.returnError("Error in creating record in Example entity ........" + MODULE);
        }
        return result;
    }

    public static Map<String, Object> updateExampleEntry(DispatchContext dctx, Map<String, ? extends Object> context) {
        Map<String, Object> result = ServiceUtil.returnSuccess();
        Delegator delegator = dctx.getDelegator();

        String exampleId = (String) context.get("exampleId");

        try {
            // Fetch the existing record by primary key
            GenericValue example = delegator.findOne("Example", UtilMisc.toMap("exampleId", exampleId), false);

            if (example == null) {
                return ServiceUtil.returnError("Example record not found for exampleId: " + exampleId);
            }

            // Update fields based on input
            example.setNonPKFields(context);
            example.store();

            // Explicitly define output parameters
            result.put("exampleId", exampleId);
            result.put("updatedFields", example.getAllFields());


            Debug.log("==== Example record updated successfully for exampleId: " + exampleId);
        } catch (GenericEntityException e) {
            Debug.logError(e, MODULE);
            return ServiceUtil.returnError("Error updating record in Example entity: " + MODULE);
        }
        return result;
    }

    public static Map<String, Object> createUpdateExampleEntry(DispatchContext dctx, Map<String, ? extends Object> context){
        Map<String, Object> result = ServiceUtil.returnSuccess();
        Delegator delegator = dctx.getDelegator();

        String exampleId = (String) context.get("exampleId");

      try {
          GenericValue example = EntityQuery.use(delegator).from("Example").where("exampleId",exampleId).queryOne();
          if (example==null){
              example = delegator.makeValue("Example");
              example.setNonPKFields(context);
              example.set("exampleId",exampleId);
              example.create();
          }
          else {
              example.setNonPKFields(context);
              example.store();
          }
      }
      catch (GenericEntityException e){
          Debug.logError(e, MODULE);
          return ServiceUtil.returnError("Error Updating record in Example entity");
      }
        result.put("exampleId", exampleId);
        return result;

    }
}
