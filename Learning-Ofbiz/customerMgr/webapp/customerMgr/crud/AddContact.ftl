<#if requestAttributes.uiLabelMap??>
<#assign uiLabelMap = requestAttributes.uiLabelMap>
</#if>

<center>
<div class="screenlet contact-screenlet" style="background: linear-gradient(135deg, #74b9ff, #a29bfe); padding: 20px; border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2); color: white; max-width: 400px;">
    <div class="screenlet-title-bar" style="text-align: center; font-size: 24px; font-weight: bold; margin-bottom: 20px;">
      📞 Contact Information 📍
    </div>
    <div class="screenlet-body">
      <form method="post" action="<@ofbizUrl>submitContactInfo</@ofbizUrl>" name="ContactInfoForm">
        <table class="basic-table" cellspacing="0" style="width: 100%;">
          <tr>
            <td class="label" style="padding: 10px;">Phone Number</td>
            <td><input type="tel" name="phoneNumber" required size="20" style="padding: 8px; border-radius: 5px; border: none; width: 100%;"/></td>
          </tr>
          <tr>
            <td class="label" style="padding: 10px;">Address</td>
            <td><textarea name="address" required rows="3" style="padding: 8px; border-radius: 5px; border: none; width: 100%;"></textarea></td>
          </tr>
          <tr>
            <td class="label" style="padding: 10px;">City</td>
            <td><input type="text" name="city" required size="20" style="padding: 8px; border-radius: 5px; border: none; width: 100%;"/></td>
          </tr>
          <tr>
            <td colspan="2" align="center" style="padding-top: 20px;">
              <input type="submit" value="✅ Submit " style="background: #ff4757; color: white; font-size: 16px; font-weight: bold; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;"/>
            </td>
          </tr>
        </table>
      </form>
    </div>
  </div>
</center>