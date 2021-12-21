package com.thinking.machines.network.server;
import com.thinking.machines.network.common.*;
import com.thinking.machines.network.common.execptions.*;
public class NetworkServer {
  private RequestHanderInterface requestHandler;
  public NetworkServer(RequestHanderInterface requestHandler) throws NetworkException{
   if(requestHandler==null)
   throw new NetworkException("Request Handler Missing");
   this.requestHandler=requestHandler;
  }

  public void start(){
   
  }
}
