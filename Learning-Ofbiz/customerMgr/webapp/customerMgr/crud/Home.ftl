<#if requestAttributes.uiLabelMap??>
<#assign uiLabelMap = requestAttributes.uiLabelMap>
</#if>

<center>
<div class="screenlet home-screenlet"
       style="background: linear-gradient(135deg, #6c5ce7, #a29bfe);
              padding: 40px;
              border-radius: 12px;
              box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3);
              color: black;
              max-width: 600px;
              text-align: center;
              animation: fadeIn 1s ease-in-out;">

    <div class="screenlet-title-bar"
         style="font-size: 32px;
                font-weight: bold;
                margin-bottom: 20px;">
      🏠 Welcome to Customer Management
    </div>

    <div class="screenlet-body">
      <p style="font-size: 20px; font-weight: bold;">
        Manage your customers with ease.
      </p>

      <p style="font-size: 16px;">
        Use the options below to create a new customer or access your dashboard.
      </p>

      <div style="margin-top: 30px; display: flex; justify-content: center; gap: 15px;">

        <!-- Button to Create a New Customer -->
        <a href="<@ofbizUrl>CreateCustomer</@ofbizUrl>"
           style="background: #00b894;
                  color: white;
                  font-size: 17px;
                  font-weight: bold;
                  padding: 14px 28px;
                  border-radius: 8px;
                  text-decoration: none;
                  cursor: pointer;
                  display: inline-block;
                  transition: background 0.3s;">
          ➕ Create Customer
        </a>

        <!-- Button to View Customer Dashboard -->
        <a href="<@ofbizUrl>customerDashboard</@ofbizUrl>"
           style="background: #fdcb6e;
                  color: black;
                  font-size: 17px;
                  font-weight: bold;
                  padding: 14px 28px;
                  border-radius: 8px;
                  text-decoration: none;
                  cursor: pointer;
                  display: inline-block;
                  transition: background 0.3s;">
          📊 View Dashboard
        </a>

      </div>
    </div>
  </div>
</center>

<style>
  @keyframes fadeIn {
from { opacity: 0; transform: translateY(-20px); }
    to { opacity: 1; transform: translateY(0); }
  }
</style>
