<#if requestAttributes.uiLabelMap??>
<#assign uiLabelMap = requestAttributes.uiLabelMap>
</#if>

<center>
<div class="screenlet signup-screenlet"
       style="background: linear-gradient(135deg, #ff9f43, #ff6b6b);
              padding: 30px;
              border-radius: 15px;
              box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3);
              color: white;
              max-width: 450px;
              text-align: center;
              animation: fadeIn 1s ease-in-out;">

    <div class="screenlet-title-bar"
         style="font-size: 28px;
                font-weight: bold;
                margin-bottom: 20px;">
      🌟 Welcome Aboard! 🌟
      <p style="font-size: 16px; font-weight: normal;">Join us and explore a world of possibilities.</p>
    </div>

    <div class="screenlet-body">
      <form method="post" action="<@ofbizUrl>createCustomer</@ofbizUrl>" name="CustomerLoginForm">
        <table class="basic-table" cellspacing="0" style="width: 100%;">
          <tr>
            <td class="label" style="padding: 12px; text-align: left; font-weight: bold;">First Name</td>
            <td>
              <input type="text" name="firstName" required size="20"
                     style="padding: 10px; border-radius: 8px; border: 1px solid #ddd; width: 100%;"/>
            </td>
          </tr>
          <tr>
            <td class="label" style="padding: 12px; text-align: left; font-weight: bold;">Last Name</td>
            <td>
              <input type="text" name="lastName" required size="20"
                     style="padding: 10px; border-radius: 8px; border: 1px solid #ddd; width: 100%;"/>
            </td>
          </tr>
          <tr>
            <td class="label" style="padding: 12px; text-align: left; font-weight: bold;">Email</td>
            <td>
              <input type="email" name="email" required size="20"
                     style="padding: 10px; border-radius: 8px; border: 1px solid #ddd; width: 100%;"/>
            </td>
          </tr>
          <tr>
            <td colspan="2" align="center" style="padding-top: 25px;">
              <input type="submit" value="🚀 Get Started!"
                     style="background: #1dd1a1;
                            color: white;
                            font-size: 18px;
                            font-weight: bold;
                            padding: 12px 30px;
                            border: none;
                            border-radius: 8px;
                            cursor: pointer;
                            transition: background 0.3s ease-in-out;"
                     onmouseover="this.style.background='#10ac84'"
                     onmouseout="this.style.background='#1dd1a1'"/>
            </td>
          </tr>
        </table>
      </form>
    </div>
  </div>
</center>

<style>
  @keyframes fadeIn {
from { opacity: 0; transform: translateY(-20px); }
    to { opacity: 1; transform: translateY(0); }
  }
</style>
