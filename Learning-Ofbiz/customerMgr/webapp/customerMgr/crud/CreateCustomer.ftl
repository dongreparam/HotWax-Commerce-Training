<#if requestAttributes.uiLabelMap??>
<#assign uiLabelMap = requestAttributes.uiLabelMap>
</#if>

<center>
<div class="screenlet signup-screenlet" style="background: linear-gradient(135deg, #f3a683, #786fa6); padding: 20px; border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2); color: white; max-width: 400px;">
    <div class="screenlet-title-bar" style="text-align: center; font-size: 24px; font-weight: bold; margin-bottom: 20px;">
      🌟 Welcome! Sign Up as a Customer 🌟
    </div>
    <div class="screenlet-body">
      <form method="post" action="<@ofbizUrl>createCustomer</@ofbizUrl>" name="CustomerLoginForm">
        <table class="basic-table" cellspacing="0" style="width: 100%;">
          <tr>
            <td class="label" style="padding: 10px;">First Name</td>
            <td><input type="text" name="firstName" required size="20" style="padding: 8px; border-radius: 5px; border: none; width: 100%;"/></td>
          </tr>
          <tr>
            <td class="label" style="padding: 10px;">Last Name</td>
            <td><input type="text" name="lastName" required size="20" style="padding: 8px; border-radius: 5px; border: none; width: 100%;"/></td>
          </tr>
          <tr>
            <td class="label" style="padding: 10px;">Email</td>
            <td><input type="email" name="email" required size="20" style="padding: 8px; border-radius: 5px; border: none; width: 100%;"/></td>
          </tr>
          <tr>
            <td colspan="2" align="center" style="padding-top: 20px;">
              <input type="submit" value="🚀 Continue! " style="background: #ff4757; color: white; font-size: 16px; font-weight: bold; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;"/>
            </td>
          </tr>
        </table>
      </form>
    </div>
  </div>
</center>
