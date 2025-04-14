<#if requestAttributes.uiLabelMap??>
<#assign uiLabelMap = requestAttributes.uiLabelMap>
</#if>

<center>
<div class="screenlet success-screenlet"
       style="background: linear-gradient(135deg, #55efc4, #00cec9);
              padding: 30px;
              border-radius: 12px;
              box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3);
              color: white;
              max-width: 500px;
              text-align: center;
              animation: fadeIn 1s ease-in-out;">

    <div class="screenlet-title-bar"
         style="font-size: 30px;
                font-weight: bold;
                margin-bottom: 20px;">
      🎉 Congratulations, ${parameters.firstName!"Awesome User"}! 🎊
    </div>

    <div class="screenlet-body">
      <p style="font-size: 20px;
                font-weight: bold;
                background: -webkit-linear-gradient(45deg, #ff9f43, #ff6b6b);
                -webkit-background-clip: text;
                -webkit-text-fill-color: transparent;">
        ${parameters.firstName!"Valued Customer"}
      </p>

      <p style="font-size: 18px; color: black;">
        Your unique ID: <strong>${parameters.partyId!"Not Available"}</strong>
      </p>

      <p style="font-size: 18px; color: black; font-weight: bold;">
        Your profile has been successfully created! 🚀
      </p>

      <p style="font-size: 16px; color: black;">
        Welcome to our family! We are thrilled to have you onboard. 🎈🎈
      </p>

      <p style="font-size: 14px; color: black; font-style: italic;">
        "A new journey begins! Let’s make it amazing together."
      </p>

      <div style="margin-top: 25px;">
        <a href="<@ofbizUrl>customerDashboard</@ofbizUrl>"
           style="background: #ff9f43;
                  color: white;
                  font-size: 17px;
                  font-weight: bold;
                  padding: 14px 28px;
                  border-radius: 8px;
                  text-decoration: none;
                  cursor: pointer;
                  display: inline-block;
                  transition: background 0.3s;">
          🎯 Go to Dashboard
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
