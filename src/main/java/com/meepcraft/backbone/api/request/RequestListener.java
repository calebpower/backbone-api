package com.meepcraft.backbone.api.request;

import org.json.JSONException;
import org.json.JSONObject;

import com.axonibyte.bonemesh.listener.DataListener;
import com.axonibyte.bonemesh.message.GenericMessage;

/**
 * Listens for requests to be transmitted.
 * 
 * @author Caleb L. Power
 */
public abstract class RequestListener implements DataListener {
  
  private String[] scopes = null;
  
  /**
   * Overloaded constructor to filter by one or more scopes.
   * 
   * @param scopes the scopes to filter for
   */
  public RequestListener(String... scopes) {
    this.scopes = scopes;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override public void digest(JSONObject message) {
    if(GenericMessage.isImplementedBy(message)) try {
      JSONObject payload = message.getJSONObject("payload");
      String scope = payload.getString("scope");
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
  
  /**
   * Carries out a request that was received (and not filtered out).
   * 
   * @param scope the scope
   * @param action the action
   * @param payload the payload
   * @throws JSONException to be thrown if the payload can't be parsed
   */
  public abstract void carryOutRequest(String scope, String action, JSONObject payload) throws JSONException;

}
