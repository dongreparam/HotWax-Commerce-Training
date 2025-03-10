<#if requestAttributes.uiLabelMap??>
<#assign uiLabelMap = requestAttributes.uiLabelMap>
</#if>

<center>
<div class="screenlet dashboard-screenlet"
     style="background: linear-gradient(135deg, #6a11cb, #2575fc);
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.5);
            color: black;
            max-width: 650px;
            text-align: center;
            font-family: 'Poppins', sans-serif;
            animation: fadeIn 1s ease-in-out;">

    <div class="screenlet-title-bar"
         style="font-size: 32px;
                font-weight: bold;
                margin-bottom: 25px;
                color: black;">
      👋 Welcome, ${parameters.firstName!"Customer"}!
    </div>

    <div class="screenlet-body">
      <p style="font-size: 22px;
                font-weight: bold;
                background: -webkit-linear-gradient(45deg, #ff9f43, #ff6b6b);
                -webkit-background-clip: text;
                -webkit-text-fill-color: black;">
        Your Personal Dashboard
      </p>

      <p style="font-size: 18px; color: black; font-weight: bold;">
        ID: <strong>${parameters.partyId!"Not Available"}</strong>
      </p>

      <p style="font-size: 16px; color: black; margin-top: 15px;">
        Stay updated with your latest activity and updates.
      </p>
    </div>
  </div>
</center>

<style>
  @keyframes fadeIn {
from { opacity: 0; transform: translateY(-20px); }
    to { opacity: 1; transform: translateY(0); }
  }
</style>