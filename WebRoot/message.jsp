<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>   
    <body>   
      <!-- fielderror -->   
     <s:if test="hasFieldErrors()">   
         <s:iterator value="fieldErrors">   
             <s:iterator value="value" status="statu">   
                <!-- field的错误消息是List 因此还需要迭代一次 -->        
                 <s:set name="index" value="#statu.index"/>   
                 <s:set name="msg" value="#msg==null?value.get(#request.index).toString()+'\\\n':#msg+   
                 value.get(#request.index).toString()+'\\\n'"/><!-- 关键代码 -->   
              </s:iterator>   
         </s:iterator>   
     </s:if>   
  
     <!-- actionerror -->   
     <s:if test="hasActionErrors()">   
         <s:iterator value="actionErrors">   
                <script   language="JavaScript">   
                 alert("<s:property escape="false"/>");   
                </script>   
             </s:iterator>   
     </s:if>   
  
     <!-- actionmessage -->   
     <s:if test="hasActionMessages()">   
         <s:iterator value="actionMessages">   
             <script language="JavaScript">   
                 alert("<s:property escape="false"/>");   
             </script>   
         </s:iterator>   
      </s:if>   
  
  	 <!-- 打印转换好格式的fielderror信息 -->   
     <s:if test="#msg.length()>0">   
         <script language="JavaScript">   
             alert("<s:property escape="false" value="#msg"/>");   
         </script>   
     </s:if>   
     </body>   
</html>  