package com.unj.dubbotest.filter;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.common.json.JSONObject;
import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.RpcResult;

public class RestValidateFilter implements Filter {
    Logger logger= LoggerFactory.getLogger(RestValidateFilter.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
   
        return getRpcResult(invoker,invocation,null);
    }

    public Result getRpcResult(Invoker<?> invoker,Invocation invocation,JSONObject result){
        if(invoker==null){
            return  new RpcResult(Response.status(401).build());
        }else{
            return invoker.invoke(invocation);
        }
    }
}