package com.meepcraft.backbone.api.request;

import org.json.JSONException;
import org.json.JSONObject;

import com.calebpower.bonemesh.listener.DataListener;
import com.calebpower.bonemesh.message.GenericMessage;

public abstract class RequestListener implements DataListener {
  
  private String[] scopes = null;
  
  public RequestListener(String... scopes) {
    this.scopes = scopes;
  }
  
  @Override public void digest(JSONObject message) {
    if(GenericMessage.isImplementedBy(message)) try {
      JSONObject payload = message.getJSONObject("payload");
      String scope = payload.getString("scopes");
      boolean act = false;
      if(this.scopes == null) act = true;
      else {
        for(String s : scopes)
          if(scope.equalsIgnoreCase(s)) {
            act = true;
            break;
          }
      }
      if(act) {
        String action = payload.getString("action");
        carryOutRequest(scope, action, payload);
      }
    } catch(JSONException e) { }
  }
  
  public abstract void carryOutRequest(String scope, String action, JSONObject payload) throws JSONException;

}
